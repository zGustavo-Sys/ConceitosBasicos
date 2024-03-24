package aula08eliomar;

import javafx.beans.binding.IntegerBinding;

/* conversão entre tipos primitivos - Variaveis como Classes 
- Conversão entre classes - Conversao entre primitivos e classes
- conversao entre numericos e string */

public class casting {

  public static void main(String[] args) {

    // forma errada -> float a = 1.4; // casting -> colocar a variavel desejada
    // entre parentes, e no caso do float, podemos colocar o f no fim.

    float a = 1.4f;
    double b = 2.8;
    int c = (int) 3.4; // nesse caso seria impresso apenas o 3

    // int c = (int) b;

    /*
     * para declarar variaveis como classes, basta iniciar o
     * tipo primitivo com Maiuscula, exemplo "Double b" com
     * exceçao do int que se utiliza "Intenger"
     */

    Float n = Float.valueOf(1); // valueof recebe o valor e converte
    Double m = Double.valueOf(1);

  }

}
