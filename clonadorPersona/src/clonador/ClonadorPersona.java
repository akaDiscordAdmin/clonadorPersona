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
	 * @throws Exception 
	 */
	public List<Persona> generarClones(String nombre) throws Exception {
		List<Persona> personas = new LinkedList<Persona>();
		
		for(int i=0; i<10; i++) {
			try {
			Persona p = FactoryPersona.getPersona(nombre);
			personas.add(0, p);
			} catch(Exception e) {}
		}
		return personas;
	}
}
