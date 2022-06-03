/*
 * Ejercicio 7
Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) 

 */
public class Ejercicio07 {
  public static void main(String[] args) {
    char primeraLetra = 'a';
    char ultimaLetra = 'z';
    String palabra = "abecedario";
    
    System.out.println(primeraLetra + "" + ultimaLetra + palabra);
  }
}
