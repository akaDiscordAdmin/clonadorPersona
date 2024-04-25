package generador;

import java.util.Random;

public class peso {
	
	public int generarPeso() {
		Random pesos = new Random();
		int peso = pesos.nextInt(100);
		return peso;
	}
}
