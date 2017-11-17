package juego.modelo;

import java.util.ArrayList;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/**
 * Clase Grupo
 * representa un conjunto de piedras juntas
 */
public class Grupo {
	/** Se crea un ArrayList */
	private ArrayList celdas = new ArrayList();

	/** Método tablero tipo Tablero */
	private Tablero tablero;

	/** Damos al id el valor 0 */
	private int id = 0;


	/**
	 * Método constructor Grupo
	 * @param celda celda
	 * @param tablero tablero
	 */
	public Grupo(Celda celda, Tablero tablero) {
		this.id = id++;
		this.celdas.add(celda); // meto celda en array
		this.tablero = tablero;

	}

	/**
	 * Método obtenerId
	 * Cada vez que se instancia un grupo dicho contador debe incrementarse de tal forma que cada grupo tiene un único valor
	 * Usamos un atributo estático
	 * el método devuelve el identificador del grupo
	 *
	 * @return id
	 */
	public int obtenerId() {
		return id;
	}

	/**
	 * Método obtenerColor
	 * devuelve el color de las celdas contenidas en un grupo y null al haber capturado grupo
	 *
	 * @return obtenerColorDePiedra
	 */
	public Color obtenerColor() {
		Celda celda = (Celda) celdas.get(0);
		if(celda.estaVacia()){
		    return null;
        	}
        	return celda.obtenerColorDePiedra();
	}

	/**
	 * Método estaVivo
	 * devuelve true si los grados de libertad es mayor que cero
	 */
	public boolean estaVivo() {
		int gradoLibertad = 0; //contador
		for (int i = 0; i < obtenerTamaño(); i++) {
			Celda celda = (Celda) celdas.get(i);
	        	gradoLibertad += tablero.obtenerGradosDeLibertad(celda);
        	}
        	if (gradoLibertad != 0){
	        	return true;
        	}
        	return false;
	}

	/**
	 * Método obtenerTamaño
	 * tamaño de las celdas
	 *
	 * @return size
	 */
	public int obtenerTamaño() {
		return celdas.size();
	}

	/**
	 * Método contiene
	 * comprueba las coordenadas de la celda para ver si está contenida en el grupo
	 * @param celda celda
	 */
	public boolean contiene(Celda celda) {
		return tablero.estaEnTablero(celda);
	}

	/**
	 * Método añadirCeldas
	 * añade al grupo el conjunto de celdas pasado como argumento
	 * @param grupo grupo
	 */
	public void añadirCeldas(Grupo grupo) {
		for(int i = 0; i < grupo.celdas.size(); i++) {
			this.celdas.add(grupo.celdas.get(i));
		}
	}

	/**
	 * Método eliminarPiedras
	 * vacía de piedras el grupo
	 */
	public void eliminarPiedras() {
		for(int i = 0; i < obtenerTamaño(); i++){
            Celda celda = (Celda) celdas.get(i);
		    celda.eliminarPiedra();
		}
	}

	/**
	 * Método generarCopiaEnOtroTablero
	 * nuevo grupo cuyas celdas son las equivalentes al tablero actual
	 *
	 * @param tablero otrotablero
	 * @return grupo
	 */
	public Grupo generarCopiaEnOtroTablero(Tablero otroTablero) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = (Celda) celdas.get(i);
			Piedra piedra = new Piedra(celda.obtenerColorDePiedra());
			otroTablero.colocar(piedra, otroTablero.obtenerCeldaConMismasCoordenadas(celda));
		}
		Celda primeraCelda = (Celda) celdas.get(0);
		Celda primeraOtroTablero = otroTablero.obtenerCeldaConMismasCoordenadas(primeraCelda);
		Grupo grupo = new Grupo(primeraOtroTablero, otroTablero);
		for (int i = 1; i < celdas.size() ; i++) {
			Celda celda = (Celda) celdas.get(i);
			Celda otraCelda = otroTablero.obtenerCeldaConMismasCoordenadas(celda);
			Grupo grupoTemp = new Grupo(otraCelda, otroTablero);
			grupo.añadirCeldas(grupoTemp);
		}
		return grupo;
	}
	
	/**
	 * Método toString
	 * devuelve el contenido del objeto en formato cadena de caracteres
	 * 
	 * @return null
	 */
	public String toString() {
        	return null;
	}
}
