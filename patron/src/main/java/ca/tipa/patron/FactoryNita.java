/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.tipa.patron;

/**
 *
 * @author m2ato
 */
public class FactoryNita implements FactoryMoneyTransfert{

    @Override
    public MoneyTransfert Fabrique() {
        return new Nita();
    }
}
