package juego.modelo;

import java.util.ArrayList;
/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

public class Grupo {

	private ArrayList<Celda> celdas; // declarar ArrayList<tipo> nombre

	private Tablero tablero;

	private int id = 0;

	public Grupo(Celda celda, Tablero tablero) {
		this.id = id++;
		//this.celda = celda;
		this.celdas = new ArrayList<Celda>; // istancio array vacío
		this.celdas.add(celda); // meto celda en array
		this.tablero = tablero;

	}

	public int obtenerId() {
		/*
		 * Cada vez que se instancia un grupo dicho contador debe incrementarse de tal
		 * forma que cada grupo tiene un único valor. Usamos un atributo estático.
		 */

		return id;
	}

	public Color obtenerColor() {
		/* debe devolver null al haber capturado grupo */

		if (estaVivo() == false) {
			return null;
		} else {
			return celda.obtenerColorDePiedra();
		}
	}

	public boolean estaVivo() {
		return (tablero.obtenerGradosDeLibertad(celda) > 0); // terminado

	}

	public int obtenerTamaño() {
		return (tablero.obtenerNumeroFilas() * tablero.obtenerNumeroColumnas());
	}

	public boolean contiene(Celda celda) {
		//comprueba las coordenadas de la celda para ver si está contenida en el grupo
		return tablero.estaEnTablero(celda);
	}

	public void añadirCeldas(Grupo grupo) {
		for(int i = 0; i < grupo.celdas.size(); i++){
			this.celdas.add(grupo.celdas.get(i));
		}
	}

	public void eliminarPiedras() {
		for(int i = 0; i < grupo.celdas.size(); i++){
			grupo.celdas.get(i).eliminarPiedra();
	//get(i) devuelve Celda por lo que ya no hay que poner la clase Celda al utilizar el método eliminarPiedra
		}
	}

	public Grupo generarCopiaEnOtroTablero(Tablero otroTablero) {
		otroTablero = this.tablero;
		return new Grupo(celda, otroTablero);
	}

	public String toString() {
		// devuelve el contenido del objeto en
		// formato cadena de caracteres
		String resultado = nombre + "-" + color;
		return resultado;
	}

}
