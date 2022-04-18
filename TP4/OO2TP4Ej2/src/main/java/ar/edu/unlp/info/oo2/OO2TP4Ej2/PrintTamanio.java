package ar.edu.unlp.info.oo2.OO2TP4Ej2;

public class PrintTamanio extends FileDecorator{

	public PrintTamanio(File f) {
		super(f);
		
	}
	
	public Double addTamanio() {
		return super.getTamanio();
	}
	
	@Override
	public String print() {
		return super.getTamanio().toString();
	}
	
}
