package juego.modelo;

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
		return color;
	}
	
	public void establecerPiedra(Piedra piedra) {
		this.piedra = piedra;
	}
	
	public boolean estaVacia() {
		boolean estado;
		if (pieza == null) {
			estado = true;
		} else {
			estado = false;
		}
		return estado; //version reducida -> return piedra == null;
	}
	
	public int obtenerFila() {
		return fila;
	}
	
	public int obtenerColumna() {
		return columna;
	}
	
	/*public boolean tieneIgualesCoordenadas(Celda otra) {
		this.celda = ;
		if( == fila) {
			
		}
		if( == columna) {
			
		}
	}
	*/
	public void eliminarPiedra() {
		
	}
	
	public String toString() {
		String resultado = nombre + "-" + color;
		return resultado;
	}
}
