public class Aleatorio06 {
    public static void main(String[] args){
        System.out.println("Genera al azar piedra, papel o tijera");
        int mano = (int)(Math.random()*3);
        switch(mano){
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            default:
        }
    }
}
