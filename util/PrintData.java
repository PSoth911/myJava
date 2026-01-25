package util;

import model.MakeItem;

public class PrintData{
    public static void printItems(MakeItem[] items){
        for (MakeItem item : items){
            System.out.println(item.id + "\t" + item.name + "\t" + item.quantity);
        }
    }
}