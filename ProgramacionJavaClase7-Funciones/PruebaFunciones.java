import matematicas.Varias;
import matematicas.Geometria;
/**
 * Prueba varias funciones 
 */
public class PruebaFunciones {
    public static void main(String[] args){
        int n;

        //Prueba esPrimo()

        System.out.print("Ingrese un numero entero positivo: ");
        n = Integer.parseInt(System.console().readLine());

        if(matematicas.Varias.esPrimo(n)){
            System.out.println("\nEl numero " + n + " es primo");
        }else{
            System.out.printf("\nEl numero %d no es primo", n);
        }

        //Prueba digitos()
        System.out.print("\nIngrese un numero entero positivo: ");
        n = Integer.parseInt(System.console().readLine());
        System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " digitos\n");

        //Prueba volumenCilindro()
        double r;
        double h;

        System.out.println("Volumen del cilindro");
        System.out.println("--------------------------");
        System.out.print("Ingrese el radio en metros: ");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese la altura en metros: ");
        h = Double.parseDouble(System.console().readLine());
    
        System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilindro(r, h) + " m3");
    }
}
