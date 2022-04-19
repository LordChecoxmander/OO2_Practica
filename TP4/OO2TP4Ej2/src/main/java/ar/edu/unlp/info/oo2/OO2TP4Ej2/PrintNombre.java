package ar.edu.unlp.info.oo2.OO2TP4Ej2;

public class PrintNombre extends FileDecorator{
	
	
	public PrintNombre(File f) {
		super(f);
		
	}

	public String addNombre() {
		return this.getNombre();
	}
	
	@Override
	public String print() {
		return super.getNombre().toString();
	}
		 
	
}