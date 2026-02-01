package model;

public class Product{
    public int id;
    public String category;
    public String name;
    public int quantity;
    public double importPrice;
    public double importDate;
    public double exportPrice;
    public double exportDate;


    public Product(String name,int quantity,double importPrice,double exportPrice){
        this.name=name;
        this.quantity=quantity;
        this.importPrice=importPrice;
        this.exportPrice=exportPrice;
    }
}