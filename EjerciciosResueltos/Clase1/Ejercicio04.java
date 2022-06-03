/*
 * Ejercicio 4
Realiza un conversor de dolares a pesos. La cantidad en dolares que se quiere
convertir deberá estar almacenada en una variable.

 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    double dolares = 600.00;
    int pesos = (int) (dolares * 0.0085);
    
    System.out.print(dolares + " dolares son " + pesos + " pesos.");
  }
}
