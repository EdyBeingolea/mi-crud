/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import conexionSql.conexionMysql;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author antho
 */
public class clientes extends javax.swing.JPanel {

    conexionMysql cc= new conexionMysql();
    Connection con=cc.conexion();
   
    public clientes() {
        initComponents();
        
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        txtNOMCLI = new javax.swing.JTextField();
        txtGMLCLI = new javax.swing.JTextField();
        txtCELCLI = new javax.swing.JTextField();
        txtMENCLI = new javax.swing.JTextField();
        comboPEDCLI = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();

        panelCliente.setBackground(new java.awt.Color(255, 51, 51));
        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESGISTRO CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        txtNOMCLI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNOMCLI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE Y APELLIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        txtNOMCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMCLIActionPerformed(evt);
            }
        });

        txtGMLCLI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGMLCLI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtCELCLI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCELCLI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CELULAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        txtCELCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCELCLIActionPerformed(evt);
            }
        });

        txtMENCLI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMENCLI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENSAJE ADICIONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        txtMENCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMENCLIActionPerformed(evt);
            }
        });

        comboPEDCLI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboPEDCLI.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UN POLLO A LA BRAZA", "1/2 POLLO A LA BRAZA", "1/4 POLLO A LA BRAZA", "POLLO MAS GASEOSA", "LA PROMO FAMILY", "LA INCOMPARABLE" }));
        comboPEDCLI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BUSQUEDA:");

        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporte.setText("GENERAR REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(txtGMLCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGap(10, 10, 10)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMENCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboPEDCLI, javax.swing.GroupLayout.Alignment.LEADING, 0, 244, Short.MAX_VALUE)
                                .addComponent(txtCELCLI, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNOMCLI, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtNOMCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtGMLCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCELCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboPEDCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMENCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporte)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void limpiarCajas(){
    
        txtNOMCLI.setText("");
        txtCELCLI.setText("");
        txtGMLCLI.setText("");
        comboPEDCLI.setSelectedItem(null);
        txtMENCLI.setText("");
    
    }
    
    
   
public void ActualizarDatos(){
    
    try{
    
        String SQL=" update clientes set NOMCLI=?, CELCLI=?, GMLCLI=? ,PEDCLI=? ,MENCLI=? where IDCLI=?";
        
        int filaSeleccionado=tablaClientes.getSelectedRow();
        String dao=(String)tablaClientes.getValueAt(filaSeleccionado, 0);
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtNOMCLI.getText());
        pst.setString(2, txtCELCLI.getText());
        pst.setString(3, txtGMLCLI.getText());
        
        int seleccionado=comboPEDCLI.getSelectedIndex();
        pst.setString(4, (String) comboPEDCLI.getItemAt(seleccionado));
        
        pst.setString(5, txtMENCLI.getText());
        
        pst.setString(6, dao);
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Registro Editado Exitoso");
  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error al editar" +e.getMessage());
    }
    
    
}
    
    
    
    
    
public void insertarDatos(){
    
    try{
    
        String SQL="insert into clientes(NOMCLI,CELCLI,GMLCLI,PEDCLI,MENCLI) values(?,?,?,?,?)";
        
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtNOMCLI.getText());
        pst.setString(2, txtCELCLI.getText());
        pst.setString(3, txtGMLCLI.getText());
        
        int seleccionado=comboPEDCLI.getSelectedIndex();
        pst.setString(4, (String) comboPEDCLI.getItemAt(seleccionado));
        
        pst.setString(5, txtMENCLI.getText());
        
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Registro exitoso");
  
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error en el registrarse" +e.getMessage());
    }
    
    
}
    
    private void txtCELCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCELCLIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCELCLIActionPerformed

    private void txtMENCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMENCLIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMENCLIActionPerformed

    private void txtNOMCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMCLIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMCLIActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistros();
        mostrarDatos();
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

public void eliminarRegistros(){

    int filaSeleccionada=tablaClientes.getSelectedRow();
    
    try{
    
        String SQL="delete from clientes where IDCLI="+tablaClientes.getValueAt(filaSeleccionada,0);
        Statement st=con.createStatement();
        
        int n=st.executeUpdate(SQL);
        
        
        if(n>=0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }
    }catch (Exception e){
    
         JOptionPane.showMessageDialog(null,"El Registro no se a eliminado"+e.getMessage());
    }
    
    
}
    
    
public void filtrarDatos(String valor){
    
    String[] titulos={"ID","Nombre","Celular","Gmail","Pedido","Mensaje"};
    String[] registros= new String[7];
    
     DefaultTableModel modelo= new DefaultTableModel(null,titulos);
     
     String SQL ="select * from clientes where  NOMCLI + GMLCLI + CELCLI + PEDCLI like '%"+valor+"%'";
     
     
     try{
         
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(SQL);
         
     
         while(rs.next()){
         
             registros[0]=rs.getString("IDCLI");
             registros[1]=rs.getString("NOMCLI");
             registros[2]=rs.getString("CELCLI");
             registros[3]=rs.getString("GMLCLI");
             registros[4]=rs.getString("PEDCLI");
             registros[5]=rs.getString("MENCLI");
             
             modelo.addRow(registros);
         }
         
         
         tablaClientes.setModel(modelo);
     }catch (Exception e){
     
         JOptionPane.showMessageDialog(null,"Error al Mostrar Datos"+ e.getMessage());
         
     }
    
    }
    
public void mostrarDatos(){
    
    String[] titulos={"ID","Nombre","Celular","Gmail","Pedido","Mensaje"};
    String[] registros= new String[7];
    
     DefaultTableModel modelo= new DefaultTableModel(null,titulos);
     
     String SQL ="select * from clientes";
     
     try{
         
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(SQL);
         
     
         while(rs.next()){
         
             registros[0]=rs.getString("IDCLI");
             registros[1]=rs.getString("NOMCLI");
             registros[2]=rs.getString("CELCLI");
             registros[3]=rs.getString("GMLCLI");
             registros[4]=rs.getString("PEDCLI");
             registros[5]=rs.getString("MENCLI");
             
             modelo.addRow(registros);
         }
         
         
         tablaClientes.setModel(modelo);
     }catch (Exception e){
     
         JOptionPane.showMessageDialog(null,"Error al Mostrar Datos"+ e.getMessage());
         
     }
    
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        
        int filaSeleccionada=tablaClientes.rowAtPoint(evt.getPoint());
        
        txtNOMCLI.setText(tablaClientes.getValueAt(filaSeleccionada, 1).toString());
        txtCELCLI.setText(tablaClientes.getValueAt(filaSeleccionada, 2).toString());
        txtGMLCLI.setText(tablaClientes.getValueAt(filaSeleccionada, 3).toString());
        comboPEDCLI.setSelectedItem(tablaClientes.getValueAt(filaSeleccionada, 4).toString());
        txtMENCLI.setText(tablaClientes.getValueAt(filaSeleccionada, 5).toString());
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        
        
        try{
        
             InputStream archivo=getClass().getResourceAsStream("/reportes/clientes.jrxml");
            
             JasperDesign dise=JRXmlLoader.load(archivo);
             
             JasperReport jr=JasperCompileManager.compileReport(dise);
             
             JasperPrint jp=JasperFillManager.fillReport(jr, null,con);
             
             JasperViewer.viewReport(jp);
             
        }catch (Exception e){
        
        }
        
        
    }//GEN-LAST:event_btnReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox comboPEDCLI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCELCLI;
    private javax.swing.JTextField txtGMLCLI;
    private javax.swing.JTextField txtMENCLI;
    private javax.swing.JTextField txtNOMCLI;
    // End of variables declaration//GEN-END:variables
}
