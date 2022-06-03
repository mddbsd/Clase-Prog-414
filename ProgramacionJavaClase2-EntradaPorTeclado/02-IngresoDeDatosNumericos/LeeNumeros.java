public class LeeNumeros {
    public static void main(String[] args){
        String linea;
        System.out.print("Introduzca un numero ");
        linea = System.console().readLine();
        int primerNumero;
        primerNumero=Integer.parseInt(linea);
        System.out.print("Introzuzca otro numero ");
        linea = System.console().readLine();
        int segundoNumero;
        segundoNumero=Integer.parseInt(linea);
        int total;
        total=(2*primerNumero)+segundoNumero;
        System.out.println("El primer numero es "+primerNumero);
        System.out.println("Y el segundo "+segundoNumero);
        System.out.println("El doble del primer numero mas el segundo es "+total);
    }
}
