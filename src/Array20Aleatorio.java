
public class Array20Aleatorio {

public static void main(String[] args) {
    
    final int LONGITUDARRAY = 20;
    final int RANGOINICIO = 1;
    final int RANGOFIN = 10;
    int[] numerosAleatorios = new int[LONGITUDARRAY];
    
    for (int i = 0; i < LONGITUDARRAY; i++) {
      numerosAleatorios[i] = (int) (Math.random() * (RANGOFIN - RANGOINICIO + 1) + RANGOINICIO);
    }
    
    System.out.println("Contenido del array");
    for (int i = 0; i < LONGITUDARRAY; i++) {
      System.out.print(numerosAleatorios[i] + " ");
    }    
  }
  
}
