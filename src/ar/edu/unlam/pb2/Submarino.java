package ar.edu.unlam.pb2;

public class Submarino extends Vehiculo implements Acuatico{
	
	private String modeloDelSubmarino;
	private Double profundidadActual = 0.0;
	
	public Submarino(Integer cod_identificado, String modeloDelSubmarino) {
		super(cod_identificado);
		this.modeloDelSubmarino = modeloDelSubmarino;
		
	}

	@Override
	public Double getProfundidad() {
		
		return profundidadActual ;
	}
	
	

}
