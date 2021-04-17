package com.example.dailycontact.model;

public class Friend {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    private String PhoneNumber;

    public Friend(String name, String phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }
}
