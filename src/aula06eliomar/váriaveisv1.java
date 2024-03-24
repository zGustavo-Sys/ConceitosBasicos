package aula06eliomar;

/*ASSUNTO ALVO: Variáveis, declaração, tipos primitivos, 
atribuição de valores, operadores, metodo de saida, concatenação.

Cauculo de Media de notas. */

public class váriaveisv1 { // inicio variaveis

  public static void main(String[] args) {

    float nota1, nota2, nota3;
    int quantDeNotas;
    String nomeAluno;

    nota1 = 7f;
    nota2 = 5.8f;
    nota3 = 8.4f;

    quantDeNotas = 3;
    nomeAluno = "Gustavo";

    float mediaNotasAlunos = (nota1 + nota2 + nota3) / quantDeNotas;

    System.out.println("Sua Nota é:\n" + mediaNotasAlunos);

  }

} // fim variaveis
