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
        data.addItem("Apple",10);
        data.addItem("Apple",9);
        data.addItem("Apple",8);
    }

    private void adding(){
        System.out.println("Please Input the name and quantity of product");
        String name;
        int value;
        System.out.print("Name >>");
        name = sc.next();
        System.out.print("Quantity >>");
        value = sc.nextInt();
        data.addItem(name,value);
    }

    private void deleting(){
        System.out.println("Please Input the ID of product");
        int value;
        System.out.print("ID >>");
        value = sc.nextInt();
        data.deleteItem(value);
    }

    public void start(){
        demoAdd();
        int choice;
        do {
            System.out.println("\nWelcome Admin");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Delete Products");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\nAdding Product...");
                    adding();
                    viewProducts();
                    break;
                case 2:
                    System.out.println("\n--- View Products ---");
                    viewProducts();
                    break;
                case 3:
                    System.out.println("\n--- Delete Products ---");
                    viewProducts();
                    deleting();
                    viewProducts();
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