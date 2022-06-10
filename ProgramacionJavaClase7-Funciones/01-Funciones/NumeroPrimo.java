public class NumeroPrimo{public static void main(String[] args){
        System.out.print("Ingrese un numero entero positivo ");
        int n = Integer.parseInt(System.console().readLine());

        boolean esPrimo = true;
        for (int i = 2; i < n; i++){
            // Si es divisible por cualquiera de estos numeros, no es primo
            if ((n % i) == 0){
                esPrimo = false;
            }
            // Si no se pudo dividir por ninguno de los de arriba, es primo
        }               
        
        if (esPrimo){
            System.out.printf("El numero %d es primo\n", n);
        } else {
            System.out.println("El numero " + n + " no es primo");
        }
    }
}