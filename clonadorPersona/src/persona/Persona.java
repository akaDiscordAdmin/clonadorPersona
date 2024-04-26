package persona;

public class Persona {
	
	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	
	/**
	 * Construcor de una persona
	 * @param nombre su atributo nombre en caracteres alfanumericos
	 * @param peso su atributo peso en numeros enteros
	 * @param altura su atributo altura en numeros enteros
	 * @param edad su atributo edad en numeros enteros
	 */
	public Persona(String nombre, int peso, int altura, int edad) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	/**
	 * Metodo que devuelve el nombre de la persona deseada
	 * @return el nombre de la persona creada
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo que establece un nombre a la persona deseada
	 * @param nombre el nombre que se desea establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo que devuelve el peso de la persona deseada
	 * @return el peso de la persona creada
	 */
	public int getPeso() {
		return peso;
	}
	
	/**
	 * Metodo que establece un nombre a la persona deseada
	 * @param peso el peso que se desea establecer
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	/**
	 * Metodo que devuelve la altura de la persona deseada
	 * @return la altura de la persona creada
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * Metodo que establece una altura a la persona deseada
	 * @param altura la altura que se desea establecer
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * Metodo que devuelve la edad de la persona deseada
	 * @return la edad de la persona creada
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Metodo que establece una edad a la persona deseada
	 * @param edad la edad que se desea establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "[nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}
	
	
	
}
