package juego.modelo;

/**
 * 
 * @author González Román, Diego
 * 
 * @author Martínez Taboada, Jesús
 * 
 */

/**clase Color
 * define un color a las piedras
 * @return columna
 */

public enum Color {

	BLANCO('O'), NEGRO('X');
	private char carácter;
    /**Metodo constructor
     * @param  letra
     * permite ver de que color es cada caracter( O, X)
     */
	private Color(char letra){  //constructor siempre se llama igual que la clase
		carácter = letra;
	}

    /**Metodo toChar
     * @return caracter
     */
	public char toChar() {
		return carácter;
	}
	
	/*public static void main(String[] args) {
		Jugador jugador =
		
		*/
}
