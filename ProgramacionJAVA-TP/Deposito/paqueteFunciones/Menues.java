package paqueteFunciones;

public class Menues {
    /**
     * Imprime el menu principal
     */
    public static void menuPrincipal(){
        System.out.println("Compumundohipermegared Control de Deposito");
        System.out.println("------------------------------------------");
        System.out.println("Menu principal");
        System.out.println("------------------------------------------");
        System.out.printf("1: Compra de stock\n2: Informe de stock\n3: Costo total de producto\n4: Costo de stock\n5: Retiro de stock\n6: Salir\n");
    }
    /**
     * Imprime el menu de productos
     */
    public static void menuProductos(){
        System.out.println("Selección de productos");
        System.out.println("----------------------");
        System.out.println("Ingrese un producto");
        System.out.printf("1: Gabinetes\n2: Memorias RAM\n3: Fuentes de alimentacion\n4: Microprocesadores\n5: Discos rigidos\n6: Motherboards\n7: Mouses\n8: Teclados\n9: Parlantes\n10: Microfonos\n");
    }
}
