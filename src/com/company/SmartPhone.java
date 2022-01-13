package com.company;

public class SmartPhone implements Product {

private String brand;
private  String model;
private int year;
private  String color;
private double price;



    public SmartPhone(String brand, String model, int year,String color,double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;


    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getName() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
         if (this.price > o.getPrice()){
             return 1;

         } else if (this.price < o.getPrice()){
             return -1;
         }
         return 0;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
