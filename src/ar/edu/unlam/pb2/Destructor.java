package ar.edu.unlam.pb2;

public class Destructor extends Vehiculo implements Acuatico {
	
	private String marcaDeDestructor;

	public Destructor(Integer cod_identificado, String marcaDeDestructor) {
		super(cod_identificado);
		this.marcaDeDestructor = marcaDeDestructor;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
