package ar.edu.unlam.pb2;

public class Portaviones extends Vehiculo implements Acuatico{
	
	private String marcaDePortAviones;

	public Portaviones(Integer cod_identificado, String marcaDePortAviones) {
		super(cod_identificado);
		this.marcaDePortAviones = marcaDePortAviones;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
