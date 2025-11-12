package com.xworkz.wrapClassTwo.dto;

public class ProductDto {
    private int id;
    private long series;
    private float rating;
    private double price;
    private boolean isAvailable;
    private char type;
    private Integer productId;
    private Long productSeries;
    private Float productRating;
    private Double productPrice;
    private Boolean productIsAvailable;
    private Character productType;

    public void setId(int id) {
        this.id = id;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductSeries(Long productSeries) {
        this.productSeries = productSeries;
    }

    public void setProductRating(Float productRating) {
        this.productRating = productRating;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductIsAvailable(Boolean productIsAvailable) {
        this.productIsAvailable = productIsAvailable;
    }

    public void setProductType(Character productType) {
        this.productType = productType;
    }


    public int getId() {
        return id;
    }

    public long getSeries() {
        return series;
    }

    public float getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public char getType() {
        return type;
    }

    public Integer getProductId() {
        return productId;
    }

    public Long getProductSeries() {
        return productSeries;
    }

    public Float getProductRating() {
        return productRating;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Boolean getProductIsAvailable() {
        return productIsAvailable;
    }

    public Character getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", series=" + series +
                ", rating=" + rating +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", type=" + type +
                ", productId=" + productId +
                ", productSeries=" + productSeries +
                ", productRating=" + productRating +
                ", productPrice=" + productPrice +
                ", productIsAvailable=" + productIsAvailable +
                ", productType=" + productType +
                '}';
    }



}
