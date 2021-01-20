package com.furnico.search.elasticSearchFurnico.services;

import com.furnico.search.elasticSearchFurnico.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface ElasticSearchService {

    List<Product> getAll(String text);

    void save(Product product);

    ArrayList<Product> findAll();
}
