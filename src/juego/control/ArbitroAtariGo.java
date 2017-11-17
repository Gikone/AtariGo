package juego.control;

import juego.modelo.Celda;
import juego.modelo.Color;
import juego.modelo.Jugador;
import juego.modelo.Tablero;

/**
 * 
 * @author Diego González Román
 * @author Jesús Martínez Taboada
 *
 */

/**
 * Clase árbitro
 */
public class ArbitroAtariGo {
	
	private Tablero tablero;
	
	private Jugador[] jugadores;
	
	/**
	 * Constructor del árbitro
	 * 
	 */
	public ArbitroAtariGo(Tablero tablero){
		this.tablero = tablero;
	}
	
	/**
	 * Primera invocacion: registra jugador con piedras negras(turno inicial).
	 * Segunda invocacion: registra jugador con piedras blancas.
	 * Sucesivas invocaciones: nada.
	 * 
	 */
	public void registrarJugadoresEnOrden(String nombre) {
		if (jugadores[0] == null){
			jugadores[0] = new Jugador(nombre, Color.NEGRO);
		}else{
			jugadores[1] = new Jugador(nombre, Color.BLANCO);
		}		
	}
	
	/**
	 * Este método devuelve el jugador con turno
	 *
	 * @return jugadores
	 *		turno
	 */
	public Jugador obtenerJugadorConTurno() {
		Jugador jugadorTurno = new Jugador();
		if(esMovimientoLegal == true){
			/*.*/jugar();
		}
		return jugadores[0];
	}
	
	/**
	 * Este método devuelve el jugador sin turno
	 *
	 * @return jugadores
	 *		turno
	 */
	public Jugador obtenerJugadorSinTurno() {
		return jugadores[1];
	}
	
	/**
	 * Este método avanza turno segun que jugador ha realizado el ultimo movimiento.
	 */
	public void cambiarTurno() {
		obtenerJugadorConTurno();
	}
	
	/**
	 * Este método devuelve el tablero de juego.
	 *
	 * @return tablero
	 */
	public Tablero obtenerTablero() {
		return tablero;
	}
	
	/**
	 * Este método permite consultar si el juego está acabado. El juego finaliza cuando un
	 * jugador ha realizado una captura sobre el contrario.
	 */
	public boolean estaAcabado() {
		return false; //terminar luego, muy compleja	
	}
	
	/**
	 * Este método permite obtener el ganador del juego
	 */
	public Jugador obtenerGanador() {
		return jugadores[0]; // esta sin terminar, es la mas complicada
	}
	
	/**
	 * realiza la colocación de la piedra del turno actual en la celda. Al colocar una
	 * piedra se tienen que actualizar los grupos actuales para dicho jugador. Si la piedra nueva no es
	 * adyacente a otros grupos del mismo color, formara un grupo inicial de una piedra. Pero si es
	 * adyacente a otros grupos, comprobando los cuatro sentidos, se deben unir. Para ello se puede
	 * formar un nuevo grupo con la unión de las celdas de ambos, y eliminar de la lista de grupos el
  	 * grupo absorbido. Al inicio de la ejecución de este método no se debe invocar al método
	 * esMovimientoLegal puesto que se supone que siempre ha sido consultada previamente la
	 * legalidad de la jugada. Finalmente, gestiona el cambio de turno.
	 */
	public void jugar(Celda celda) {
		//voy a colocar la piedra en la celda con el doble enganche
		for(jugadores[/*aquí hay que especificar el jugadorturno de alguna manera*/]) {
			celda.establecerPiedra(piedra);
			piedra.colocarEn(celda);
			//aquí creo que hay que hacer lo de unir y luego llamar a los métodos eliminarPiedras de la clase Grupo
			// y eliminarPiedra de la clase Celda pero igual es una ida de olla
		}
		/*for(Tablero.celdas[i].[j]*/
		cambiarTurno();
	}
	
	/**
	 * comprueba si la jugada es legal en base a las reglas del juego: la
	 * celda seleccionada, o bien está vacía, o bien el movimiento no genera una situación de suicidio
	 * Para comprobar el suicidio, se debe generar una copia del tablero actual, y realizar el movimiento
	 * sobre dicha copia, comprobando si realmente se produce suicidio o captura sobre la copia. De
	 * esta forma el tablero original nunca se ve afectado.
	 */
	public boolean esMovimientoLegal(Celda celda) {
		return true;
	}
}
