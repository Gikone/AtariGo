package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/** Clase Piedra
 */
public class Piedra {

	/**argumento tipo Color */
	private Color color;

	/**argumento tipo Celda */
	private Celda celda;

	/** Metodo constructor Piedra
	 */
	public Piedra(Color color) {
		this.color = color;//obtenerColor();
		this.colocarEn(celda);
	}

	/** Metodo obtenerColor
	 * la piedra tiene un color asociado
	 * @return color
	 */
	public Color obtenerColor() {
		return this.color;
	}

	/** Metodo colocarEn
	 *asocia una piedra a una celda
	 * @param celda celda
	 */
	public void colocarEn(Celda celda){
		this.celda = celda;
	
	}

	/** Metodo obtenerCelda
	 *@return piedra
	 */
	public Celda obtenerCelda() { 
		return celda;
	}

	/** Metodo toString
	 *@return obtenerCelda().toString() + "-" + obtenerColor().toString()
	 */
	public String toString() {
		return obtenerCelda().toString() + "-" + obtenerColor().toString();
	}
}
