package ar.edu.unlam.pb2;

import java.util.Objects;

public class Vehiculo {
	
	private Integer cod_identificado;

	public Vehiculo(Integer cod_identificado) {
		super();
		this.cod_identificado = cod_identificado;
	}

	public Integer getCod_identificado() {
		return cod_identificado;
	}

	public void setCod_identificado(Integer cod_identificado) {
		this.cod_identificado = cod_identificado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod_identificado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(cod_identificado, other.cod_identificado);
	}

	
	

}
