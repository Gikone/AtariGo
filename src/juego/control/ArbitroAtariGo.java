package juego.control;

import juego.modelo.Tablero;

/**
 * 
 * @author Diego Gonzalez Rom�n & Jesus Martinez Taboada
 *
 */

public class ArbitroAtariGo {
	
	private Tablero tablero;
	
	private Jugador jugador;
	
	
	ArbitroAtariGo(Tablero tablero, Jugador jugador){ //El constructor genera el tablero
		this.tablero = tablero;
		this.jugador = jugador;
		
	}
	
	public /*static*/ void registrarJugadoresEnOrden(String nombre) {
		/*Primera invocacion: registra jugador con piedras negras(turno inicial).
		*Segunda invocacion: registra jugador con piedras blancas.
		*Sucesivas invocaciones: nada.
		*/
		
	}
	
	public Jugador obtenerJugadorConTurno() {
		
	}
	
	public Jugador obtenerJugadorSinTurno() {
		
	}
	
	public void cambiarTurno() {
		//Avanza turno segun que jugador ha realizado el ultimo movimiento.
		 
		 
	}
	
	public Tablero obtenerTablero() {
		
	}
	
	
	public boolean estaAcabado() {
		//permite consultar si el juego está acabado. El juego finaliza cuando un
		//jugador ha realizado una captura sobre el contrario.

		
	}
	
	public Jugador obtenerGanador() {
		
	
	}
	
	public void jugar(Celda celda) {
		/*realiza la colocación de la piedra del turno actual en la celda. Al colocar una
		* piedra se tienen que actualizar los grupos actuales para dicho jugador. Si la piedra nueva no es
		* adyacente a otros grupos del mismo color, formara un grupo inicial de una piedra. Pero si es
		* adyacente a otros grupos, comprobando los cuatro sentidos, se deben unir. Para ello se puede
		* formar un nuevo grupo con la unión de las celdas de ambos, y eliminar de la lista de grupos el
  		* grupo absorbido. Al inicio de la ejecución de este método no se debe invocar al método
		* esMovimientoLegal puesto que se supone que siempre ha sido consultada previamente la
		* legalidad de la jugada. Finalmente, gestiona el cambio de turno.
		*/
		
	}
	
	public boolean esMovimientoLegal(Celda celda, Tablero nuevoTablero) { //donde marcamos que nuevoTablero es de tipo Tablero
		/*comprueba si la jugada es legal en base a las reglas del juego: la
		* celda seleccionada, o bien está vacía, o bien el movimiento no genera una situación de suicidio
		* Para comprobar el suicidio, se debe generar una copia del tablero actual, y realizar el movimiento
		* sobre dicha copia, comprobando si realmente se produce suicidio o captura sobre la copia. De
		* esta forma el tablero original nunca se ve afectado.
		*/
		
		
		this.tablero = nuevoTablero;
		return piedra == null;
	}
	
}
