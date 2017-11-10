package juego.control;

public class ConfiguracionAtariGo {

  public static int TAMAÑO_POR_DEFECTO = 9;
  private static int TAMAÑOS[] = {9, 13, 19};   //movidaca de cuidao
  public static char LETRA_NO_UTILIZADA = 'l';

  //lo q pongo a continuac hay q poner algo en el constructor y decir si es public o private o dejarlo amigable
  public static int obtenerTamañoMaximo(){
    int maximo = 0;
    for (int i = 0; i < TAMAÑOS.length; i++) {
      if (TAMAÑOS[i] > maximo){
        maximo = TAMAÑOS[i];
      }
    }
    return maximo;
  }

  public static boolean esTamañoValido(int tamañoSugerido){
    for (int i = 0; i < TAMAÑOS.length; i++) {
      if (TAMAÑOS[i] == tamañoSugerido){
        return true;
      }
    }
    return false;
  }

  public static String generarAyuda(){
    return null;
  }
  
}
