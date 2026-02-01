package model;

public class Product{
    public int id;
    public String category;
    public String name;
    public int quantity;
    public double importPrice;
    public int importDate;
    public double exportPrice;
    public int expiredDate;


    public Product(int id,String category,String name,int quantity,double importPrice,int importDate,double exportPrice,int expiredDate){
        this.id=id;
        this.category=category;
        this.name=name;
        this.quantity=quantity;
        this.importPrice=importPrice;
        this.importDate=importDate;
        this.exportPrice=exportPrice;
        this.expiredDate=expiredDate;
    }
}