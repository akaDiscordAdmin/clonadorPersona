package generador;

import java.util.Random;

public class altura {
	
	public int generarAltura() {
		Random alturas = new Random();
		int altura = alturas.nextInt(200);
		return altura;
	}
}
