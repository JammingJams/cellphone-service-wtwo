package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
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



        CellPhone userPhone = new CellPhone(serialNumber,model, carrier, phoneNumber,  owner); {

        }

        System.out.println("Your phone's serial number is: " + userPhone.getSerialNumber());
        System.out.println("Your phone's model is: " + userPhone.getModel());
        System.out.println("Your phone's carrier is: " + userPhone.getCarrier());
        System.out.println("Your phone's phone number is: " + userPhone.getSerialNumber());
        System.out.println("Your phone's owner is: " + userPhone.getUserName());

    }
}
