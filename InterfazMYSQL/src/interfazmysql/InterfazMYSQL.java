/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazmysql;

import javax.swing.JFrame;

/**
 *
 * @author LuisJose
 */
public class InterfazMYSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f=new JFrame("Conexion con MySQL");
        MiPanel p=new MiPanel();
        f.add(p);
        f.setLocation(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
        
    }
    
}
