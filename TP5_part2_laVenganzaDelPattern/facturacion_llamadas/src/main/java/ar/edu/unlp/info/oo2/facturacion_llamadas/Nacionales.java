package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Nacionales extends Llamada{
	
	
	public Nacionales (Persoona emisor, Persoona remitente, int dur) {
		super(emisor, remitente, dur);
	}
	
	public double calcularCosto() {
//		auxc += l.dur *3 + (l.dur*3*0.21);
		return this.getDuracion()*3+ (this.getDuracion()*3*0.21);
	}
	
}

