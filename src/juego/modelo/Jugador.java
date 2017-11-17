package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/** Clase Jugador
 */
public class Jugador {

	/**String nombre del jugador */
	private String nombre;

	/**Color asociado al jugador */
	private Color color;

	/** Metodo constructor Jugador
	 * @param nombre string
	 * @param color color
	 */
	public Jugador(String nombre, Color color){
		this.nombre = nombre;
		this.color = color;

	}

	/** Metodo obtenerColor
	 *@return color
	 */
	public Color obtenerColor() {
		return color;
	}

	/** Metodo obtenerNombre
	 *@return nombre
	 */
	public String obtenerNombre() {
		return nombre;
	}
	
	/** Metodo generarPiedra
	 * Genera una nueva piedra para el jugador
	 * @return piedra
	 */
	
	public Piedra generarPiedra() {
		Piedra piedra = new Piedra(this.obtenerColor());
		return piedra;
	}

	/** Metodo toString
	 *@return resultado
	 */
	public String toString() {
		//devuelve el estado del jugador en
		//formato cadena de caracteres con su nombre y color asociado
		String resultado = nombre + "/" + color;
		return resultado;
	}	

}