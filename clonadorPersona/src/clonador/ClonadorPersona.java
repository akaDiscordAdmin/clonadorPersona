package clonador;

import java.util.LinkedList;
import java.util.List;
import generador.*;

import persona.Persona;
import restricciones.ValidadorPersona;

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
		List<Persona> personas = new LinkedList<Persona>();
		
		for(int i=0; i<10; i++) {
			Persona p = FactoryPersona.getPersona(nombre);
			
			boolean personaValida = ValidadorPersona.isValid(p);
			
			if(personaValida) {
				personas.add(0, p);
			}
			
			personas.add(0, p);
		}
		return personas;
	}
}
