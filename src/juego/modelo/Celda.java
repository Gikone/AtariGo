package juego.modelo;

public class Celda {
	
	private int fila;
	
	private int columna;
	
	private Piedra piedra;
	
	private Color color;
	
	public Celda(int fila, int columna){
		this.fila = fila;
		this.columna = columna;
	}
	
	public Piedra obtenerPiedra() {
		return piedra;
	}
	
	public Color obtenerColorDePiedra() {
		return color;
	}
	
	public void establecerPiedra(Piedra piedra) {
		this.piedra = piedra;
	}
	
	public boolean estaVacia() {
		return piedra == null;
	}
	
	public int obtenerFila() {
		return fila;
	}
	
	public int obtenerColumna() {
		return columna;
	}
	
	public boolean tieneIgualesCoordenadas(Celda celda) { //modificado 26/10
		return obtenerFila() == celda.obtenerFila() && obtenerColumna() == celda.obtenerColumna();
		
	
	}
	
	public void eliminarPiedra() {
		/*Una celda puede ser vaciada, a través del método eliminarPiedra. La piedra pasa a estar
		 *también desvinculado de la celda. 
		 */
		
		
	}
	
	public String toString() { //modificado 26/10
		String resultado = "("+ fila + "/" + columna+")";
		return resultado;
	}
}
