package util;

import model.Product;
import java.util.ArrayList;


public class PrintData{
    public static void printItems(ArrayList<Product> items){
        System.out.println("ID\tName\tQuantity\tImport Price\tExport Price");
        for (Product item : items){
            System.out.println(item.id + "\t" + item.name + "\t" + item.quantity+ "\t\t" + item.importPrice+ "\t\t" + item.exportPrice);
        }
    }
}