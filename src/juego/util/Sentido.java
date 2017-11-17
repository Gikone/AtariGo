package juego.util;

/**
 * Sentido para comprobar celdas adyacentes.
 * 
 * @author <a href="mailto:rmartico@ubu.es">Raúl Marticorena</a>
 * @author <a href="mailto:dcaubilla@ubu.es">David Caubilla</a>
 * @author González Román, Diego
 * @author Martínez Taboada, Jesús
 * 
 * @see juego.modelo.Tablero
 */
public enum Sentido {
	/** Norte. */
	NORTE(0, -1),
	/** Este. */
	ESTE(+1, 0),
	/** Sur. */
	SUR(0, +1),
	/** Oeste. */
	OESTE(-1, 0);

	/** Desplazamiento en horizontal. */
	private int desplazamientoHorizontal;

	/** Desplazamiento en vertical. */
	private int desplazamientoVertical;

	/**
	 * Constructor.
	 * 
	 * @param desplazamientoHorizontal desplazamiento en horizontal
	 * @param desplazamientoVertical desplazamiento en vertical
	 */
	private Sentido(int desplazamientoHorizontal, int desplazamientoVertical) {
		establecerDesplazamientoHorizontal(desplazamientoHorizontal);
		establecerDesplazamientoVertical(desplazamientoVertical);
	}

	/**
	 * Obtiene el desplazamiento en horizontal.
	 * 
	 * @return desplazamiento en horizontal
	 */
	public int obtenerDesplazamientoHorizontal() {
		return desplazamientoHorizontal;
	}

	/**
	 * Establece el desplazamiento en horizontal.
	 * 
	 * @param desplazamientoHorizontal desplazamiento en horizontal
	 */
	private void establecerDesplazamientoHorizontal(int desplazamientoHorizontal) {
		this.desplazamientoHorizontal = desplazamientoHorizontal;
	}

	/**
	 * Obtiene el desplazamiento en vertical.
	 * 
	 * @return desplazamiento en vertical
	 */
	public int obtenerDesplazamientoVertical() {
		return desplazamientoVertical;
	}

	/**
	 * Establece el desplazamiento en vertical.
	 * 
	 * @param desplazamientoVertical desplazamiento en vertical.
	 */
	private void establecerDesplazamientoVertical(int desplazamientoVertical) {
		this.desplazamientoVertical = desplazamientoVertical;
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		//Ejemplos de como hacerlo
		
		/*System.out.println(Sentido.NORTE +"-" + Sentido.NORTE.obtenerDesplazamientoHorizontal());
		System.out.println(Sentido.ESTE);
		System.out.println(Sentido.OESTE);
		System.out.println(Sentido.SUR);
		*/		
				
		/*Sentido[] todosLosSentidos = Sentido.values();
		for (int i = 0; i < todosLosSentidos.length; i++) {
			System.out.println(todosLosSentidos[i]+ " / " + todosLosSentidos[i]);
		}*/
		for(Sentido sentido : Sentido.values()) {
			System.out.println(sentido +" / " + sentido.obtenerDesplazamientoHorizontal() + sentido.obtenerDesplazamientoVertical());
		}
	}
}
