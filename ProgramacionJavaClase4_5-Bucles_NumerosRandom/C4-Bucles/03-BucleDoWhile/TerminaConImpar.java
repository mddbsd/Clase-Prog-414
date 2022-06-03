public class TerminaConImpar {
    public static void main(String[] args){
        int numero;
        do{
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(System.console().readLine());
            if(numero % 2 == 0){
                System.out.println("Me gusta el numero " + numero);
            }else{
                System.out.println("No me gustan los numeros impares, chau");
            }
        }while(numero % 2 == 0);
    }
}
