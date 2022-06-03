public class Aleatorio02 {
    public static void main(String[] args){
        System.out.println("20 numeros aleatorios entre 0 y 10");
        System.out.println("Sin llegar al 10");
        for(int i = 1; i <=20; i++){
            System.out.println(Math.random()*10 + " ");
        }
    }
}
