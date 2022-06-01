/*
 *
 * 8. Escribe un programa que calcule el salario semanal de un empleado
 *    en base a las horas trabajadas, a razón de 250 pesos la hora.
 *
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.print("Iintroduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 250) + " pesos.");
  }
}
