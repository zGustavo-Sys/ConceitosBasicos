package aula10eliomar;

import java.util.Scanner;

public class exercicio {

  public static void main(String[] args) {

    int idade_votante, data_nascimento, ano_atual;

    Scanner input = new Scanner(System.in);

    System.out.println("em que ano você nasceu?");
    data_nascimento = input.nextInt();
    System.out.println("em que ano você está?");
    ano_atual = input.nextInt();

    idade_votante = ano_atual - data_nascimento;

    System.out.println("sua idade é " + idade_votante + " anos");

    if ((idade_votante >= 18) && (idade_votante <= 70)) {

      System.out.println("Seu Voto é obrigatório");

    }

    else if ((idade_votante >= 16) || (idade_votante > 70)) {

      System.out.println("Seu Voto é facultativo");
    }

    if (idade_votante < 16) {

      System.out.println("Você não vota");

    }

  }

}
