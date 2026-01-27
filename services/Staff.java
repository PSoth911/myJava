package services;

import java.util.ArrayList;
import java.util.Scanner;
import data.InsertData;
import model.Makeitem;
import util.PrintData;

public class Staff {
     private void sellItem() {
        System.out.print("Enter item name to sell: ");
        String name = sc.next();
        ArrayList<Makeitem> items = data.getItems();
        boolean found = false;

        for (Makeitem item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                found = true;
                System.out.print("Enter quantity to sell: ");
                int qty = sc.nextInt();

                if (qty <= item.quantity) {
                    item.quantity -= qty;
                    double totalPrice = qty * item.exportPrice;
                    System.out.println("Sold " + qty + " " + item.name + "(s). Total: $" + totalPrice);
                } else {
                    System.out.println("Not enough stock! Current stock: " + item.quantity);
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    Scanner sc = new Scanner(System.in);
    private InsertData data;
    public Staff(InsertData data){
        this.data=data;
    }
    private void viewProducts() {
        ArrayList<Makeitem> items = data.getItems();
        PrintData.printItems(items);
    }
    public void start() {
        int choice;
        do {
            System.out.println(">>>");
            System.out.println("1. View Items");
            System.out.println("2. Sell Items");
            System.out.println("3. Update Stock");
            System.out.println("4. View Receipt");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n================= Current Stock ====================");
                    viewProducts();
                    break;
                case 2:
                    sellItem();
                    
                    
                    
                    break;
                default:
                    System.out.println("Invalid option! Please choose 0-4.");
                    break;
            }
            System.out.println();

        } while (choice != 0);
    }
}
