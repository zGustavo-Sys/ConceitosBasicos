package aula06eliomar;

import java.util.Scanner;

public class variáveisv2 {

  public static void main(String[] args) {

    float nota1, nota2, nota3;
    int quantDeNotas = 3;
    String nomeAluno;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite a sua primeira nota:");
    nota1 = input.nextFloat();
    System.out.println("Digite a sua segunda nota:");
    nota2 = input.nextFloat();
    System.out.println("Digite a sua terceira nota:");
    nota3 = input.nextFloat();
    System.out.println("Digite o seu nome:");
    nomeAluno = input.next();

    float mediaNotasAlunos = (nota1 + nota2 + nota3) / quantDeNotas;

    System.out.println(nomeAluno + ", Sua média é:" + mediaNotasAlunos);

  }

}
