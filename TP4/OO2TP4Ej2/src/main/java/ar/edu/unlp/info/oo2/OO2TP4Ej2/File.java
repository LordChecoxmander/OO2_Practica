package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import java.time.LocalDate;

public interface File {
	
	
	
	public String preetyPrint();
	
	public String getNombre();

	public String getExtension();

	public Double getTamanio();

	public LocalDate getFechCrea();

	public LocalDate getFechMod();

	public String getPermisos();
	
}
