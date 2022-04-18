package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import java.time.LocalDate;

public class PrintFechMod extends FileDecorator{

	public PrintFechMod(File f) {
		super(f);
		
	}
	
	
	public LocalDate addFechMod() {
		return super.getFechMod();
	}
	
	@Override
	public String print() {
		return super.getFechMod().toString();
	}
}
