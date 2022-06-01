public class SentenciaIf01 {
    public static void main(String[] args){

        System.out.print("cual es la capital de rusia? ");
        String respuesta=System.console().readLine();
        
        if (respuesta.equals("moscu")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
}