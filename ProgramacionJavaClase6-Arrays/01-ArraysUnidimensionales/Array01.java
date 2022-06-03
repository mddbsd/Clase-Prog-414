public class Array01 {
    public static void main(String[] args){
        int[] n; //Se define el array
        n = new int[4]; //Se reservan 4 espacios para datos enteros
        
        n[0] = 20;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;
        
        System.out.println("Los valores del array son los siguientes: ");
        System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", ");
        int suma = n[0] + n[3];
        System.out.println("\nLa suma del primer elemento mas el ultimo da: " + suma);
    }
}
