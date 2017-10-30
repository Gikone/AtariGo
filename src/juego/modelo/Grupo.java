package juego.modelo;

/**
* @author Jesús Martínez Taboada 
* @author Diego González Román
*/

public class Grupo {
	
	private Celda celda;
	
	private Tablero tablero;
	
	private static int id = 0;
	
	Grupo(Celda celda, Tablero tablero){
		this.id = id++;
		this.celda = celda;
		this.tablero = tablero;
	}
	
	
	public static int obtenerId() {
		/*Cada vez que se instancia un grupo dicho contador debe incrementarse de tal forma que
		cada grupo tiene un único valor. Usamos un atributo estático.*/
		
		return id;
	}
	
	public Color obtenerColor() {
		/*debe devolver null al haber capturado grupo*/
		return color;
	}
	
	public boolean estaVivo() {
		return (obtenerGradosDeLibertad(celda) > 0); //terminado
	
	}

	public static int obtenerTamaño(tablero){
		return final int[i][j];
	}
	
	/*public static int[i][j] obtenerTamaño(final String celdas){
		return final int[i][j];
	}

	 * */

	public boolean contiene(Celda celda){

	}
	
	public void añadirCeldas(Grupo grupo){

	}

	public void eliminarPiedras(){
		

	}

	public Grupo generarCopiaEnOtroTablero(Tablero otroTablero){

	}

	public String toString() {
		//devuelve el contenido del objeto en
		//formato cadena de caracteres
		String resultado = nombre + "-" + color;
		return resultado;
	}	
	
}