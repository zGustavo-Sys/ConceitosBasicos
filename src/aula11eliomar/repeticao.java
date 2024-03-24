package aula11eliomar;

import java.util.Scanner;

public class repeticao {
  public static void main(String[] args) {

    int contador = 0;
    int x;

    Scanner parada = new Scanner(System.in);

    // condição de parada

    System.out.println("Qual o ciclo de repetições?");
    x = parada.nextInt();

    // - Inicialização - Condição - incremento

    /*
     * while (contador <= x) {
     * 
     * System.out.println(contador);
     * contador = contador + 1;
     * 
     * }
     */

    /*
     * for (int contador = 1; contador <= x; contador = contador + 1) {
     * 
     * System.out.println(contador);
     * 
     * }
     */

    do {

      System.out.println("Catapimba");
      contador = contador + 1;

    } while (contador < x);

  }

}
