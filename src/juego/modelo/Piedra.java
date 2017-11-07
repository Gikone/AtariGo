package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */


public class Piedra {
	
	private Color color;

	private Celda celda;
	
	
	public Piedra(Color color) {
		this.color = color;//obtenerColor();
		this.colocarEn(celda);
	}
	
	public Color obtenerColor() {
		return this.color;
	}
	
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
