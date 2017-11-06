package juego.modelo;

/**
 * 
 * @author Diego Gonzalez Roman 
 * @author Jesus Martinez Taboada
 *
 */

public class Jugador {

	private String nombre;
	
	private Color color;
	
	public Jugador(String nombre, Color color){
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
		Piedra piedra = new Piedra(this.obtenerColor(), this.obtenerCelda());
		return piedra;
	}
	
	public String toString() {
		//devuelve el estado del jugador en
		//formato cadena de caracteres con su nombre y color asociado
		String resultado = nombre + "/" + color;
		return resultado;
	}	
	
	/*public static void main(String[] args) {
		Color color = new color;
		}
		*/
}