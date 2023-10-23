/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_abstrait;

/**
 *
 * @author m2ato
 */
public class Pomade implements Cosmetic{

    @Override
    public void affiche() {
        System.out.println("Je suis aussi un produit cosmtique mais de type pomade.");
    }
    
}
