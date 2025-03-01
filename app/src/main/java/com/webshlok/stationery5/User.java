package com.webshlok.stationery5;

public class User {
    private String name, email, phone;

    public User() {
        // Default constructor required for Firestore
    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}