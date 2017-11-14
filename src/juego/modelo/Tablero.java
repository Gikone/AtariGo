package juego.modelo;

import juego.util.Sentido;

import java.util.ArrayList;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

public class Tablero {

	private Celda[][] celdas;

	private ArrayList grupos = new ArrayList();
	
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
		piedra.colocarEn(celda);
	}
	
	public Celda obtenerCelda(int fila, int columna) {

		return celdas[fila][columna];
	}
	

	public Celda obtenerCeldaConMismasCoordenadas(Celda celda) {
		return obtenerCelda(celda.obtenerFila(), celda.obtenerColumna());
	}

	public boolean estaEnTablero(Celda celda) {
		if (celda.obtenerColumna() >= 0 && celda.obtenerColumna() < obtenerNumeroColumnas()) {
			if (celda.obtenerFila() >= 0 && celda.obtenerFila() < obtenerNumeroFilas()) {
				return true;
			}
		}
		return false;

		//si se cumple que las coordenadas están en los límites del tablero, entonces
		//el programa continúa ejecutándose; en caso contrario, se detiene.
	}
	
	public int obtenerNumeroPiedras(Color color) {
		int contador = 0;
		for (int i = 0; i < obtenerNumeroColumnas(); i++) {
			for (int j = 0; j < obtenerNumeroFilas(); j++) {
				if(!obtenerCelda(j,i).estaVacia() && obtenerCelda(j,i).obtenerColorDePiedra() == color){
					contador ++;
				}
			}
		}
		return contador;
	}
	
	public int obtenerNumeroFilas() {
		return this.numeroFilas;
		
	}
	
	public int obtenerNumeroColumnas() {
		return this.numeroColumnas;
	}
	
	public boolean estaCompleto() {
		for (int i = 0; i < obtenerNumeroColumnas(); i++) {
			for (int j = 0; j < obtenerNumeroFilas(); j++) {
				if(obtenerCelda(j,i).estaVacia()){
					return false;
				}
			}
		}
		return true;

		//if(celdas[][] == ) 	System.out.println("El tablero tiene alguna celda vacía");
		//else 	System.out.println("El tablero no tiene ninguna celda vacía");
	}
	
	public ArrayList obtenerCeldasAdyacentes(Celda celda){
		ArrayList adyacentes = new ArrayList();
		if(celda.obtenerFila() > 0) { //copiar y remplazar sentidos
			adyacentes.add(obtenerCelda(celda.obtenerFila() + Sentido.NORTE.obtenerDesplazamientoVertical(), celda.obtenerColumna()));
		}
		if(celda.obtenerFila() > 0) {
			adyacentes.add(obtenerCelda(celda.obtenerFila() + Sentido.SUR.obtenerDesplazamientoVertical(), celda.obtenerColumna()));
		}
		if(celda.obtenerFila() > 0){
			adyacentes.add(obtenerCelda(celda.obtenerFila(), celda.obtenerColumna() + Sentido.ESTE.obtenerDesplazamientoHorizontal()));
        }
		if(celda.obtenerFila() > 0){
			adyacentes.add(obtenerCelda(celda.obtenerFila(), celda.obtenerColumna() + Sentido.OESTE.obtenerDesplazamientoHorizontal()));
		}
        return adyacentes;
	}

	public int obtenerGradosDeLibertad(Celda celda){
		ArrayList adyacentes = new ArrayList();
		adyacentes = obtenerCeldasAdyacentes(celda);
		int gradosLibertad = 0;
		for (int i = 0; i < adyacentes.size(); i++) {
			Celda adyacente = (Celda) adyacentes.get(i);
			if(adyacente.estaVacia()){
				gradosLibertad++;
			}
		}
		return gradosLibertad;

	}

	public Tablero generarCopia(){
		Tablero copiaTablero = new Tablero(numeroFilas, numeroColumnas);

	}

	public ArrayList obtenerGruposDelJugador(Jugador jugador){ //arraylist con <>
		ArrayList gruposEncontrados = new ArrayList();
		for (int i = 0; i < grupos.size(); i++) {
			if(((Grupo) grupos.get(i)).obtenerColor() == jugador.obtenerColor()){
				gruposEncontrados.add(grupos.get(i));
			}
		}
		return gruposEncontrados;
	}

	public String toString() {
		//String resultado = nombre + "-" + color;
		return null;
	}
	
	/*public static void main(String[] args) {
		Tablero tablero = new Tablero(3,3);
		Piedra pieza = new Piedra(Color.BLANCO);
		Celda celda = tablero.obtenerCelda(0, 0);
		tablero.colocar(pieza, celda);
		
	}*/
}