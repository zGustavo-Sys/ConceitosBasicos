package aula12eliomar;

import java.util.Scanner;

public class exercício {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double base = 0, altura = 0;

    System.out.println("Digite a base");
    base = input.nextDouble();

    System.out.println("Digite a altura");
    altura = input.nextDouble();

    double retorno = calculoArea_Altura(base, altura);
    System.out.println(retorno);

  }

  public static double calculoArea_Altura(double base, double altura) {

    return base * altura;

  }

}
