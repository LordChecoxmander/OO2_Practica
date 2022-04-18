package ar.edu.unlp.info.oo2.OO2TP4Ej2;

public class PrintExtension extends FileDecorator {
		
	
	public PrintExtension(File f) {
		super(f);
		
	}

	public String addExtension() {
		return super.getExtension();
	}
	
	@Override
	public String print() {
		return super.getExtension();
	}
	
}
