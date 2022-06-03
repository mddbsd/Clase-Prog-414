/*
 * Ejercicio 3
Escribe un programa que calcule el salario
semanal de un trabajador teniendo en cuenta que las horas
ordinarias (40 primeras horas de trabajo) se pagan a 250 pesos la
hora. A partir de la hora 41, se pagan a 300 pesos la hora.

 */
public class Ejercicio03 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 250 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 250) + ((horasTrabajadas - 40) * 300);
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " pesos");
  }
}
