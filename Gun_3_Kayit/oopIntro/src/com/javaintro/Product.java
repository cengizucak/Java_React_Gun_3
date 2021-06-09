package com.javaintro;

public class Product {

    private int id;
    private String name;
    private double unitPrise;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product() {
    }

    public Product(int id, String name, double unitPrise, String detail, double discount) {
        this.id = id;
        this.name = name;
        this.unitPrise = unitPrise;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrise() {
        return unitPrise;
    }

    public void setUnitPrise(double unitPrise) {
        this.unitPrise = unitPrise;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrise-( this.unitPrise * this.discount / 100);
    }


}
