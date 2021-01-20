package com.furnico.search.elasticSearchFurnico.repository;

import com.furnico.search.elasticSearchFurnico.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {
}
