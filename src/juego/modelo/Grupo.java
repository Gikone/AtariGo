package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

import java.util.ArrayList;

public class Grupo {

	private ArrayList celdas = new ArrayList(); // todavia no se ha dado con <tipo>

	private Tablero tablero;

	private int id = 0;



	public Grupo(Celda celda, Tablero tablero) {
		this.id = id++;
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
		Celda celda = (Celda) celdas.get(0);
		if(celda.estaVacia()){
		    return null;

        }
        return celda.obtenerColorDePiedra();
	}

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

	public int obtenerTamaño() {
		return celdas.size();

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
		for(int i = 0; i < obtenerTamaño(); i++){
            Celda celda = (Celda) celdas.get(i);
		    celda.eliminarPiedra();
		}
	}

	public Grupo generarCopiaEnOtroTablero(Tablero otroTablero) { //esta mal corregir
		otroTablero = this.tablero;
		return new Grupo(celda, otroTablero);
	}

	public String toString() {
		// devuelve el contenido del objeto en formato cadena de caracteres
        return null;
	}

}
