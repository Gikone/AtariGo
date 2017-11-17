package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */
/**
 * Clase celda la cual viene dada por coordenadas dadas por fila y columna
 *
 */
public class Celda {

	/**Valor numerico para fila */
	private int fila;

	/**Valor numerico para fila */
	private int columna;

    /**Definimos piedra como tipo Piedra */
	private Piedra piedra;

	/** Metodo constructor Celda definido por fila y columna*/
	public Celda(int fila, int columna){
		this.fila = fila;
		this.columna = columna;
	}
	/**Metodo obtenerPiedra
     * @return piedra
     */

	public Piedra obtenerPiedra() {
		return piedra;
	}

    /**Metodo obtenerColorDePiedra
     * Da a cada piedra un color
     * @return piedra.obtenerColor
     * devuelve un metodo de la clase piedra
     */

    public Color obtenerColorDePiedra() {
		return piedra.obtenerColor();
	}

    /**Metodo establecerPiedra
     *Se coloca na piedra en una celda
     * @param piedra piedra
     */

    public void establecerPiedra(Piedra piedra) {
		this.piedra = piedra;
	}

    /**Metodo estaVacia
     * Consulta si la celda tiene piedra o no
     * @return piedra
     */

    public boolean estaVacia() {
		return piedra == null;
	}

    /**Metodo obtenerFila
     * obtiene la fila de la celda
     * @return fila
     */

    public int obtenerFila() {
		return fila;
	}

    /**Metodo obtenerColumna
     * obtiene la columna de la celda
     * @return columna
     */

    public int obtenerColumna() {
		return columna;
	}

    /**Metodo tieneIgualesCoordenadas
     * comprueba si la celda actual y la pasada como argumento tienen la misma fila y columna
     * @param Celda celda
     * @return obtenerFila() == celda.obtenerFila() && obtenerColumna() == celda.obtenerColumna()
     */

    public boolean tieneIgualesCoordenadas(Celda celda) {
		return obtenerFila() == celda.obtenerFila() && obtenerColumna() == celda.obtenerColumna();
	}

    /**Metodo eliminarPiedra
     * se desvincula la piedra de la celda
     */
	public void eliminarPiedra() {
		this.piedra = null;	
	}
    /**Metodo String
     * devuelve el estado de la celda
     * @return resultado
     */
	public String toString() { 
		String resultado = "("+ fila + "/" + columna+")";
		return resultado;
	}
}
