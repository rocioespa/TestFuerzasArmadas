package ar.edu.unlam.pb2;

public class Tanque extends Vehiculo implements Terrestre {

	private String modeloDelTanque;
	private Double velocidadActual = 0.0;

	public Tanque(Integer cod_identificado, String modeloDelTanque) {
		super(cod_identificado);
		this.modeloDelTanque = modeloDelTanque;
	}

	@Override
	public Double getVelocidad() {

		return velocidadActual;
	}

}
