package ar.edu.unlam.pb2;

public class Camion extends Vehiculo implements Terrestre{
	
	private String marcaDelCamion;

	public Camion(Integer cod_identificado, String marcaDelCamion) {
		super(cod_identificado);
		this.marcaDelCamion = marcaDelCamion;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
