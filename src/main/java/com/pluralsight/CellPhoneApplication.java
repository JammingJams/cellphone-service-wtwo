package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CellPhone userPhone = new CellPhone(); {
        }

        System.out.print("What is your serial number? ");
        userPhone.setSerialNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("What is the model of your phone? ");
        userPhone.setModel(sc.nextLine());

        System.out.print("Who is your phone carrier? ");
        userPhone.setCarrier(sc.nextLine());

        System.out.print("What is your phone number? ");
        userPhone.setPhoneNumber(sc.nextLine());

        System.out.print("Who is the owner of this phone? ");
        userPhone.setUserName(sc.nextLine());

        CellPhone userPhone2 = new CellPhone(); {
        }

        System.out.print("What is your serial number? ");
        userPhone2.setSerialNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("What is the model of your phone? ");
        userPhone2.setModel(sc.nextLine());

        System.out.print("Who is your phone carrier? ");
        userPhone2.setCarrier(sc.nextLine());

        System.out.print("What is your phone number? ");
        userPhone2.setPhoneNumber(sc.nextLine());

        System.out.print("Who is the owner of this phone? ");
        userPhone2.setUserName(sc.nextLine());


        display(userPhone);
        display(userPhone2);

        userPhone.dial(userPhone2.getPhoneNumber());
        userPhone2.dial(userPhone.getPhoneNumber());



    }


    public static void display(CellPhone userPhone) {
        System.out.println("Your phone's serial number is: " + userPhone.getSerialNumber());
        System.out.println("Your phone's model is: " + userPhone.getModel());
        System.out.println("Your phone's carrier is: " + userPhone.getCarrier());
        System.out.println("Your phone's phone number is: " + userPhone.getSerialNumber());
        System.out.println("Your phone's owner is: " + userPhone.getUserName());
    }

    public static void userQuestion() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your serial number? ");
        int serialNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("What is the model of your phone? ");
        String model = sc.nextLine();

        System.out.print("Who is your phone carrier? ");
        String carrier = sc.nextLine();

        System.out.print("What is your phone number? ");
        String phoneNumber = sc.nextLine();

        System.out.print("Who is the owner of this phone? ");
        String owner = sc.nextLine();

    }




}
