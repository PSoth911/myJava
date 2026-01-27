package model;

public class Makeitem{
    public int id;
    public String name;
    public int quantity;
    public double importPrice;
    public double exportPrice;


    public Makeitem(int id,String name,int quantity,double importPrice,double exportPrice){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.importPrice=importPrice;
        this.exportPrice=exportPrice;
    }
}