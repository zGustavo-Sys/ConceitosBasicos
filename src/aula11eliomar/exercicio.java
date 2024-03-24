package aula11eliomar;

import java.util.Scanner;

public class exercicio {

  public static void main(String[] args) {

    int maior = 0;
    Scanner input = new Scanner(System.in);

    for (int contador = 0; contador < 10; contador++) {

      System.out.println("Digite um valor:");
      int valor = input.nextInt();
      if (valor > maior) {
        maior = valor;

      }

    }

    System.out.println(maior);

  }

}
