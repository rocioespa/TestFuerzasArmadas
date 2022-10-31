package ar.edu.unlam.pb2;

import java.util.*;

public class FuerzaArmada {
	
	private Set<Vehiculo> convoy;
	private Set<Vehiculo> convoyListoParaLaBatalla;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new HashSet<>();
		this.convoyListoParaLaBatalla = new TreeSet<>();
		this.batallas = new HashMap<>();
	}

	
	public Set<Vehiculo> getConvoyListoParaLaBatalla() {
		return convoyListoParaLaBatalla;
	}


	public void setConvoyListoParaLaBatalla(Set<Vehiculo> convoyListoParaLaBatalla) {
		this.convoyListoParaLaBatalla = convoyListoParaLaBatalla;
	}


	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Map<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}


	public void asignarBatalla( Batalla batalla) {
		this.batallas.put(batalla.getNombre(), batalla);
		
	}


	public Boolean enviarALaBatalla(Batalla batalla, Integer codVehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		TipoDeBatalla estiloDeBatalla = batalla.getTipo();
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getCod_identificado() == codVehiculo) {
				switch (estiloDeBatalla) {
				case TERRESTRE:
					if(vehiculo instanceof Terrestre ) {
						convoyListoParaLaBatalla.add(vehiculo);
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
				case ACUATICO:
					if(vehiculo instanceof Acuatico ) {
						convoyListoParaLaBatalla.add(vehiculo);
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
	
				case AEREO:
					if(vehiculo instanceof Volador ) {
						convoyListoParaLaBatalla.add(vehiculo);
						return true;
					}
					else {
						throw new VehiculoIncompatible();
					}
				case NAVAL:
					convoyListoParaLaBatalla.add(vehiculo);
					return true;
				}
			}
		}
		  throw new VehiculoInexistente();
		
	}


	


	
	

}
