/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.tipa.patron;

import factory_abstrait.Cosmetic;
import factory_abstrait.CosmeticPomadeFactory;
import factory_abstrait.CosmeticPoudreFactory;
import factory_abstrait.ProduitFactory;
import singleton.Logs;
import singleton.Warehouse;

/**
 *
 * @author m2ato
 */
public class Patron {

    public static void main(String[] args) {   
        // Factory
        FactoryMoneyTransfert n = new FactoryNita();
        MoneyTransfert nita = n.Fabrique();
        
        FactoryMoneyTransfert n1 = new FactoryAmana();
        MoneyTransfert amana = n1.Fabrique();
        
        nita.affiche();
        amana.affiche();
        
        // Abstract Factory
        ProduitFactory f = new CosmeticPoudreFactory();
        Cosmetic c = f.createCosmetic();
        
        c.affiche();
        
        ProduitFactory z = new CosmeticPomadeFactory();
        Cosmetic c2 = z.createCosmetic();
        
        c2.affiche();
        
        // Singleton
        Warehouse w = new Warehouse();
        w.add("Computer");        
        w.add("TV");        
        w.add("Car");
        
        System.out.println("-- WAREHOUSE --");
        w.getAll();
        
        System.out.println("-- LOGS --");
        Logs.getInstance().getAll();
    }
}
