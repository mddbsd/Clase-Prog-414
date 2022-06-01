import java.util.Scanner;
public class LeerDatosScanner02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("introduce tu nombre y tu edad separados por un espacio: ");
        String nombre = s.next();
        int edad = s.nextInt();
        System.out.println("Tu nombre es "+nombre+" y tu edad "+edad);
    }
}
