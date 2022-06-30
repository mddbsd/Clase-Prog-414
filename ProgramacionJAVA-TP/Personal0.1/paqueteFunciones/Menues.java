package paqueteFunciones;

public class Menues {
    /**
     * Imprime el menu principal
     */
    public static void menuPrincipal(){
        System.out.println("Compumundohipermegared Control de Personal");
        System.out.println("------------------------------------------");
        System.out.println("Menu principal");
        System.out.println("------------------------------------------");
        System.out.printf("1: Mostrar personal\n2: Total a pagar de categoria\n3: Salario de empleado\n4: Despedir empleado\n5: Contratar empleado\n6: Salir\n");
    }

    public static void seleccionCategoria(){
        System.out.println("Ingrese categoria");
        System.out.println("1: Tecnico Sr");
        System.out.println("2: Tecnico Jr");
        System.out.println("3: Administrativo");
        System.out.println("4: Staff general\n");
    }
}
