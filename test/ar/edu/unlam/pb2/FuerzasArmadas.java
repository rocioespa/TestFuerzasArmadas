package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuerzasArmadas {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Avion avionGuerra = new Avion(1, "A-10");
		
		Double valorEsperado = 0.0;
		Double valorObtenido = avionGuerra.getAltura();

		assertEquals(valorEsperado, valorObtenido);
	}


	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Tanque tanqueDeGuerra = new Tanque(5, "Renault FT");
		
		Double valorEsperado = 0.0;
		Double valorObtenido = tanqueDeGuerra.getVelocidad();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Submarino submarinoDeGuerra = new Submarino(8, "ARA - San Juan");
		
		Double valorEsperado = 0.0;
		Double valorObtenido = submarinoDeGuerra.getProfundidad();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		
		Anfibio tanqueAcuatico = new Anfibio(12, "LARC-5");
		
		Double valorEsperadoVelocidad = 0.0;
		Double valorObtenidoVelocidad = tanqueAcuatico.getVelocidad();
		Double valorEsperadoProfundidad = 0.0;
		Double valorObtenidoProfundidad = tanqueAcuatico.getProfundidad();
		
		assertEquals(valorEsperadoProfundidad, valorObtenidoProfundidad);
		assertEquals(valorEsperadoVelocidad, valorObtenidoVelocidad);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		HidroAvion ag600 = new HidroAvion(12, "AG600");

		Double valorEsperadoAltura = 0.0;
		Double valorObtenidoAltura = ag600.getAltura();
		Double valorEsperadoProfundidad = 0.0;
		Double valorObtenidoProfundidad = ag600.getProfundidad();
		
		assertEquals(valorEsperadoProfundidad, valorObtenidoProfundidad);
		assertEquals(valorEsperadoAltura, valorObtenidoAltura);
	}
	
	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));
		
		assertEquals(13, argentina.getConvoy().size());
	}
	
	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();
		Batalla batalla = new Batalla ("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		argentina.asignarBatalla(batalla);

		assertEquals(1, argentina.getBatallas().size());
	}
	
	
	@Test
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		Batalla batalla = new Batalla ("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		argentina.asignarBatalla(batalla);

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		assertTrue(argentina.enviarALaBatalla(batalla, 5));
		assertTrue(argentina.enviarALaBatalla(batalla, 6));
		assertTrue(argentina.enviarALaBatalla(batalla, 7));
		assertEquals(3, argentina.getConvoyListoParaLaBatalla().size());
	}
	
	@Test 
	public void queSePuedaPlanearLaBatallaSobreElOceano() throws VehiculoIncompatible, VehiculoInexistente {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		Batalla batalla = new Batalla ("San Lorenzo", TipoDeBatalla.ACUATICO, 100.5, 20.3);
		
		argentina.asignarBatalla(batalla);
		
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		assertEquals(1, argentina.getBatallas().size());
		
		assertTrue(argentina.enviarALaBatalla(batalla, 8));
		assertTrue(argentina.enviarALaBatalla(batalla, 9));
		assertTrue(argentina.enviarALaBatalla(batalla, 10));
		assertTrue(argentina.enviarALaBatalla(batalla, 11));
		
		assertEquals(4, argentina.getConvoyListoParaLaBatalla().size());
		
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		Batalla pacifico = new Batalla ("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);
		argentina.asignarBatalla(pacifico);
		assertEquals(1, argentina.getBatallas().size());
		assertTrue(argentina.enviarALaBatalla(pacifico, 8));
		assertTrue(argentina.enviarALaBatalla(pacifico, 9));
		assertTrue(argentina.enviarALaBatalla(pacifico, 10));
		assertTrue(argentina.enviarALaBatalla(pacifico,11));
		assertTrue(argentina.enviarALaBatalla(pacifico, 12));
		assertTrue(argentina.enviarALaBatalla(pacifico, 13));
		
		assertEquals(6, argentina.getConvoyListoParaLaBatalla().size());
		
	}
	
	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		Batalla sanLorenzo = new Batalla ("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		argentina.asignarBatalla(sanLorenzo);
		assertEquals(1, argentina.getBatallas().size());
		assertTrue(argentina.enviarALaBatalla(sanLorenzo, 5));
		assertTrue(argentina.enviarALaBatalla(sanLorenzo, 6));
		assertTrue(argentina.enviarALaBatalla(sanLorenzo, 7));
		assertTrue(argentina.enviarALaBatalla(sanLorenzo, 11));
		
		assertEquals(4, argentina.getConvoyListoParaLaBatalla().size());

	}
	
	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		Batalla sanLorenzo = new Batalla ("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		argentina.asignarBatalla(sanLorenzo);
		assertEquals(1, argentina.getBatallas().size());
		

		assertFalse(argentina.enviarALaBatalla(sanLorenzo, 4));
	}
	

}
