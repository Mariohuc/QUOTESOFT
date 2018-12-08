package Vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Vistas.Consultas.CONSULTA_CLIENTES;
import Vistas.Consultas.CONSULTA_COMPANIA;
import Vistas.Consultas.CONSULTA_COTIZACION;
import Vistas.Consultas.CONSULTA_VENDEDORES;
//import com.l2fprod.gui.plaf.skin.SkinLookAndFeel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Jose Vargas
 */
public class MENU_SISTEMA extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public MENU_SISTEMA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdpescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        ARC_SALIR = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MAN_CIAS = new javax.swing.JMenuItem();
        MAN_CLIENTES = new javax.swing.JMenuItem();
        MAN_ARTICULOS = new javax.swing.JMenuItem();
        MAN_VENDEDORES = new javax.swing.JMenuItem();
        MAN_SUCURSAL = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        SIS_COTIZACION = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));

        javax.swing.GroupLayout jdpescritorioLayout = new javax.swing.GroupLayout(jdpescritorio);
        jdpescritorio.setLayout(jdpescritorioLayout);
        jdpescritorioLayout.setHorizontalGroup(
            jdpescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jdpescritorioLayout.setVerticalGroup(
            jdpescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpescritorio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpescritorio)
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true), "Menu Cotizacion", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 14), new java.awt.Color(51, 0, 51))); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/process.png"))); // NOI18N
        jMenu2.setText("ARCHIVO");
        jMenu2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N

        ARC_SALIR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ARC_SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/block.png"))); // NOI18N
        ARC_SALIR.setText("Salir");
        ARC_SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARC_SALIRActionPerformed(evt);
            }
        });
        jMenu2.add(ARC_SALIR);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/refresh.png"))); // NOI18N
        jMenu3.setText("MANTENIMIENTO");
        jMenu3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N

        MAN_CIAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MAN_CIAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        MAN_CIAS.setText("Compañias");
        MAN_CIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAN_CIASActionPerformed(evt);
            }
        });
        jMenu3.add(MAN_CIAS);

        MAN_CLIENTES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MAN_CLIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        MAN_CLIENTES.setText("Clientes");
        MAN_CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAN_CLIENTESActionPerformed(evt);
            }
        });
        jMenu3.add(MAN_CLIENTES);

        MAN_ARTICULOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MAN_ARTICULOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        MAN_ARTICULOS.setText("Articulos");
        MAN_ARTICULOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAN_ARTICULOSActionPerformed(evt);
            }
        });
        jMenu3.add(MAN_ARTICULOS);

        MAN_VENDEDORES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MAN_VENDEDORES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        MAN_VENDEDORES.setText("Vendedores");
        MAN_VENDEDORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAN_VENDEDORESActionPerformed(evt);
            }
        });
        jMenu3.add(MAN_VENDEDORES);

        MAN_SUCURSAL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MAN_SUCURSAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        MAN_SUCURSAL.setText("Sucursal");
        MAN_SUCURSAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAN_SUCURSALActionPerformed(evt);
            }
        });
        jMenu3.add(MAN_SUCURSAL);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/next.png"))); // NOI18N
        jMenu6.setText("SISTEMA");
        jMenu6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N

        SIS_COTIZACION.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SIS_COTIZACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/accept.png"))); // NOI18N
        SIS_COTIZACION.setText("Cotizacion");
        SIS_COTIZACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIS_COTIZACIONActionPerformed(evt);
            }
        });
        jMenu6.add(SIS_COTIZACION);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/help.png"))); // NOI18N
        jMenu4.setText("CONSULTAS");
        jMenu4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem7.setText("Compañias");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem8.setText("Clientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem9.setText("Articulos");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem10.setText("Vendedores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem11.setText("Sucursal");
        jMenu4.add(jMenuItem11);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem17.setText("Cotizacion");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/search_page.png"))); // NOI18N
        jMenu5.setText("REPORTES");
        jMenu5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem12.setText("Compañias");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem13.setText("Clientes");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem14.setText("Articulos");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem15.setText("Vendedores");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png/24x24/tag_blue.png"))); // NOI18N
        jMenuItem16.setText("Sucursal");
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void centrarMostrarVentanaInterna(JInternalFrame jinternal){
        int x = jdpescritorio.getWidth()/2 - jinternal.getWidth()/2;
        int y = jdpescritorio.getHeight()/2 - jinternal.getHeight()/2;
        if (jinternal.isShowing()){
            jinternal.setLocation(x, y);
        }
        else{
            jdpescritorio.add(jinternal);
            jinternal.setLocation(x, y);
            jinternal.show();
        }
    }
    private void MAN_CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAN_CLIENTESActionPerformed
        TABLA_CLIENTES cli= new TABLA_CLIENTES();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_MAN_CLIENTESActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CONSULTA_CLIENTES cli;
        try {
            cli = new CONSULTA_CLIENTES();
            centrarMostrarVentanaInterna(cli);  
        } catch (SQLException ex) {
            Logger.getLogger(MENU_SISTEMA.class.getName()).log(Level.SEVERE, null, ex);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void MAN_SUCURSALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAN_SUCURSALActionPerformed
        TABLA_SUCURSAL cli= new TABLA_SUCURSAL();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_MAN_SUCURSALActionPerformed

    private void MAN_CIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAN_CIASActionPerformed
        TABLA_CIAS cli= new TABLA_CIAS();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_MAN_CIASActionPerformed

    private void MAN_VENDEDORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAN_VENDEDORESActionPerformed
        TABLA_VENDEDORES cli= new TABLA_VENDEDORES();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_MAN_VENDEDORESActionPerformed

    private void ARC_SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARC_SALIRActionPerformed
        dispose();
    }//GEN-LAST:event_ARC_SALIRActionPerformed

    private void SIS_COTIZACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIS_COTIZACIONActionPerformed
        COTIZACION cli= new COTIZACION();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_SIS_COTIZACIONActionPerformed

    private void MAN_ARTICULOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAN_ARTICULOSActionPerformed
        TABLA_ARTICULOS cli= new TABLA_ARTICULOS();
        centrarMostrarVentanaInterna(cli);
    }//GEN-LAST:event_MAN_ARTICULOSActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CONSULTA_VENDEDORES cli= new CONSULTA_VENDEDORES();
        centrarMostrarVentanaInterna(cli);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        CONSULTA_COTIZACION cli= new CONSULTA_COTIZACION();
        centrarMostrarVentanaInterna(cli);           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CONSULTA_COMPANIA cli= new CONSULTA_COMPANIA();
        centrarMostrarVentanaInterna(cli);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   new MENU_SISTEMA().setVisible(true);
            }
        });
//        try{
//            JFrame.setDefaultLookAndFeelDecorated(true);
//            SkinLookAndFeel.setSkin(SkinLookAndFeel.loadThemePack("skin/coronaHthemepack.zip"));
//            UIManager.setLookAndFeel("com.12fprod.gui.plaf.skin.SkinAndFeel");
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//        new Ventana().setVisible(true);
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ARC_SALIR;
    private javax.swing.JMenuItem MAN_ARTICULOS;
    private javax.swing.JMenuItem MAN_CIAS;
    private javax.swing.JMenuItem MAN_CLIENTES;
    private javax.swing.JMenuItem MAN_SUCURSAL;
    private javax.swing.JMenuItem MAN_VENDEDORES;
    private javax.swing.JMenuItem SIS_COTIZACION;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdpescritorio;
    // End of variables declaration//GEN-END:variables
}
