package juego.modelo;

/**
 * @author Jesús Martínez Taboada & Diego Gonzalez Roman
 */

public class Tablero {

	private Celda[][] celdas;
	
	private int numeroFilas, numeroColumnas;
	
	public Tablero(int filas, int columnas) {
		celdas = new Celda[filas][columnas];
		this.numeroFilas = filas;
		this.numeroColumnas = columnas;
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				celdas[i][j] = new Celda(i,j);
			}
		}
	}

	/**
	 * Coloca la piedra en la celda (doble enganche).
	 * 
	 * @param piedra piedra
	 * @param celda celda
	 */
	
	public void colocar(Piedra piedra, Celda celda) {
		celda.establecerPiedra(piedra);
		piedra.establecerCelda(celda);
	}
	
	public Celda obtenerCelda(int fila, int columna) {
		return celdas[fila][columna];
	}
	
	public Celda obtenerCeldaConMismasCoordenadas(Celda celda) {
		return celdas[fila][columna];
	}
	
	public boolean estaEnTablero(Celda celda) {
		//assert(numeroFilas > 8) && (numeroColumnas > 8);
		//si se cumple que las coordenadas están en los límites del tablero, entonces
		//el programa continúa ejecutándose; en caso contrario, se detiene.
	}
	
	public int obtenerNumeroPiedras(Color color) {
		
	}
	
	public int obtenerNumeroFilas() {
		return this.numeroFilas;
		
	}
	
	public int obtenerNumeroColumnas() {
		return this.numeroColumnas;
	}
	
	public boolean estaCompleto() {
		//if(celdas[][] == ) 	System.out.println("El tablero tiene alguna celda vacía");
		//else 	System.out.println("El tablero no tiene ninguna celda vacía");
	}
	
	public ArrayList obtenerCeldasAdyacentes(Celda celda){
		
		

	}

	public int obtenerGradosDeLibertad(Celda celda){
		return 4;  //calcular grado de libertad, hay que hacer de lo ultimo

	}

	public Tablero generarCopia(){

	}

	public ArrayList obtenerGruposDelJugador(Jugador jugador){

	}

	public String toString() {
		String resultado = nombre + "-" + color;
		return resultado;
	}
	
	/*public static void main(String[] args) {
		Tablero tablero = new Tablero(3,3);
		Pieza pieza = new Pieza(Color.BLANCO);
		Celda celda = tablero.obtenerCelda(0, 0);
		tablero.colocar(pieza, celda);
		
	}*/
}