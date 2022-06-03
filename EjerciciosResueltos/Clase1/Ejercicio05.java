/*
 * Ejercicio 5
Realiza un conversor de pesos a dolares. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.

 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int pesos = 10000;
    double dolares = pesos / 118.42;
    
    System.out.println(pesos + " pesos son " + dolares + " dolares.");
    // Para mostrar dos decimales se puede usar "printf"
    // en lugar de "print" o "println"
    System.out.printf("%d pesos son %.2f dolares.\n", pesos, dolares);
  }
}
