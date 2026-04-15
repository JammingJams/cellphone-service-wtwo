package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String userName;
    private String dial;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String userName) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.dial = dial;

    }


    public int getSerialNumber() {
        return  this.serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public void dial(String phoneNumber) {
        this.dial = userName + "'s phone is calling " + phoneNumber;
        System.out.println(this.dial);
    }

}
