public class Ejercicio9 {
    public static void main(String[] args){
    System.out.println("Digite un número que no pase de los cinco digitos: ");                                            
    
    int numero = Integer.parseInt(System.console().readLine());

    if((numero >= 0) && (numero < 10) || (numero > -10) && (numero <= 0)){
        System.out.println("El número digitado tiene 1 digito.");
    }else if((numero >= 10) && (numero < 100) || (numero > -100) && (numero <= -10)){
        System.out.println("El número digitado tiene 2 digitos.");
    }else if((numero >= 100) && (numero < 1000) || (numero > -1000) && (numero <= -100)){
        System.out.println("El número digitado tiene 3 digitos.");
    }else if((numero >= 1000) && (numero < 10000) || (numero > -10000) && (numero <= -1000)){
        System.out.println("El número digitado tiene 4 digitos.");
    }else if((numero >= 10000) && (numero < 100000) || (numero > -100000) && (numero <= 10000)){
        System.out.println("El número digitado tiene 5 digitos.");
    }else{
        System.out.println("El número está fuera de los límites.");
        }
    
    }

}






