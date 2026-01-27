package app;

import services.Admin;
import services.Staff;
import data.InsertData;
import java.util.Scanner;


public class App{
    Scanner sc = new Scanner(System.in);
    public InsertData data = new InsertData();
    public void demoAdd(){
        data.addItem("Apple",10,2,3);
        data.addItem("Apple",9,4,2);
        data.addItem("Apple",8,3,6);
    }
    void run(){
        demoAdd();
        int choice;
        do {
            System.out.println("=============Welcome To Stock Management System==============");
            System.out.println("    1.Admin");
            System.out.println("    2.Staff");
            System.out.println("    0.Exit");
            System.out.println("==============================================================");
            System.out.print("Please Enter an option To continue (0-2): ");
            choice = sc.nextInt();
            if (choice==1){
                Admin admin = new Admin(data);
                admin.start();
            }else if(choice==2){
                Staff staff = new Staff(data);
                staff.start();
            }else{
                System.out.println("Exit");
                return;
            }

        } while (choice!=0);

    }
}