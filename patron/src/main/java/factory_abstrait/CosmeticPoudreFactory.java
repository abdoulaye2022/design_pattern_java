/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_abstrait;

/**
 *
 * @author m2ato
 */
public class CosmeticPoudreFactory implements ProduitFactory {

    @Override
    public Poudre createCosmetic() {
        return new Poudre();
    }
}
