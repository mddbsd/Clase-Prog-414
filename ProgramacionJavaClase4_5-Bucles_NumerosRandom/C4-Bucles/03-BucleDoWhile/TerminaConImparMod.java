import java.util.Scanner;
public class TerminaConImparMod {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numero;
        char desicion = 'n';

        do{
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(System.console().readLine());
            if(numero % 2 == 0){
                System.out.println("Me gusta el numero " + numero);
                System.out.println("Desea continuar? (s/n) ");
                desicion = s.next().charAt(0);

                while((desicion != 's') && (desicion != 'n')){
                    System.out.println("Opcion incorrecta, intentelo nuevamente");
                    desicion = s.next().charAt(0);
                }

            }else{
                System.out.println("No me gustan los numeros impares, chau");
            }
        }while((numero % 2 == 0) && (desicion == 's'));
    }
}