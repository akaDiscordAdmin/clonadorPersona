package clonador;

import java.util.ArrayList;
import java.util.List;
import generador.*;

import persona.Persona;

public class ClonadorPersona {
	
	private String nombre;

	/**
	 * Constructor del Clonador de Personas
	 * @param nombre el nombre del clonador
	 */
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 * @return 
	 */
	public List<Persona> generarClones(String nombre) {
		List<Persona> personas = new ArrayList<Persona>();
		
		for(int i=0; i<10; i++) {
			altura a = new altura();
			int altura = a.generarAltura();
			edad b = new edad();
			int edad = b.generarEdad();
			peso c = new peso();
			int peso = c.generarPeso();
			
			personas.add(new Persona (nombre, peso, altura, edad));
		}
		return personas;
	}
}
