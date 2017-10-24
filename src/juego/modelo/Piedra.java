package juego.modelo;

/**
 * 
 *@author Diego Gonzalez Roman & Jesus Martinez Taboada
 *
 */

public class Piedra {
	
	private static Color color; //ponemos static porque una piedra tiene siempre asociado un color

	private Celda celda;
	
	public Piedra(Color color, Celda celda) {
		this.establecerColor(color);
		this.colocarEn(celda);
	}
	
	public Color obtenerColor() {
		return color;
	}
	
	/*private void establecerColor(Color color) {
		this.color = color;
	}
	
	public void establecerCelda(Celda celda) {
		this.celda = celda;
	}*/
	
	public void colocarEn(Celda celda){
		this.celda = celda; //aqui hay que asociar una piedra a una celda
	
	}  
	
	public Celda obtenerCelda() {
		return celda;
	}
	
	public String toString() {
		return obtenerCelda().toString() + "-" + obtenerColor().toString();
	}
}
