package generador;

import java.util.Random;

public class edad {
	
	public int generarAltura() {
		Random edades = new Random();
		int edad = edades.nextInt(99);
		return edad;
	}
}
