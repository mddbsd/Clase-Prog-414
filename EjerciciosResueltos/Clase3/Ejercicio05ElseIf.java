/*
 * Ejercicio 5
Amplía el programa anterior para que diga la nota del boletín con else if
(<5 insuficiente, <6 suficiente, <7 bien, <8 notable o <9sobresaliente).

 */
public class Ejercicio05ElseIf {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    } else if (media < 6) {
      System.out.print("Suficiente");
    } else if (media < 7) {
      System.out.print("Bien");
    } else if (media < 9) {
      System.out.print("Notable");
    } else {
      System.out.print("Sobresaliente");
    }
  }
}
