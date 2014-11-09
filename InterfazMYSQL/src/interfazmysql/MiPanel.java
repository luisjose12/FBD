package interfazmysql;

import java.net.URL;
import javax.swing.*;

public class MiPanel extends javax.swing.JPanel {
    private String path="/Imagenes/Mysql.png";
    URL url=this.getClass().getResource(path);
    ImageIcon imagen=new ImageIcon(url);
    
    public MiPanel() {
        initComponents();   
        Imagen.setIcon(imagen);
    }
    
    public void addEventos(MiOyente o){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_consultas = new javax.swing.JPanel();
        ECon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        select = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        acWh = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        where = new javax.swing.JTextField();
        hacerConsulta = new javax.swing.JButton();
        Panel_insert = new javax.swing.JPanel();
        EIns = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();

        Panel_consultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ECon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ECon.setText("Consultas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Select");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("From");

        acWh.setText("Activar Where");
        acWh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acWhActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Where");

        where.setEditable(false);

        hacerConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hacerConsulta.setText("Hacer Consulta");

        javax.swing.GroupLayout Panel_consultasLayout = new javax.swing.GroupLayout(Panel_consultas);
        Panel_consultas.setLayout(Panel_consultasLayout);
        Panel_consultasLayout.setHorizontalGroup(
            Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_consultasLayout.createSequentialGroup()
                .addGroup(Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_consultasLayout.createSequentialGroup()
                                .addComponent(acWh)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Panel_consultasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(from))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_consultasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hacerConsulta))
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select))
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(ECon)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(where)))
                .addContainerGap())
        );
        Panel_consultasLayout.setVerticalGroup(
            Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ECon)
                .addGroup(Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(acWh)
                .addGap(18, 18, 18)
                .addGroup(Panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_consultasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68))
                    .addComponent(where, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(hacerConsulta)
                .addContainerGap())
        );

        Panel_insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EIns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EIns.setText("Insertar");

        javax.swing.GroupLayout Panel_insertLayout = new javax.swing.GroupLayout(Panel_insert);
        Panel_insert.setLayout(Panel_insertLayout);
        Panel_insertLayout.setHorizontalGroup(
            Panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_insertLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(EIns)
                .addGap(93, 93, 93))
        );
        Panel_insertLayout.setVerticalGroup(
            Panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_insertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EIns)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addComponent(Panel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_consultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acWhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acWhActionPerformed
        if(acWh.isSelected()==true){
            where.setEditable(true);
        }
        else{
            where.setEditable(false);
        }
    }//GEN-LAST:event_acWhActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ECon;
    private javax.swing.JLabel EIns;
    private javax.swing.JLabel Imagen;
    private javax.swing.JPanel Panel_consultas;
    private javax.swing.JPanel Panel_insert;
    private javax.swing.JCheckBox acWh;
    private javax.swing.JTextField from;
    private javax.swing.JButton hacerConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField select;
    private javax.swing.JTextField where;
    // End of variables declaration//GEN-END:variables
}
