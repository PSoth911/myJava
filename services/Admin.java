package services;

import java.util.Scanner;
import java.util.ArrayList;
import data.InsertData;
import model.Makeitem;
import util.PrintData;


public class Admin{
    private InsertData data = new InsertData();
    private final int password = 12345;
    Scanner sc = new Scanner(System.in);

    public boolean login(int inputPassword) {
        return inputPassword == password;
    } 

    private void viewProducts() {
        ArrayList<Makeitem> items = data.getItems();
        PrintData.printItems(items);
    }

    private void demoAdd(){
        data.addItem("Apple",10,2,3);
        data.addItem("Apple",9,4,2);
        data.addItem("Apple",8,3,6);
    }

    private void adding(){
        System.out.println("Please Input the name and quantity of product");
        String name;
        int value;
        int imp;
        int exp;
        System.out.print("Name >>");
        name = sc.next();
        System.out.print("Quantity >>");
        value = sc.nextInt();
        System.out.print("Import Price >>");
        imp = sc.nextInt();
        System.out.print("Export Price >>");
        exp = sc.nextInt();
        data.addItem(name,value,imp,exp);
    }

    private void deleting(){
        System.out.println("Please Input the ID of product");
        int value;
        System.out.print("ID >>");
        value = sc.nextInt();
        data.deleteItem(value);
    }

    private void increasing(){
        System.out.println("Please Input the ID and Increase value");
        int value;
        int inc;
        System.out.print("ID >>");
        value = sc.nextInt();
        System.out.print("Increase value >>");
        inc = sc.nextInt();
        data.increaseItem(value,inc);
    }

    private void decreasing(){
        System.out.println("Please Input the ID and Decrease value");
        int value;
        int dec;
        System.out.print("ID >>");
        value = sc.nextInt();
        System.out.print("Decrease value >>");
        dec = sc.nextInt();
        data.decreaseItem(value,dec);
    }

    private void updateStock(){
        int choice;
        do{
            System.out.println(">>>");
            System.out.println("1. Add New Item");
            System.out.println("2. Increase Item's Quantity");
            System.out.println("3. Decrease Item's Quantity");
            System.out.println("4. Delete Item");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\n Add New Item");
                    adding();
                    viewProducts();
                    break;  
                case 2:
                    System.out.println("\n Increase Item's Quantity");
                    increasing();
                    viewProducts();
                    break;  
                case 3:    
                    System.out.println("\n Decrease Item's Quantity");
                    decreasing();
                    viewProducts();
                    break; 
                case 4:
                    System.out.println("\n Delete Item");
                    deleting();
                    viewProducts();
                    break; 
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice!=0);

    }

    public void start(){
        demoAdd();
        int choice;
        System.out.println("\nWelcome Admin\n");
        do {
            System.out.println(">>>");
            System.out.println("1. Check Current Stock");
            System.out.println("2. Update stock");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\n--- Check Current Stock ---");
                    viewProducts();
                    break;  
                case 2:
                    System.out.println("\nUpdate stock");
                    updateStock();
                    break;
                case 0:
                    break;
             default:
                    System.out.println("Invalid option! Please choose 0-3.");
            }
            System.out.println();
        
        } while (choice!=0);
    }
}