package Vistas;

import DB.Generator.CodeGenerate;
import OAD.PG_L13003_Mantenim_de_Ven;
import DB.Generator.CustomDefaultTableModel;
import DB.Generator.Entities;
import DB.Generator.FileGeneradorCodigos;
import DB.Generator.GeneradorCodigos;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Vargas
 */
public class TABLA_VENDEDORES extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddInforme
     */
    private final PG_L13003_Mantenim_de_Ven PREPARAR_DECLARACION;
    Object [][] dbVendedores;
    CustomDefaultTableModel modelo;
    private int filaSeleccionada;
    private GeneradorCodigos nuevo;
    Border BorderCajaNoEditable;
    Border BorderCajaEditable;
    
    public TABLA_VENDEDORES() {
        
        initComponents();
        PREPARAR_DECLARACION = new PG_L13003_Mantenim_de_Ven();
        BorderCajaNoEditable = this.CajaCodigoVen.getBorder();
        BorderCajaEditable = this.CajaNomVen.getBorder();
        
        dbVendedores = PREPARAR_DECLARACION.obtenerTodasLosVendedoresQueEsten("A");
        String[] columNames = {"CODIGO","NOMBRE","TELEFONO","EMAIL"}; 
        modelo = new CustomDefaultTableModel(dbVendedores, columNames);
        TABLA_MOSTRAR_CIAS.setModel(modelo);
    }

    void limpiar(){
        CajaCodigoVen.setText("");
        CajaTelef.setText("");
        CajaNomVen.setText("");
        CajaEmail.setText("");   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        bGroup_Preg_01 = new javax.swing.ButtonGroup();
        bGroup_Preg_02 = new javax.swing.ButtonGroup();
        bGroup_Preg_03 = new javax.swing.ButtonGroup();
        bGroup_Preg_04 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BotonMostrarTodo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CajaCodigoVen = new javax.swing.JTextField();
        CajaEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BotonGuardarCia = new javax.swing.JButton();
        CajaTelef = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CajaNomVen = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BotonActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA_MOSTRAR_CIAS = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        jMenuItem1.setText("MODIFICAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("ELIMINAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VENDEDORES");

        BotonMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonMostrarTodo.setText("MOSTRAR TODO");
        BotonMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarTodoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para modificar o eliminar, seleccionar la fila de interes,luego clic derecho  sobre la fila seleccionada ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("y escoja su opcion. Si es modificar luego de  cambiar los datos clic en ACTUALIZAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRE");

        CajaCodigoVen.setEditable(false);
        CajaCodigoVen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaCodigoVenMouseClicked(evt);
            }
        });
        CajaCodigoVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCodigoVenActionPerformed(evt);
            }
        });

        CajaEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaEmailMouseClicked(evt);
            }
        });
        CajaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("CÓDIGO");

        BotonGuardarCia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonGuardarCia.setText("GUARDAR");
        BotonGuardarCia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarCiaActionPerformed(evt);
            }
        });

        CajaTelef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaTelefMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setText("TELEF");

        CajaNomVen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaNomVenMouseClicked(evt);
            }
        });
        CajaNomVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNomVenActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("ATRAS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setText("E-MAIL");

        BotonActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonActualizar.setText("ACTUALIZAR");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        TABLA_MOSTRAR_CIAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TABLA_MOSTRAR_CIAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TABLA_MOSTRAR_CIAS.setComponentPopupMenu(jPopupMenu1);
        TABLA_MOSTRAR_CIAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLA_MOSTRAR_CIASMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TABLA_MOSTRAR_CIAS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CajaTelef)
                            .addComponent(CajaNomVen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CajaCodigoVen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CajaEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonMostrarTodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonGuardarCia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonGuardarCia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMostrarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CajaCodigoVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajaNomVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajaTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila = TABLA_MOSTRAR_CIAS.getSelectedRow();
        if(fila >= 0){
            CajaCodigoVen.setText(TABLA_MOSTRAR_CIAS.getValueAt(fila, 0).toString());
            CajaNomVen.setText(TABLA_MOSTRAR_CIAS.getValueAt(fila, 1).toString());
            CajaTelef.setText(TABLA_MOSTRAR_CIAS.getValueAt(fila, 2).toString());
            CajaEmail.setText(TABLA_MOSTRAR_CIAS.getValueAt(fila, 3).toString());
            CajaCodigoVen.setEnabled(false);
            BotonGuardarCia.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se selecciono fila");
        }
        setFilaSeleccionada( fila );
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int fila = TABLA_MOSTRAR_CIAS.getSelectedRow();
        if(fila >= 0){
            PREPARAR_DECLARACION.EliminarVendedor( Integer.parseInt( TABLA_MOSTRAR_CIAS.getValueAt(fila, 0).toString() ) );
        }
        else{
            JOptionPane.showMessageDialog(null, "No se selecciono fila");
        }
        modelo.removeRow(fila);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BotonMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMostrarTodoActionPerformed

    private void CajaCodigoVenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaCodigoVenMouseClicked
        // TODO add your handling code here:
        CajaCodigoVen.setBorder(BorderCajaNoEditable);

        CajaCodigoVen.setText( String.valueOf( CodeGenerate.getCode(Entities.VENDEDORES) )  );
    }//GEN-LAST:event_CajaCodigoVenMouseClicked

    private void CajaCodigoVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCodigoVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaCodigoVenActionPerformed

    private void CajaEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaEmailMouseClicked
        // TODO add your handling code here:
        CajaEmail.setBorder(BorderCajaEditable);
    }//GEN-LAST:event_CajaEmailMouseClicked

    private void BotonGuardarCiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCiaActionPerformed
        if( !DatosValidos() )
        return;
        FileGeneradorCodigos file = new FileGeneradorCodigos();
        file.escribir(nuevo);

        PREPARAR_DECLARACION.agregarVendedor(Integer.parseInt( this.CajaCodigoVen.getText()),
            this.CajaNomVen.getText(),
            Integer.parseInt(this.CajaTelef.getText()),
            this.CajaEmail.getText(),
            "A");

        String [] datos = new String[4];
        datos[0] = CajaCodigoVen.getText();
        datos[1] = CajaNomVen.getText();
        datos[2] = CajaTelef.getText();
        datos[3] = CajaEmail.getText();

        limpiar();
        modelo.addRow(datos);

    }//GEN-LAST:event_BotonGuardarCiaActionPerformed

    private void CajaTelefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaTelefMouseClicked
        // TODO add your handling code here:
        CajaTelef.setBorder(BorderCajaEditable);
    }//GEN-LAST:event_CajaTelefMouseClicked

    private void CajaNomVenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNomVenMouseClicked
        // TODO add your handling code here:
        CajaNomVen.setBorder(BorderCajaEditable);
    }//GEN-LAST:event_CajaNomVenMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();        // BOTON ATRAS

    }//GEN-LAST:event_jButton5ActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        if( !DatosValidos() )
        return;
        // TODO add your handling code here:
        PREPARAR_DECLARACION.ActualizarVendedores(Integer.parseInt( this.CajaCodigoVen.getText()),
            this.CajaNomVen.getText(),
            Integer.parseInt(this.CajaTelef.getText()),
            this.CajaEmail.getText(),
            "A");

        modelo.setValueAt(CajaNomVen.getText(), getFilaSeleccionada(), 1 );
        modelo.setValueAt(CajaTelef.getText(), getFilaSeleccionada(), 2 );
        modelo.setValueAt(CajaEmail.getText(), getFilaSeleccionada(), 3 );
        limpiar();
        CajaCodigoVen.setEnabled(true);
        BotonGuardarCia.setEnabled(true);
        BotonActualizar.setEnabled(false);
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void TABLA_MOSTRAR_CIASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_MOSTRAR_CIASMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLA_MOSTRAR_CIASMouseClicked

    private void CajaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaEmailActionPerformed

    private void CajaNomVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNomVenActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CajaNomVenActionPerformed
    /*
    *Funciones de validacion de elementos
    *
    */
    public void setFilaSeleccionada( int row ){
        filaSeleccionada = row;
    }
    public int getFilaSeleccionada(){
        return filaSeleccionada;
    }
    
    public boolean DatosValidos( ){
        boolean flag1, flag2,flag3, flag4;
        flag1 = flag2 = flag3 = flag4 = true;
        if( !checkNum(CajaCodigoVen.getText()) ){ 
            CajaCodigoVen.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            flag1 = false;
        }
        if( !checkAlpha(CajaNomVen.getText()) ){
            CajaNomVen.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            flag2 =  false;
        }
        if( !checkNum(CajaTelef.getText())  ){
            CajaTelef.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            flag3 = false;    
        }
        if( !checkAlphayCharacter(CajaEmail.getText()) && !CajaEmail.getText().contains("@") ){
            CajaEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            flag4 = false;    
        }
        
        return ( flag1 && flag2 && flag3 && flag4 );
    }
    
    public boolean checkAlpha(String cadena) {
	boolean respuesta = false;
	if ((cadena).matches("([a-z]|[A-Z]|\\s)+")) {
            respuesta = true;
	}
        return respuesta;	
    }
    public boolean checkAlphayCharacter(String cadena) {
	boolean respuesta = false;
	if ((cadena).matches("([a-z]|[A-Z]|[0-9]|\\s|\\.|\\-|\\_)+")) {
            respuesta = true;
	}
	return respuesta;
    }
    public boolean checkNum(String str){ 
        boolean respuesta = false; 
        if ((str).matches("([0-9])+")) { 
            respuesta = true; 
        } 
        return respuesta; 
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonGuardarCia;
    private javax.swing.JButton BotonMostrarTodo;
    private javax.swing.JTextField CajaCodigoVen;
    private javax.swing.JTextField CajaEmail;
    private javax.swing.JTextField CajaNomVen;
    private javax.swing.JTextField CajaTelef;
    private javax.swing.JTable TABLA_MOSTRAR_CIAS;
    private javax.swing.ButtonGroup bGroup_Preg_01;
    private javax.swing.ButtonGroup bGroup_Preg_02;
    private javax.swing.ButtonGroup bGroup_Preg_03;
    private javax.swing.ButtonGroup bGroup_Preg_04;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
