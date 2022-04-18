package ar.edu.unlp.info.oo2.OO2TP4Ej2;

import java.time.LocalDate;

public abstract class FileDecorator implements File{
		
	private File fileDeco;
	
	
	public FileDecorator(File f) {
		
		this.fileDeco = f;
	}

	public abstract String print();
	
	@Override
	public String preetyPrint() {
		if(this.fileDeco.preetyPrint() != "") {
			return this.print() + " - " + this.fileDeco.preetyPrint();
		}
		return this.print();
	} 
	  
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.fileDeco.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.fileDeco.getExtension();
	}

	@Override
	public Double getTamanio() {
		// TODO Auto-generated method stub
		return this.fileDeco.getTamanio();
	}

	@Override
	public LocalDate getFechCrea() {
		// TODO Auto-generated method stub
		return this.fileDeco.getFechCrea();
	}

	@Override
	public LocalDate getFechMod() {
		// TODO Auto-generated method stub
		return this.fileDeco.getFechMod();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.fileDeco.getPermisos();
	}
		
	

	
	
	
	
	
	
}	
