package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import java.time.LocalDate;

public class ArchConcreto implements File {
	
	private String nombre;
	private String extension;
	private	double tamanio;
	private LocalDate fechCrea;
	private LocalDate fechMod;
	private	String permisos;
	
	public ArchConcreto(String nom, String ext, double tamanio, LocalDate fc, LocalDate fmod, String perm) {
		this.nombre = nom;
		this.extension = ext;
		this.tamanio = tamanio;
		this.fechCrea = fc;
		this.fechMod = fmod;
		this.permisos = perm;
	}
	/*
	 *  
	 
	 */
	@Override
	public String preetyPrint() {
		return "";
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public String getExtension() {
		return extension;
	}
	@Override
	public Double getTamanio() {
		return tamanio;
	}
	@Override
	public LocalDate getFechCrea() {
		return fechCrea;
	}
	@Override
	public LocalDate getFechMod() {
		return fechMod;
	}
	@Override
	public String getPermisos() {
		return this.permisos;
	}
	
	
	
}
