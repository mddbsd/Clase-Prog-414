public class CuentaPositivos {
    public static void main(String[] args){
        System.out.println("Valla introdiciendo numeros enteros pulsando la tecla ENTER");
        System.out.println("Para dejar de introducir numeros, ingrese un numero negativo");

        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;
        while(numeroIntroducido>=0){
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            cuentaNumeros ++; //Incrementa la variable cuentaNumeros
            suma += numeroIntroducido; //Equivale a suma = suma + numeroIntroducido
        }
        System.out.println("Se introdujeron " + cuentaNumeros + " numeros positivos.");
        System.out.println("La suma total es: " + (suma - numeroIntroducido));
    }
}
