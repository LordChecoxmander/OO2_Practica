package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
	
//    DatabaseAccess database;
    DatabaseProxy dbProxy;
    Cliente cliaut;
    Cliente cliNot;
    
    @BeforeEach
    void setUp() throws Exception {
    	this.cliaut = new Cliente(3, true);
    	this.cliNot = new Cliente(3, false);
//    	this.database = new DatabaseRealAccess();
        
    }

    @Test
    void testGetSearchResultsAut() {
    	this.dbProxy = new DatabaseProxy(cliaut);
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbProxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.dbProxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRowAut() {
    	this.dbProxy = new DatabaseProxy(cliaut);
        assertEquals(3, this.dbProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dbProxy.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testNotAut() {
    	this.dbProxy = new DatabaseProxy(cliNot);
        assertEquals(0, this.dbProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Collections.emptyList(), this.dbProxy.getSearchResults("select * from comics where id=3"));
    }
    
}