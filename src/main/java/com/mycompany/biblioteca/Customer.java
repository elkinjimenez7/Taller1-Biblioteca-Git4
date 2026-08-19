/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author elkin jimenez
 */
public class Customer extends Person {
    
    private String kindCustomer;
    private int id;

    public Customer(String kindCustomer, int id, String name, String cc, int age) {
        super(name, cc, age);
        this.kindCustomer = kindCustomer;
        this.id = id;
    }

    public String getKindCustomer() {
        return kindCustomer;
    }

    public void setKindCustomer(String kindCustomer) {
        this.kindCustomer = kindCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
