package com.furnico.search.elasticSearchFurnico.services.Impl;

import com.furnico.search.elasticSearchFurnico.entity.Product;
import com.furnico.search.elasticSearchFurnico.repository.ProductRepository;
import com.furnico.search.elasticSearchFurnico.services.ElasticSearchService;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {
    @Autowired
    ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    ProductRepository productRepository;
//
    @Override
    public ArrayList<Product> getAll(String text) {
        QueryBuilder queryBuilder = QueryBuilders.boolQuery().should(QueryBuilders.queryStringQuery(text)
                .lenient(true).field("keywords").field("color").field("name"))
                .should(QueryBuilders.queryStringQuery("*" + text + "*")
                        .lenient(true).field("keywords").field("color").field("name"));
        NativeSearchQuery nativeSearchQuery= new NativeSearchQueryBuilder().withQuery(queryBuilder).build();
        //System.out.println(nativeSearchQuery.getQuery());
        List<Product> productList = elasticsearchRestTemplate.queryForList(nativeSearchQuery, Product.class, IndexCoordinates.of("product"));
        ArrayList<Product> productArrayList = new ArrayList<>();
        productList.forEach(productArrayList::add);
        return productArrayList;
    }

    @Override
    public void save(Product product){
        productRepository.save(product);
    }

    @Override
    public ArrayList<Product> findAll(){
        Iterable<Product> products= productRepository.findAll();
        ArrayList<Product> productList = new ArrayList<>();
        products.forEach(productList::add);
        return productList;
    }

}
