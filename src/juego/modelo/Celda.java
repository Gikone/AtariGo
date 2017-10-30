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
