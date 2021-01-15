package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Convertir;
class convertirTest {

	private String[][] parameterStrs = {
			{"-99","Temperature","GaucheDroite"},
			{"-100","Temperature","GaucheDroite"},
			{"2","Longeur","GaucheDroite"},
			{"-100","Temperature","DroiteGuauche"},
			{"-99","Temperature","DroiteGuauche"},
			{"-101","Temperature","DroiteGuauche"},
			{"1","Longeur","GaucheDroite"},
			{"-101","Temperature","GaucheDroite"},
			{"0","Longeur","GaucheDroite"},
			{"501","Temperature","GaucheDroite"},
			{"1","Longeur","DroiteGuauche"},
			{"500","Temperature","GaucheDroite"},
			{"2","Longeur","DroiteGuauche"},
			{"499","Temperature","GaucheDroite"},
			{"500","Temperature","DroiteGuauche"},
			{"501","Temperature","DroiteGuauche"},
			{"0","Longeur","DroiteGuauche"},
			{"499","Temperature","DroiteGuauche"}
	};

	@Test
	void test99TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[0][0]);
		String outil = parameterStrs[0][1];
		String sens = parameterStrs[0][2];
		assertTrue(" Temperature 99C to F ",outils.OutilTailleTemperature(outil, sens, val) == -146);		
	}

	@Test
	void test100TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[1][0]);
		String outil = parameterStrs[1][1];
		String sens = parameterStrs[1][2];
		assertTrue(" Temperature 100C to F ",outils.OutilTailleTemperature(outil, sens, val) == -148);		
	}
	

	@Test
	void test2LongeurGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[2][0]);
		String outil = parameterStrs[2][1];
		String sens = parameterStrs[2][2];
		assertTrue(" Longeur 2 miles to km ",outils.OutilTailleTemperature(outil, sens, val) == 3);		
	}

	@Test
	void test100TemperatureDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[3][0]);
		String outil = parameterStrs[3][1];
		String sens = parameterStrs[3][2];
		assertTrue(" Temperature 100F to C ",outils.OutilTailleTemperature(outil, sens, val) == -73);		
	}
	@Test
	void test99TemperatureDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[4][0]);
		String outil = parameterStrs[4][1];
		String sens = parameterStrs[4][2];
		assertTrue(" Temperature 99F to C ",outils.OutilTailleTemperature(outil, sens, val) == -72);		
	}
	@Test
	void test101TemperatureDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[5][0]);
		String outil = parameterStrs[5][1];
		String sens = parameterStrs[5][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
	}
	@Test
	void test1LongeurGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[6][0]);
		String outil = parameterStrs[6][1];
		String sens = parameterStrs[6][2];
		assertTrue(" Longeur 1 miles to km ",outils.OutilTailleTemperature(outil, sens, val) == 2);		
	}

	@Test
	void test101TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[7][0]);
		String outil = parameterStrs[7][1];
		String sens = parameterStrs[7][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
	}
	@Test
	void test0LongeurGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[8][0]);
		String outil = parameterStrs[8][1];
		String sens = parameterStrs[8][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
	}

	@Test
	void test501TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[9][0]);
		String outil = parameterStrs[9][1];
		String sens = parameterStrs[9][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
	}

	@Test
	void test1LongeurDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[10][0]);
		String outil = parameterStrs[10][1];
		String sens = parameterStrs[10][2];
		assertTrue(" Longeur 1 km to mile ",outils.OutilTailleTemperature(outil, sens, val) == 1);		
	}

	@Test
	void test500TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[11][0]);
		String outil = parameterStrs[11][1];
		String sens = parameterStrs[11][2];
		assertTrue(" Temperature 500C to F ",outils.OutilTailleTemperature(outil, sens, val) == 932);		
	}

	@Test
	void test2LongeurDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[12][0]);
		String outil = parameterStrs[12][1];
		String sens = parameterStrs[12][2];
		assertTrue(" Longeur 2 km to mile ",outils.OutilTailleTemperature(outil, sens, val) == 1);		
	}


	@Test
	void test499TemperatureGaucheDroite() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[13][0]);
		String outil = parameterStrs[13][1];
		String sens = parameterStrs[13][2];
		assertTrue(" Temperature 499C to F ",outils.OutilTailleTemperature(outil, sens, val) == 930);		
	}

	@Test
	void test500TemperatureDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[14][0]);
		String outil = parameterStrs[14][1];
		String sens = parameterStrs[14][2];
		assertTrue(" Temperature 500F to C ",outils.OutilTailleTemperature(outil, sens, val) == 260);		
	}

	@Test
	void test501TemperatureDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[15][0]);
		String outil = parameterStrs[15][1];
		String sens = parameterStrs[15][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
}
	@Test
	void test0LongeurDroiteGauche() throws Exception{
		Convertir outils = new Convertir();
		int val = Integer.parseInt(parameterStrs[16][0]);
		String outil = parameterStrs[16][1];
		String sens = parameterStrs[16][2];
		Assertions.assertThrows(Exception.class, () -> {
			outils.OutilTailleTemperature(outil, sens, val);
		  });
	}


}
