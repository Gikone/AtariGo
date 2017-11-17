package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/**
 * Clase Jugador
 */
public class Jugador {

	/* String nombre del jugador */
	private String nombre;

	/* Color asociado al jugador */
	private Color color;

	/**
	 * Método constructor Jugador
	 * @param nombre string
	 * @param color color
	 */
	public Jugador(String nombre, Color color){
		this.nombre = nombre;
		this.color = color;

	}

	/**
	 * Método obtenerColor
	 * @return color
	 */
	public Color obtenerColor() {
		return color;
	}

	/**
	 * Método obtenerNombre
	 * @return nombre
	 */
	public String obtenerNombre() {
		return nombre;
	}
	
	/**
	 * Método generarPiedra
	 * Genera una nueva piedra para el jugador
	 * @return piedra
	 */
	public Piedra generarPiedra() {
		Piedra piedra = new Piedra(this.obtenerColor());
		return piedra;
	}

	/**
	 * Método toString
	 * devuelve el estado del jugador en formato
	 * cadena de caracteres con su nombre y color asociado
	 * @return resultado
	 */
	public String toString() {
		String resultado = nombre + "/" + color;
		return resultado;
	}	
}
