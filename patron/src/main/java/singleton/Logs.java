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
public class Logs {
    private static Logs instance = new Logs();
    private ArrayList logs;
    
    private Logs () {
        logs = new ArrayList<String>();
    }
    
    public static Logs getInstance() {
        return instance;
    }
    
    public void add(String log) {
        logs.add(log);
    }
    
    public void getAll() {
        for(Object l : logs) System.out.println("- " + l);
    }
}
