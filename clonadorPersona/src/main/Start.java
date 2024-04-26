package main;

import clonador.ClonadorPersona;

public class Start {

	public static void main(String[] args) throws Exception {
		
		ClonadorPersona Juan = new ClonadorPersona("Juan");
		System.out.println(Juan.generarClones("Juan"));

	}

}
