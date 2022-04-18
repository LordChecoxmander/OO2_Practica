package ar.edu.unlp.info.oo2.OO2TP4Ej2;

public class PrintPermisos extends FileDecorator{

	public PrintPermisos(File f) {
		super(f);
		
	}
	public String addPermisos() {
		return super.getPermisos();
	}
	
	@Override
	public String print() {
		return super.getPermisos();
	}
}
