public class LeeNumerosVar {
    public static void main(String[] args){
        System.out.print("Introduzca un numero ");
        int primerNumero = Integer.parseInt(System.console().readLine());
        System.out.print("Introzuzca otro numero ");
        int segundoNumero = Integer.parseInt(System.console().readLine());
        int total=(2*primerNumero)+segundoNumero;
        System.out.println("El primer numero es "+primerNumero);
        System.out.println("Y el segundo "+segundoNumero);
        System.out.println("El doble del primer numero mas el segundo es "+total);
    }
}
