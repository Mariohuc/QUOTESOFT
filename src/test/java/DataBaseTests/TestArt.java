/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseTests;

/**
 *
 * @author mariohc
 */
import DB.Conector;
import OAD.PG_L13001_Mantenim_de_Art;
import OAD.PG_L13002_Mantenim_de_Cia;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;


public class TestArt extends DatabaseTestCase {
    //to take a screen capture use ctrl + shift + ImpPt
    private static final String TABLE_ART = "articulos";
    private FlatXmlDataSet loadedDataSet;
    // Provide a connection to the database
    @Override
    protected IDatabaseConnection getConnection() throws Exception{
      Class.forName("org.postgresql.Driver");
      Connection jdbcConnection = 
      DriverManager.getConnection("jdbc:postgresql://localhost:5432/quotetest", "postgres", "admin");
      return new DatabaseConnection(jdbcConnection);
    }
    /*
    @Override
    protected void setUp() throws Exception
    {
        // initialize your database connection here
        IDatabaseConnection connection = getConnection();
        // ...
        IDataSet dataSet = getDataSet();
        try
        {
            DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
        }
        finally
        {
            connection.close();
  
        }
        
    }
    */
    
    // Load the data which will be inserted for the test
    @Override
    protected IDataSet getDataSet() throws Exception{
      loadedDataSet = new FlatXmlDataSetBuilder().build(
              new FileInputStream(new File(this.getClass().getResource("/xml/art.xml").getFile()))
      );
      return loadedDataSet;
    }
    
    @Override
    protected DatabaseOperation getSetUpOperation() throws Exception {
        return DatabaseOperation.CLEAN_INSERT;
    }
    
    @Override
    protected DatabaseOperation getTearDownOperation() throws Exception {
        return DatabaseOperation.NONE;
    }
    
    
    // Check that the data has been loaded.
    
    @Test
    public void testCheckCiasDataLoaded() throws Exception{
        assertNotNull(loadedDataSet);
        int rowCount = loadedDataSet.getTable(TABLE_ART).getRowCount();
        assertEquals(3, rowCount);
      
    }
    
    @Test
    public void testCheckInsertOperation() throws Exception{
        Conector.ChangeToTestMode();
        
        PG_L13001_Mantenim_de_Art artDAO = new PG_L13001_Mantenim_de_Art();
        artDAO.agregarArticulo(3003, "Tablet", 650.00 , "A", 2002, 1000 );
        
        assertEquals(4, artDAO.getNumerodeRegistros() );
        
        artDAO.agregarArticulo( 3004, "Smartphone", -34.30 , "A", 2004, 1001 );
        assertEquals(4, artDAO.getNumerodeRegistros() );
        
    }
}
