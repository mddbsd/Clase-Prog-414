public class Array02 {
    public static void main(String[] args){
        int[] x = new int[5];

        x[0] = 8;
        x[1] = 33;
        x[2] = 200;
        x[3] = 150;
        x[4] = 11;

        System.out.println("El array tiene 5 elementos, cual quiere ver?");
        System.out.print("Introduzca un numero del 0 al 4: ");
        int indice = Integer.parseInt(System.console().readLine());
        System.out.print("El elemento en posicion " + indice);
        System.out.println(" es el " + x[indice]);
    }
}
