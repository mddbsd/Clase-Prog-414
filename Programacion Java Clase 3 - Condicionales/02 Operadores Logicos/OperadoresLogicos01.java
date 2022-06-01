public class OperadoresLogicos01 {
    public static void main(String[] args){
        
        System.out.println("adivina el numero");
        System.out.print("introduce un numero entre 1 y 100 ");
        String linea = System.console().readLine();
        int n = Integer.parseInt(linea);
        
        if((n<1)||(n>100)){
            System.out.println("el numero esta entre 1 y 100 ");
            System.out.print("segunda oportunidad, introduce otro numero ");
            linea = System.console().readLine();
            n=Integer.parseInt(linea);
        }

        if (n==24){
            System.out.println("es correcto");
        }else{
            System.out.println("el numero es incorrecto");
        }
    }
}
