package com.itheima.javaBean;

public class Goods
{

    private int id;
    private double price;
    private String name ;
    private int buyNumber;

    public Goods() {
    }

    public Goods(int id, double price, String name, int buyNumber) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.buyNumber = buyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}
