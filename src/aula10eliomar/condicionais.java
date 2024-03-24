package aula10eliomar;

import java.util.Scanner;

public class condicionais {

  public static void main(String[] args) {

    double nota1, nota2, nota_final;
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a primeira nota do seu aluno:");
    nota1 = input.nextDouble();
    System.out.println("Digite a primeira nota do seu aluno:");
    nota2 = input.nextDouble();

    nota_final = (nota1 + nota2) / 2;

    /*
     * if (nota_final >= 6) {
     * 
     * System.out.println("Aluno aprovado");
     * 
     * } else {
     * System.out.println("Aluno Reprovado");
     * }
     */

    // Operador Ternário ->

    String resultado = (nota_final < 6) ? "Reprovado" : "Aprovado";
    System.out.println("O Aluno foi " + resultado);

  }

}
