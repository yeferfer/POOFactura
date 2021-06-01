/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Statement ejecutor = null;

    Connection con;

    public Modificar() {
        initComponents();
         modelo.addColumn("IdProducto");
        modelo.addColumn("IdTipoProducto");
        modelo.addColumn("NombreProducto");
        modelo.addColumn("DescripcionProducto");
        modelo.addColumn("PrecioCompra");
        modelo.addColumn("IVAxProducto");
        modelo.addColumn("RetefuentexProducto");
        modelo.addColumn("PrecioVenta");
        Conectar();
        cargarTabla();
    }

    public void Conectar() {
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion", "root", "");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
     protected void cargarTabla() {
        modelo.setRowCount(0);
        String datos[]=new String[8];
        String query = "select * from producto;";
        ResultSet rs;
         try {
            ejecutor= (Statement) con.createStatement();
            ejecutor.setQueryTimeout(20);
            rs=ejecutor.executeQuery(query);
            while(rs.next()==true){
                datos[0]=rs.getString("IdProducto");
                datos[1]=rs.getString("IdTipoProducto");
                datos[2]=rs.getString("NombreProducto");
                datos[3]=rs.getString("DescripcionProducto");
                datos[4]=rs.getString("PrecioCompra");
                datos[5]=rs.getString("IVAxProducto");
                datos[6]=rs.getString("RetefuentexProducto");
                datos[7]=rs.getString("PrecioVenta");
                modelo.addRow(datos);
            }
            TablaProducto2.setModel(modelo);
        } catch (Exception e) {
        }
    }
      protected void Agregar(){
        String mensajeError="";
        String query="";
        PreparedStatement preparar=null;
//        if(this.jTextField1.getText().isEmpty()==true){
//            mensajeError= mensajeError + " Nombre de producto no puede estar vacio";
//        }
//        if(this.jTextField2.getText().isEmpty()==true){
//             mensajeError= mensajeError + " Cantidad no puede estar vacio";
//        }
//        if(this.jTextField3.getText().isEmpty() == true){
//             mensajeError= mensajeError + " Precio Unitario no puede estar vacio";
//        }
//        if(this.jTextField4.getText().isEmpty() == true){
//             mensajeError= mensajeError + " Precio Compra no puede estar vacio";
//        }
//        if(mensajeError.isEmpty()==true){
//            query="insert into producto "
//                 + "(IdProducto,     PrecioCompra,   IVAxProducto,   RetefuentexProducto,) values"
//                 + "('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"')   ";
       try{
           preparar=con.prepareStatement(query);
           preparar.executeUpdate();
           cargarTabla();
       }catch(Exception e){
           
       }
//        }else{
//            JOptionPane.showMessageDialog(null, mensajeError);
//        }
    }
     
     protected void BuscarTabla(String IdProducto){
         modelo.setRowCount(0);
        String datos[]=new String[8];
        String where = " where 1=1";
        if(IdProducto.isEmpty()==false){
            where = where+" and IdProducto='"+IdProducto+"' ";
        }
        String query = "select * from producto"+where+" ;";
        debugQuery.setText(query);
        ResultSet rs;
         try {
            ejecutor= (Statement) con.createStatement();
            ejecutor.setQueryTimeout(20);
            rs=ejecutor.executeQuery(query);
            while(rs.next()==true){
                datos[0]=rs.getString("IdProducto");
                datos[1]=rs.getString("IdTipoProducto");
                datos[2]=rs.getString("NombreProducto");
                datos[3]=rs.getString("DescripcionProducto");
                datos[4]=rs.getString("PrecioCompra");
                datos[5]=rs.getString("IVAxProducto");
                datos[6]=rs.getString("RetefuentexProducto");
                datos[7]=rs.getString("PrecioVenta");
                modelo.addRow(datos);
            }
            TablaProducto2.setModel(modelo);
        } catch (Exception e) {
        }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PorId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        debugQuery = new javax.swing.JTextArea();

        TablaProducto2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaProducto2);

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CONSULTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Por ID");

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        debugQuery.setColumns(20);
        debugQuery.setRows(5);
        jScrollPane2.setViewportView(debugQuery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(PorId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(269, 269, 269)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton3)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BuscarTabla(PorId.getText());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PorId;
    private javax.swing.JTable TablaProducto2;
    private javax.swing.JTextArea debugQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
