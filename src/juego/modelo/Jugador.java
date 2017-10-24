package juego.modelo;

/**
 * 
 * @author Diego Gonzalez Roman & Jesus Martinez Taboada
 *
 */

public class Jugador {

	private String nombre;
	
	private Color color;
	
	Jugador(String nombre, Color color){
		this.nombre = nombre;
		this.color = color;
	}
	
	public Color obtenerColor() {
		return color;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	//Genera una nueva pieza del color actual del jugador
	public Piedra generarPiedra() {
		Piedra piedra = new Piedra(this.obtenerColor());
		return piedra;
	}
	
	public String toString() {
		//devuelve el contenido del objeto en
		//formato cadena de caracteres
		String resultado = nombre + "-" + color;
		return resultado;
	}	
}