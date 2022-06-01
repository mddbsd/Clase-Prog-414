public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("Digite un número: ");
        
        int numero = Integer.parseInt(System.console().readLine());

        int resto;
        resto = numero%2;

        int divisible;

        
        if(resto == 0){
            System.out.println("El número digitado es par");
        }else{
            System.out.println("El número digitado es impar");
        }

        
        if(numero%5 == 0){
            System.out.println("El número digitado es divisible por 5");
        }else{
            System.out.println("El número digitado no es divisible por 5");
        }
    
    }

}

