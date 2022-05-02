package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {

	protected Persoona emisor;
	protected Persoona remitente;
	protected int dur;
	
	public Llamada() {
		
	}
	
	public Llamada(Persoona emisor, Persoona remitente, int dur) {
	
		this.emisor= emisor;
		this.remitente= remitente; 
		this.dur = dur; 
	} 
	
	public abstract double calcularCosto();

	public Persoona getEmisor() {
		return this.emisor;
	}
	
	public void setEmisor(Persoona q) {
		emisor = q;
	}
	public Persoona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}
	
	public void añadirLlamadaEmisor(Llamada llam) {
		this.emisor.añadirLlamada(llam);
	}
	
	public int getDuracion() {
		return this.dur;
	}
}
