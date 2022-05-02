package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Internacional extends Llamada{
	
	
	
	public Internacional (Persoona emisor, Persoona remitente, int dur) {
		super(emisor, remitente, dur);
	}
	
	
	public double calcularCosto() {
//		auxc += l.dur *200 + (l.dur*200*0.21);
		return this.getDuracion()*200+ (this.getDuracion()*200*0.21);
	}
	
}
