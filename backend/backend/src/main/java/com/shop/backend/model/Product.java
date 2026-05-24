package com.shop.backend.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private double price;
    private String category;
    private String imageUrl;

    // -----------------------------------
    public Product() {
    }

    // ----------------------------------
    public Product(long id, String title, double price, String category, String imageUrl) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    // -----------------------------------
    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // -------------------------
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    // -----------------------------

}
