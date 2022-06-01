public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("Digite las 3 notas para sacar el promedio.");
        
        int nota1 = Integer.parseInt(System.console().readLine()); 
        int nota2 = Integer.parseInt(System.console().readLine()); 
        int nota3 = Integer.parseInt(System.console().readLine()); 

        float promedio = ((nota1+nota2+nota3)/3);
        System.out.println("Promedio: " + promedio);

    }
}
