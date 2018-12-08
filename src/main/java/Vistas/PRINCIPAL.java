package Vistas;


import DB.Generator.FileGeneradorCodigos;
import DB.Generator.GeneradorCodigos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jose Vargas
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        FileGeneradorCodigos file = new FileGeneradorCodigos();
        file.leer();
        GeneradorCodigos nuevo = file.getGenerador();
        nuevo.setIDsucursales(12);
        file.escribir(nuevo);
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   new MENU_SISTEMA().setVisible(true);
            }
        });
    }
    
}
