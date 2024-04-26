package generador;

import persona.Persona;
import restricciones.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) throws Exception {
		
		altura a = new altura();
		int altura = a.generarAltura();
		if(altura<=PersonaData.ALTURA_MIN || altura>=PersonaData.ALTURA_MAX) {
			throw new Exception("Altura fuera de los limites");
		}
		
		edad b = new edad();
		int edad = b.generarEdad();
		if(edad<=PersonaData.EDAD_MIN || edad>=PersonaData.EDAD_MAX) {
			throw new Exception("Edad fuera de los limites");
		}
		
		peso c = new peso();
		int peso = c.generarPeso();
		if(peso<=PersonaData.PESO_MIN || peso>=PersonaData.PESO_MAX) {
			throw new Exception("peso fuera de los limites");
		}
		Persona p = new Persona(nombre, peso, altura, edad);
		
		return p;
	}

}
