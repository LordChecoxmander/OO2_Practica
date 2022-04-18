package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import java.time.LocalDate;

public class PrintFechCrea extends FileDecorator{

	public PrintFechCrea(File f) {
		super(f);
		
	}
	
	public LocalDate addFechCrea() {
		return super.getFechCrea();
	}
	
	@Override
	public String print() {
		return super.getFechCrea().toString();
	}
	
}
