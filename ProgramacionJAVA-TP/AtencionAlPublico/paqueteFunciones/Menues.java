package paqueteFunciones;

public class Menues {
    /**
     * Imprime el menu principal
     */
    public static void menuPrincipal(){
        System.out.println("Compumundohipermegared Atencion al publico");
        System.out.println("------------------------------------------");
        System.out.println("Menu principal");
        System.out.println("------------------------------------------");
        System.out.printf("1: Pedido a deposito\n2: Pedido a produccion\n3: Venta mayorista\n4: Venta minorista \n5; Informe de stock\n6: Salir\n");
    }
    /**
     * Imprime el menu de productos de deposito
     */
    public static void menuProductosDeposito(){
        System.out.println("Selección de productos");
        System.out.println("----------------------");
        System.out.println("Ingrese un producto");
        System.out.printf("1: Gabinetes\n2: Memorias RAM\n3: Fuentes de alimentacion\n4: Microprocesadores\n5: Discos rigidos\n6: Motherboards\n7: Mouses\n8: Teclados\n9: Parlantes\n10: Microfonos\n");
    }

    /**
     * Imprime el menu de productos de produccion
     */
    public static void menuProductosProduccion(){
        System.out.println("Selección de productos");
        System.out.println("----------------------");
        System.out.println("Ingrese un producto");
        System.out.printf("1: PC1\n2: PC2\n3: PC3\n");
    }
}
