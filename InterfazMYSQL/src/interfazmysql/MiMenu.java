package interfazmysql;

import javax.swing.*;

public class MiMenu extends JMenuBar {
   
    public MiMenu(){
        addMenu();
    }
    
    public final void addMenu(){
        JMenu archivo=new JMenu("Arhivo");
        JMenu conexion=new JMenu("Conexion");
        add(archivo);
        add(conexion);
        JMenuItem nuevo=crearItem("Nuevo","add.png");
        JMenuItem cerrar=crearItem("Cerrar","cancel.png");
        JMenuItem nue_con=crearItem("Nueva Conexion", " ");
        JMenuItem elim_con=crearItem("Eliminar Conexion", "");
        conexion.add(elim_con);
        conexion.add(nue_con);
        archivo.add(nuevo);
        archivo.add(cerrar);
    }
    public void addEventos(MiOyente o){
        
    
    }
    public JMenuItem crearItem(String etiqueta, String imagen){
    JMenuItem x=new JMenuItem(etiqueta);
    String p="/imagenes/"+imagen;
    ImageIcon imagen1=
                    new ImageIcon(getClass().getResource(p));
    x.setIcon(imagen1);
    return x;
    }
}