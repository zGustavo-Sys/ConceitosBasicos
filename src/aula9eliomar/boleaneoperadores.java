package aula9eliomar;

public class boleaneoperadores {

  public static void main(String[] args) {

    // Boolean a = true; // Java aceita apenas a palavra, nada de 0 e 1

    boolean a = (1 == 1) && (2 == 2);

    // > maior que < menor que != diferente
    // && -> Equivale a E e || Equivale a Ou
    // && inves de & economiza memorai, uma vez que encerra no primeiro false.
    // || ao menos uma verdadeira && todas verdadeiras

    boolean g = (1 < 2) && (2 < 5) || (1 == 2); // nesse caso o operador considera o que tem antes e o proximo

    System.out.println(a);
  }

}
