public class NumeroPrimoConFuncion{
    // Programa Principal ------------------------------------------------------    
    public static void main(String[] args){
        System.out.print("Ingrese un numero entero positivo ");
        int n = Integer.parseInt(System.console().readLine());

        if (esPrimo(n)){
            System.out.printf("El numero %d es primo\n", n);
        } else {
            System.out.println("El numero " + n + " no es primo");
        }
    }

    // Funciones ---------------------------------------------------------------
    
    /** Comprueba si el numero ingresado es primo
     * Los numeros primos solo pueden ser divididos por 1 y por si mismos
     * Se divide el numero ingresado por todos los anteriores hasta el 2
     * mediante un bucle for. Si el modulo de alguna de esas divisiones es == 0
     * el numero no es primo.
     * 
     * @param x numero entero positivo
     * @return <code>true</code> si es primo
     * @return <code>false</code> si no es primo
     *
     */

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}