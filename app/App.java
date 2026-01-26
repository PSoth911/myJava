package app;

import services.Admin;
import services.Staff;
import java.util.Scanner;


public class App{
    Scanner sc = new Scanner(System.in);
    void run(){
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
                Admin admin = new Admin();
                admin.start();
            }else if(choice==2){
                Staff staff = new Staff();
                staff.start();
            }else{
                System.out.println("Exit");
                return;
            }

        } while (choice!=0);

    }
}