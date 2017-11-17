package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/**
 * Clase Piedra
 */
public class Piedra {

	/**argumento tipo Color */
	private Color color;

	/**argumento tipo Celda */
	private Celda celda;

	/**
	 * Método constructor Piedra
	 */
	public Piedra(Color color) {
		this.color = color;//obtenerColor();
		this.colocarEn(celda);
	}

	/**
	 * Método obtenerColor
	 * la piedra tiene un color asociado
	 * @return color
	 */
	public Color obtenerColor() {
		return this.color;
	}

	/**
	 * Método colocarEn
	 * asocia una piedra a una celda
	 * @param celda celda
	 */
	public void colocarEn(Celda celda){
		this.celda = celda;
	}

	/**
	 * Método obtenerCelda
	 * @return piedra
	 */
	public Celda obtenerCelda() { 
		return celda;
	}

	/**
	 * Metodo toString
	 * @return obtenerCelda().toString() + "-" + obtenerColor().toString()
	 */
	public String toString() {
		return obtenerCelda().toString() + "-" + obtenerColor().toString();
	}
}
