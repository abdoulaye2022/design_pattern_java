/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author m2ato
 */
public class Warehouse {
    private ArrayList products;
    
    public Warehouse() {
        products = new ArrayList<String>();
    }
    
    public void getAll() {
        for (Object p : products) {
            System.out.println("# " + p);
        }
    }
    
    public void add(String n) {
        products.add(n);
        Logs.getInstance().add("Ajout du produit " + n);
    }
}
