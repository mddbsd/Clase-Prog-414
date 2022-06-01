/*
 * 3. Realiza un conversor de pesos a dolares. La cantidad de dolares
 *    que se quiere convertir debe ser introducida por teclado.
 *
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la cantidad de pesos que quiere convertir: ");
    int pesos = Integer.parseInt(System.console().readLine());

    double dolares = pesetas / 119.39;

    System.out.printf("%d pesos son %.2f dolares.", pesos, dolares);
  }
}
