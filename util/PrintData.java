package util;

import model.Makeitem;
import java.util.ArrayList;


public class PrintData{
    public static void printItems(ArrayList<Makeitem> items){
        System.out.println("ID\tName\tPrice");
        for (Makeitem item : items){
            System.out.println(item.id + "\t" + item.name + "\t" + item.quantity);
        }
    }
}