/*
 * Ejercicio 2
Realiza un conversor de dolares a pesos. La cantidad de dolares que se quiere
convertir debe ser introducida por teclado.

 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la cantidad de dolares que quiere convertir: ");
    double dolares = Double.parseDouble(System.console().readLine());

    int pesos = (int) (dolares * 0.0084);
    
    System.out.printf("%.2f dolares son %d pesos.", dolares, pesos);
  }
}
