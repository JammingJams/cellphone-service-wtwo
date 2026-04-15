package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String userName;
    private String dial;

    public CellPhone() {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.dial = dial;

    }

    public void setSerialNumber(int serialNumber) {
       this.serialNumber = serialNumber;
    }


    public int getSerialNumber() {
        return  this.serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getModel() {
        return this.model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void dial(String phoneNumber) {
        this.dial = userName + "'s phone is calling " + phoneNumber;
        System.out.println(this.dial);
    }

}
