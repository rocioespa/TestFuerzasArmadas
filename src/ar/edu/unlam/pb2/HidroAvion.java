package ar.edu.unlam.pb2;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{
	
	private String marcaDelHidroAvion;
	private Double profundidadActual = 0.0;
	private Double alturaAltual = 0.0;

	public HidroAvion(Integer cod_identificado, String marcaDelHidroAvion) {
		super(cod_identificado);
		this.marcaDelHidroAvion = marcaDelHidroAvion;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidadActual;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return alturaAltual;
	}
	
	

}
