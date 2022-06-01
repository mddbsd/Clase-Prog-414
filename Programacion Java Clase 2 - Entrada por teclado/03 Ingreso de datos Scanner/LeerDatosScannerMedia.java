import java.util.Scanner;
public class LeerDatosScannerMedia {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce 3 numeros separados por espacio: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();
        double media = (x1+x2+x3)/3;
        System.out.println("La media de los 3 numeros es: "+media);
    }
}
