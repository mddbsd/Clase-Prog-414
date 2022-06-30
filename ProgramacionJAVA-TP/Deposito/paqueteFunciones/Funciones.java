package paqueteFunciones;

public class Funciones {
    /**
     * Simula la retiro de stock
     * @param n Array que contiene el stock
     * @param j Constante para control de menu
     */
    public static void retiraStock(int n[][], int j){
        boolean salida = false;
        final int CONTROLOPCIONSALIDA = 3;

        do{
            paqueteFunciones.Menues.menuProductos();
            int producto = controlMenu(Integer.parseInt(System.console().readLine()), j);
            System.out.println("Ingrese la cantidad a retirar");
            int cantidad = controlMinStock(n, Integer.parseInt(System.console().readLine()), producto);
            n[producto-1][0] -= cantidad;
            System.out.println("Desea retirar mas productos?\n1: Si\n2: no");
            int opcionSalida = controlMenu(Integer.parseInt(System.console().readLine()), CONTROLOPCIONSALIDA);
            if (opcionSalida == 2){
                salida = true;
            }
        }while(!salida);
    }

    /**
     * Controla el stock maximo
     * @param n Array que contiene el stock
     * @param x cantidad a retirar
     * @param j Producto a compra (controla el indice del array)
     * @return devuelve la cantidad controlada por el programa
     */
    public static int controlMinStock(int n[][], int x, int j){
        while((x < 0 || x > 100)){
            System.out.println("Cantidad incorrecta");
            return x = 0;
        }
        while((n[j][0] - x) < 0){
            System.out.println("El stock supera el minimo");
            return x = 0;
        }
        return x;
    }
    /**
     * Simula la compra de stock
     * @param n Array que contiene el stock
     * @param j Constante para control de menu
     */
    public static void cargaStock(int n[][], int j){
        boolean salida = false;
        final int CONTROLOPCIONSALIDA = 3;
                  
        do{
            paqueteFunciones.Menues.menuProductos();
            int producto = controlMenu(Integer.parseInt(System.console().readLine()), j);
            System.out.println("Ingrese la cantidad a cargar");
            int cantidad = controlMaxStock(n, Integer.parseInt(System.console().readLine()), producto);
            n[producto-1][0] += cantidad;
            System.out.println("Desea comprar mas productos?\n1: Si\n2: no");
            int opcionSalida = controlMenu(Integer.parseInt(System.console().readLine()), CONTROLOPCIONSALIDA);
            if (opcionSalida == 2){
                salida = true;
            }
        }while(!salida);
    }
    
    /**
     * Controla el stock maximo
     * @param n Array que contiene el stock
     * @param x cantidad a comprar
     * @param j Producto a compra (controla el indice del array)
     * @return devuelve la cantidad controlada por el programa
     */
    public static int controlMaxStock(int n[][], int x, int j){
        while((x < 0 || x > 100)){
            System.out.println("Cantidad incorrecta ingrese nuevamente");
            x = Integer.parseInt(System.console().readLine());
        }
        while((x + n[j][0]) > 100){
            System.out.println("El stock supera el maximo ingrese menos stock");
            x = Integer.parseInt(System.console().readLine());
        }
        return x;
    }

    /**
     * Calcula el costo del producto ingresado por el usuario
     * @param n Array que contiene el stock
     * @param j Array con los nombres de los productos
     * @param x Opcion ingresada por el usuario (controla el indice del array de stock)
     */
    public static void stockProducto(int n[][], String j[], int x){
        System.out.println("Producto ingresado: " + j[x-1]);
        System.out.printf("Stock: %3d \ncosto total de stock: %5d", n[x-1][0], (n[x-1][1]*n[x-1][0]));
        System.out.println();
    }

    /**
     * Muestra el costo total del stock
     * @param n array que contiene el stockNombres
     */
    public static void stockTotal(int n[][]){
        int total = 0;
        for(int i = 0; i < 10; i++){
            total += n[i][0] * n[i][1];
        }
        System.out.println("El costo total del stock es: $" + total);
        System.out.println();
    }

    /**
     * Nuestra stock
     * @param n Array donde se encuentra guardado el stock
     * @param r Array del tipo string donde se guardan los nombres de los productos
     */
    public static void muestraStock(int n[][], String r[]){
        System.out.printf("%10s|%5s|%6s\n","Producto"," Cantidad","Costo");
        for (int i = 0; i < 10; i++){
            System.out.printf("%10s:",r[i]);
            for (int j = 0; j < 2; j++){
                System.out.printf(" %6d ", n[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Controla que el usuario ingrese la opcion correcta
     * devuelve un numero limitado por el programa
     * @param x opcion igresada por el usuario
     * @param j constante de control: 1=menu principal 2=menu de stock 3=desicion salida
     * @return devuelve la opcion limitada por el programa
     */
    public static int controlMenu(int x, int j){
        switch (j){
        case 1:
            while (x < 1 || x > 6){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        case 2:
            while (x < 1 || x > 10){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        case 3:
            while (x < 1 || x > 2){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        }   
        return x;
    }
}
