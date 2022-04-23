package ar.edu.unlp.info.oo2.accesobd;

public class Cliente {
	
	private int contra;
	private boolean autenticacion;
	
	public Cliente(int i, boolean aut) {
		
		this.contra = i;
		this.autenticacion = aut;
	}
	
//	public int getContra() {
//		
//		return this.contra;
//	}
	
	public boolean getAuteticacion() {
		
		return this.autenticacion;
	}
}
