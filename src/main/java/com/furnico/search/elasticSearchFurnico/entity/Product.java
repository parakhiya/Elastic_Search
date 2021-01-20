package com.furnico.search.elasticSearchFurnico.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
public class Product {

    @Id
    private int id;
    private String name;
    private int category;
    private String color;
    private int dimensions;
    private int warrantyPeriod;
    private String image;
    private String description;
    private String keywords;
    private int bestPrice;
    private int rating;
    private int rated;

    public Product(){}

    public Product(int id, String name, int category, String color, int dimensions, int warrantyPeriod, String description, String keywords, int bestPrice,String image) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.dimensions = dimensions;
        this.warrantyPeriod = warrantyPeriod;
        this.image = image;
        this.description = description;
        this.keywords = keywords;
        this.bestPrice = bestPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRated() {
        return rated;
    }

    public void setRated(int rated) {
        this.rated = rated;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(int bestPrice) {
        this.bestPrice = bestPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}




