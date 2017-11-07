package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */


public enum Color {

	BLANCO('O'), NEGRO('X');
	private char carácter;
	
	private Color(char letra){  //constructor siempre se llama igual que la clase
		carácter = letra;
	}
	
	public char toChar() {
		return carácter;
	}
	
	/*public static void main(String[] args) {
		Jugador jugador =
		
		*/
}
