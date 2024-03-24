package aula12eliomar;

public class metodos {

  public static void main(String[] args) {

    float retorno = metodoSoma(0, 20, 30);

    /*
     * SEM PARAEMTRO E SEM RETORNO
     * 
     * public void nomeMetodo(){
     * 
     * System.out.println(".");
     * 
     * }
     * 
     * SEM RETORNO E COM PARAMETRO
     * 
     * public void nomeMetodo(int parametro){
     * 
     * System.out.println(parametro + 20);
     * 
     * }
     * 
     * COM PARAMETRO E COM RETORNO
     * 
     * public void nomeMetodo(int parametro){
     * 
     * return parametro+20;
     * 
     * }
     */

    System.out.println(retorno);

  }

  public static float metodoSoma(int a, float f, int x) {

    return (a + f + x);

  }

}
