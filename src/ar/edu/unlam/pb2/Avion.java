package ar.edu.unlam.pb2;

public class Avion extends Vehiculo implements Volador{
	
	private String marca;
	private Double alturaDeVuelo = 0.0;

	public Avion(Integer cod_identificado, String marca) {
		super(cod_identificado);
		this.marca = marca;
		}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public Double getAltura() {
		
		return alturaDeVuelo;
	}

	
}
