package services;

import java.util.Scanner;
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
        Makeitem[] items = data.getItems();
        PrintData.printItems(items);
    }

    public void start(){
        int choice;
        do {
            System.out.println("\nWelcome Admin");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\nAdding Product...");
                
                    break;
                case 2:
                    System.out.println("\n--- View Products ---");
                    viewProducts();
                    break;
                case 0:
                
                    break;
             default:
                    System.out.println("Invalid option! Please choose 0-2.");
            }
            System.out.println();
        
        } while (choice!=0);
    }
}