package com.example.fivepoints.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CustomerID ;

    private String CustomerFirstname ;


    private String CustomerLastname ;


    private String CustomerEmail ;


    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
    @JsonProperty("Firstname")
    public String getCustomerFirstname() {
        return CustomerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        CustomerFirstname = customerFirstname;
    }
    @JsonProperty("Lastname")
    public String getCustomerLastname() {
        return CustomerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        CustomerLastname = customerLastname;
    }
    @JsonProperty("Email")
    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
}
