package ar.edu.unlam.pb2;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico  {
	
	private String modeloDelAnfibio;
	private Double profundidadActual = 0.0;
	private Double velocidadActual = 0.0;

	public Anfibio(Integer cod_identificado, String modeloDelAnfibio) {
		super(cod_identificado);
		this.modeloDelAnfibio = modeloDelAnfibio;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidadActual;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidadActual;
	}
	
	

	

}
