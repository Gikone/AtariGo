package juego.modelo;

/**
 * 
 * @author Diego Gonzalez Roman 
 * @author Jesus Martinez Taboada
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
	Color c1, c2;
}
