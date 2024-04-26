package generador;

import persona.Persona;
import restricciones.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) {
		
		altura a = new altura();
		int altura = a.generarAltura();
		edad b = new edad();
		int edad = b.generarEdad();
		peso c = new peso();
		int peso = c.generarPeso();
		
		Persona p = new Persona(nombre, peso, altura, edad);
		
		return p;
	}

}
