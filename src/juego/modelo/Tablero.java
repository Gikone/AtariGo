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


/**
 * Clase Tablero
 */
public class Tablero {

	/** Array de celdas */
	private Celda[][] celdas;

	/** ArrayList grupos*/
	private ArrayList grupos = new ArrayList();

	/**filas y columnas son numéricos enteros*/
	private int numeroFilas, numeroColumnas;

	/**
	 * Método constructor Tablero
	 */
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
	 * Método colocar
	 * Coloca la piedra en la celda con un doble enganche
	 * 
	 * @param piedra piedra
	 * @param celda celda
	 */
	public void colocar(Piedra piedra, Celda celda) {
		celda.establecerPiedra(piedra);
		piedra.colocarEn(celda);
	}

	/**
	 * Método obtenerCelda
	 * Devuelve las coordenadas de la celda
	 *
	 * @param fila int
	 * @param columna int
	 *
	 * @return celdas
	 */
	public Celda obtenerCelda(int fila, int columna) {

		return celdas[fila][columna];
	}

	/**
	 * Método obtenerCeldaConMismasCoordenadas
	 * Coloca la piedra en la celda con un doble enganche
	 *
	 * @param celda celda
	 */
	public Celda obtenerCeldaConMismasCoordenadas(Celda celda) {
		return obtenerCelda(celda.obtenerFila(), celda.obtenerColumna());
	}

	/**
	 * Método estaEnTablero
	 * Comprueba que unas coordenadas están en el tablero
	 *
	 * @param celda celda
	 */
	public boolean estaEnTablero(Celda celda) {
		if (celda.obtenerColumna() >= 0 && celda.obtenerColumna() < obtenerNumeroColumnas()) {
			if (celda.obtenerFila() >= 0 && celda.obtenerFila() < obtenerNumeroFilas()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método obtenerNumeroPiedras
	 * Cuenta el número de piedras de un color que hay en el tablero
	 *
	 * @param color color
	 */
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

	/**
	 * Método obtenerNumeroFilas
	 */
	public int obtenerNumeroFilas() {
		return this.numeroFilas;	
	}

	/**
	 * Método obtenerNumeroColumnas
	 */
	public int obtenerNumeroColumnas() {
		return this.numeroColumnas;
	}

	/**
	 * Método estaCompleto
	 */
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

	/**
	 * Método obtenerCeldasAdyacentes
	 * comprueba si están vacías las celdas próximas
	 *
	 * @param celda celda
	 *
	 * @return adyacentes
	 */
	public ArrayList obtenerCeldasAdyacentes(Celda celda) {
		ArrayList adyacentes = new ArrayList();		
		if(celda.obtenerFila() > 0) { //copiar y remplazar sentidos
			adyacentes.add(obtenerCelda(celda.obtenerFila() + Sentido.NORTE.obtenerDesplazamientoVertical(), celda.obtenerColumna()));
		}
		if(celda.obtenerFila() > 0) {
			adyacentes.add(obtenerCelda(celda.obtenerFila() + Sentido.SUR.obtenerDesplazamientoVertical(), celda.obtenerColumna()));
		}
		if(celda.obtenerFila() > 0) {
			adyacentes.add(obtenerCelda(celda.obtenerFila(), celda.obtenerColumna() + Sentido.ESTE.obtenerDesplazamientoHorizontal()));
		}
		if(celda.obtenerFila() > 0) {
			adyacentes.add(obtenerCelda(celda.obtenerFila(), celda.obtenerColumna() + Sentido.OESTE.obtenerDesplazamientoHorizontal()));
		}
		return adyacentes;
	}

	/**
	 * Método obtenerGradosDeLibertad
	 * Posibilidades de movimiento
	 *
	 * @param celda celda
	 *
	 * return gradosDeLibertad
	 */
	public int obtenerGradosDeLibertad(Celda celda) {
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

	/**
	 * Método generarCopia
	 * copia el tablero
	 *
	 * @return copiaTablero
	 */
	public Tablero generarCopia() {
		Tablero copiaTablero = new Tablero(numeroFilas, numeroColumnas);
        	for (int i = 0; i < obtenerNumeroColumnas(); i++) {
			for (int j = 0; j < obtenerNumeroFilas(); j++) {
				if ( ! obtenerCelda(i,j).estaVacia())
					copiaTablero.colocar(obtenerCelda(i,j).obtenerPiedra(),obtenerCelda(i,j));
			}
        	}
        	return copiaTablero;
	}

	/**
	 * Método obtenerGruposDelJugador
	 * devuelve una lista
	 *
	 * @param jugador jugador
	 *
	 * @return gurposEncontrados
	 */
	public ArrayList obtenerGruposDelJugador(Jugador jugador){
		ArrayList gruposEncontrados = new ArrayList();
		for (int i = 0; i < grupos.size(); i++) {
			if(((Grupo) grupos.get(i)).obtenerColor() == jugador.obtenerColor()) {
				gruposEncontrados.add(grupos.get(i));
			}
		}
		return gruposEncontrados;
	}

	/**
	 * Método String
	 */
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
