package interfazmysql;

import javax.swing.*;

public class InterfazMYSQL {
    public static void main(String[] args) {
         try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
                System.out.println("Error"+e);
                System.exit(-1);
        }
        JFrame f=new JFrame("Conexion con MySQL");
        MiMenu menu=new MiMenu();
        MiPanel p=new MiPanel();
        MiOyente o=new MiOyente(p,menu);
        menu.addEventos(o);
        p.addEventos(o);
        f.add(p);
        f.setJMenuBar(menu);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(550,550);
        f.setVisible(true);   
        
    }        
}