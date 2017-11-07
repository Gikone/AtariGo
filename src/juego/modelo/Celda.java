package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

public class Celda {
	
	private int fila;
	
	private int columna;
	
	private Piedra piedra;
	
	public Celda(int fila, int columna){
		this.fila = fila;
		this.columna = columna;
	}
	
	public Piedra obtenerPiedra() {
		return piedra;
	}
	
	public Color obtenerColorDePiedra() {
		return piedra.obtenerColor();
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
	
	public boolean tieneIgualesCoordenadas(Celda celda) { 
		return obtenerFila() == celda.obtenerFila() && obtenerColumna() == celda.obtenerColumna();
		
	
	}
	
	public void eliminarPiedra() {
		this.piedra = null;	
	}
	
	public String toString() { 
		String resultado = "("+ fila + "/" + columna+")";
		return resultado;
	}
}
