/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalTests;

import DB.Conector;
import Vistas.TABLA_CIAS;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mariohc
 */
public class CiaViewFestTest{
        
    private FrameFixture window;

    @Before
    public void setUp() throws Exception {
        JFrame CIAS = new JFrame("COMPAÑIAS");
        CIAS.setContentPane(new TABLA_CIAS().getContentPane());
        window = new FrameFixture(CIAS);
        window.show();
        
        // initialize your database connection here
        IDatabaseConnection connection = getConnection();
        // ...
        IDataSet dataSet = getDataSet();
        try
        {
            DatabaseOperation.REFRESH.execute(connection, dataSet);
        }
        finally
        {
            connection.close();
  
        }

    }
    
    protected IDataSet getDataSet() throws Exception{
        FlatXmlDataSet loadedDataSet = new FlatXmlDataSetBuilder().build(
                new FileInputStream(new File(this.getClass().getResource("/xml/cia.xml").getFile()))
        );
        return loadedDataSet;
    }
    
    protected IDatabaseConnection getConnection() throws Exception{
      Class.forName("org.postgresql.Driver");
      Connection jdbcConnection = 
      DriverManager.getConnection("jdbc:postgresql://localhost:5432/quotetest", "postgres", "admin");
      return new DatabaseConnection(jdbcConnection);
    }
    
    // Check that the data has been loaded.

    @Test
    public void checkInsertNewCiaCP07() {
        Conector.ChangeToTestMode();
        window.textBox("ciaructext").enterText("23490156021");
        window.textBox("cianomtext").enterText("SoftPeru S.A");
        window.button("ciaguardarbutton").click();
        window.label("stateCiaOperationLabel").requireText("Exito al guardar");
        
        
    }
    @After public void tearDown() {
        window.cleanUp();
    }
}
