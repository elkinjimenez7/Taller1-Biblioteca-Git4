/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elkin jimenez
 */
public class Main {
    
    static ArrayList<Customer> customer = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public void createCustomer(String kindCustomer, int id, String name, String cc, int age){
        
        Customer newCustomer = new Customer(kindCustomer, id, name, cc, age);
        
        customer.add(newCustomer);
    }
    
    public void listCustomers(JTable table){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Tipo de Cliente");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("CC");
        model.addColumn("Edad");
        
        for (Customer c : customer){
            
            Object[] row = new Object[5];
            
            row[0] = c.getKindCustomer();
            row[1] = c.getId();
            row[2] = c.getName();
            row[3] = c.getCc();
            row[4] = c.getAge();
            
            model.addRow(row);
        }
        table.setModel(model);
       
    }
    
    public void searchCustomer(JTable table, String searchCc){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Tipo de Cliente");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("CC");
        model.addColumn("Edad");
        
        boolean found = false;
        
        for (Customer c : customer){
            
            if (c.getCc().equals(searchCc)){
            
            Object[] row = new Object[5];
            
            row[0] = c.getKindCustomer();
            row[1] = c.getId();
            row[2] = c.getName();
            row[3] = c.getCc();
            row[4] = c.getAge();
            
            model.addRow(row);
            found = true;
            break;
           }
        }
        
        if (!found){
            javax.swing.JOptionPane.showMessageDialog(null, "El cliente con CC " + searchCc + " no esta registrado");
        }
        table.setModel(model);
       
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
