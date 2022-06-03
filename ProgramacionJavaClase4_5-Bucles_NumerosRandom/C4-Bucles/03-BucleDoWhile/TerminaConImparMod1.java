public class TerminaConImparMod1 {
        public static void main(String[] args){
            int numero;
            char desicion = 'n';
    
            do{
                System.out.println("Ingrese un numero: ");
                numero = Integer.parseInt(System.console().readLine());
                if(numero % 2 == 0){
                    System.out.println("Me gusta el numero " + numero);
                    System.out.println("Desea continuar? (s/n) ");
                    desicion = System.console().readLine().charAt(0);
    
                    while((desicion != 's') && (desicion != 'n')){
                        System.out.println("Opcion incorrecta, intentelo nuevamente");
                        desicion = System.console().readLine().charAt(0);
                    }
    
                }else{
                    System.out.println("No me gustan los numeros impares, chau");
                }
            }while((numero % 2 == 0) && (desicion == 's'));
        }
}
