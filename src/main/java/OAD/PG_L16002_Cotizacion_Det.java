/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAD;

import DB.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARIO HUAYPUNA
 */
public class PG_L16002_Cotizacion_Det {

    
    static {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int ActualizarCotizacionDet( int cantidad, String estReg, int artNum, int cotCabNum ){
        int resultado = 0;
        // establece los parámetros, después ejecuta insertarNuevaCia
        Connection conexion = null;
        try{       
            conexion = Conector.conexion(); 
            PreparedStatement modificarCotizacionDet = conexion.prepareStatement("UPDATE COTIZACION_DET " +
                "SET CotDetCant = ? , " +
                "CotDetEstReg = ? "+
                "WHERE CotCabNum = ? AND ArtNum = ? ");
            modificarCotizacionDet.setInt( 1, cantidad );
            modificarCotizacionDet.setString( 2, estReg );
            
            modificarCotizacionDet.setInt( 3, cotCabNum );
            modificarCotizacionDet.setInt(4, artNum );
            resultado = modificarCotizacionDet.executeUpdate();
        } // fin de try // fin de try // fin de try // fin de try // fin de try // fin de try // fin de try // fin de try
            catch ( SQLException excepcionSql ){
            excepcionSql.printStackTrace();
        } finally {
            close(conexion);
        }// fin de catch 
        
        return resultado;
    } // fin del método 
   
    public int AgregarCotizacionDet( int cantidad, String estReg, int artNum, int cotCabNum ){
        int resultado = 0;
        Connection conexion = null;
        try{       
            conexion = Conector.conexion();            
            // crea instrucción insert para agregar una nueva entrada en la base de datos
            PreparedStatement insertarNuevaCotizacionDet = conexion.prepareStatement("INSERT INTO COTIZACION_DET " +
            "( CotDetCant, CotDetEstReg ,ArtNum, CotCabNum ) " +
            "VALUES ( ?, ?, ?, ? )" );                          
            insertarNuevaCotizacionDet.setInt( 1, cantidad );
            insertarNuevaCotizacionDet.setString( 2, estReg );
            insertarNuevaCotizacionDet.setInt(3, artNum );
            insertarNuevaCotizacionDet.setInt( 4, cotCabNum );
            
            resultado = insertarNuevaCotizacionDet.executeUpdate();
                       
        }catch(SQLException e){
            System.out.println(e);
        } finally {
            close(conexion);
        }// fin de catch
      return resultado;
    }
   
    public Object [][] obtenerTodasLosCotizacionDetQueEsten( String criterio_seleccion ){
        if( !criterio_seleccion.equals("A") && !criterio_seleccion.equals("I") && !criterio_seleccion.equals("*")  )
            return null;
        
        int registros = 0;      
        String consultaContadora = "Select count(*) as total FROM COTIZACION_DET WHERE CotDetEstReg = '"+criterio_seleccion+"' ";
        //obtenemos la cantidad de registros existentes en la tabla
        Connection conexion = null;
        Object[][] data = null;
        try{       
            conexion = Conector.conexion(); 
            PreparedStatement pstm = conexion.prepareStatement( consultaContadora );
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
            //se crea una matriz con tantas filas y columnas que necesite
            data = new String[registros][3];
            //realizamos la consulta sql y llenamos los datos en la matriz "Object"
            // crea una consulta que selecciona todas las entradas en la LibretaDirecciones
            PreparedStatement seleccionarTodasLasCotizacionesDetActivas =
            conexion.prepareStatement( "SELECT * FROM COTIZACION_DET WHERE CotDetEstReg = ? " );
            seleccionarTodasLasCotizacionesDetActivas.setString(1, criterio_seleccion);
            res = seleccionarTodasLasCotizacionesDetActivas.executeQuery();
            int i = 0;
            while(res.next()){
                data[i][0] = String.valueOf( res.getInt("CotCabNum") );
                data[i][1] = String.valueOf( res.getInt("ArtNum" ) );        
                data[i][2] = String.valueOf( res.getInt("CotDetCant" ) );
                i++;
            }
            res.close();
        } catch(SQLException e){
            System.out.println(e);
        } finally {
            close(conexion);
        }// fin de catch 

        return data;   
    } // fin del método 
   
    private void close(Connection con){
        if(con == null)
            return;
        
        try{
            con.close();
        } // fin de try
        catch ( SQLException excepcionSql ){
            excepcionSql.printStackTrace();
        } // fin de catch
    } // fin del método close
}



