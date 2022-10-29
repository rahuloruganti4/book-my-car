package com.example.carbooking;

import javax.persistence.Entity;

@Entity
public class Admin {
    private String Admin_id;

    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String admin_id) {
        Admin_id = admin_id;
    }

    public String getAdmin_password() {
        return Admin_password;
    }

    public void setAdmin_password(String admin_password) {
        Admin_password = admin_password;
    }

    private String Admin_password;


    public Admin(String admin_id, String admin_password) {
        Admin_id = admin_id;
        Admin_password = admin_password;
    }
}
