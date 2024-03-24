package aula12eliomar;

import java.util.Scanner;

public class exercicio2 {

  static int voto = 0, candX = 0, candY = 0;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {

      System.out.println("Digite o seu voto");
      voto = input.nextInt();
      depositar(voto);

    }

    exibir_resultado();

  }

  public static void exibir_resultado() {

    System.out.println("Candidato X: " + candX);
    System.out.println("Candidato Y: " + candY);

  }

  public static void depositar(int vt) {

    if (vt == 13) {

      candX++;

    } else if (vt == 17) {

      candY++;

    }

  }

}
