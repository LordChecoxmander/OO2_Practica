package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestFileDecorator {
	
	
	private File archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new ArchConcreto("pip", ".txt", 64.00, LocalDate.of(1999, 7, 13), LocalDate.of(2000, 3, 16), "lectura");
	}
    @Test
    public void testPrimerCaso() {
    	//test -> nombre - extension
    	File e = new PrintExtension(archivo);
    	File n = new PrintNombre(e);
    	assertEquals("pip - .txt", n.preetyPrint());
    } 
    
    @Test
    public void testSegundoCaso() {
    	// test -> nombre - extension - fecha de creacion
    	File f = new PrintFechCrea(archivo);
    	File e = new PrintExtension(f);
    	File n = new PrintNombre(e); 
    	assertEquals("pip - .txt - 1999-07-13", n.preetyPrint());	
    }
    
    @Test
    public void testTercerCaso() {
    	// test -> permisos - nombre - extension - tamaño
    	File f = new PrintTamanio(archivo);
    	File e = new PrintExtension(f);
    	File n = new PrintNombre(e);
    	File p = new PrintPermisos(n);
    	assertEquals("lectura - pip - .txt - 64.0", p.preetyPrint());	
    }
	
	
	
	
	
	
	
	
	
}
