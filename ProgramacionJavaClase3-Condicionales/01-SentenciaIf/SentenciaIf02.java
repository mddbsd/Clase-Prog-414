public class SentenciaIf02 {
    public static void main(String[] args){
        
        System.out.print("ingrese un numero entero: ");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);
        
        if (x<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
    }
}