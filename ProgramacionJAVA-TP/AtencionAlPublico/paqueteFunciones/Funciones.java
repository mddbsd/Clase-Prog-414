package paqueteFunciones;

public class Funciones {
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
            while (x < 1 || x > 3){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        case 4:
            while (x < 1 || x > 13){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        case 5:
            while (x < 1 || x > 2){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        }   
        return x;
    }
 
    /**
     * Carga productos proventientes del depostio
     * @param n Array con el stock
     * @param x Opcion ingresada por el usuario (previamente corregida)
     */
    public static void cargaStock(int n[][], int x){
        int cantidad = 0;
        System.out.println("Ingrese cantida a ingresar");
        while (cantidad < 1 || cantidad > 10){
            System.out.println("Cantidad incorrecta, ingrese nuevamente");
            cantidad = Integer.parseInt(System.console().readLine());
        }
        if (n[x][0] + cantidad > 10){
            System.out.println("Se supera el stock maximo");
        } else {
            n[x][0] += cantidad;
        }
        System.out.println();
    }

    /**
     * Operaciones de ventas mayoristas y minoristas
     * @param n Array que contiene el stock
     * @param j Arrat que contiene los nombres
     * @param x Control de venta Mayorista/Minorista
     * @param b Control para la funcion controlMenu
     */
    public static void ventas(int n[][], String j[], int x, int b){
        boolean salida = false;
        int arrayVentas[] = new int[13];
        double total = 0;
        double totalParcial = 0;
        do{
            paqueteFunciones.Funciones.muestraStock(n, j);
            System.out.println("Ingrese un producto");
            int opcionMenu = Integer.parseInt(System.console().readLine());
            paqueteFunciones.Funciones.controlMenu(opcionMenu, b);
            opcionMenu -= 1;
            System.out.println("ingrese cantidad");
            int cantidad = Integer.parseInt(System.console().readLine());
            while ((n[opcionMenu][0] - cantidad < 0)){
                System.out.println("No hay suficiente stock, ingrese nuevamente");
                cantidad = Integer.parseInt(System.console().readLine());
            }
            n[opcionMenu][0] -= cantidad;
            arrayVentas[opcionMenu] += cantidad;
            System.out.println("Desea cargar mas productos?\n1: Si\n2: No");
            int opcionSalida = Integer.parseInt(System.console().readLine());
            opcionSalida = controlMenu(opcionSalida, 5);
            if (opcionSalida == 2){
                salida = true;
            }
        }while (!salida);
        for (int i = 0; i < 13; i++){
            if (arrayVentas[i] == 0){
                
            }else{
                if (x == 5){
                    totalParcial = arrayVentas[i] * ((n[i][1] * 1.3));
                    System.out.printf("Producto: %10s Cantidad: %d Total Parcial: %7f\n", j[i], arrayVentas[i], totalParcial);
                } else {
                    totalParcial = arrayVentas[i] * ((n[i][1] * 1.3) * 1.21);
                    System.out.printf("Producto: %10s Cantidad: %d Total Parcial: %7f\n", j[i], arrayVentas[i], totalParcial);
                }
                total += totalParcial;
                arrayVentas[i] = 0;
            }
        }
        System.out.printf("%40s Total: %f\n", " ", total);
    }
    
    /**
     * Imprime el stock
     * @param n Array que contiene el stock
     * @param r Array que contiene los nombres
     */
    public static void muestraStock(int n[][], String r[]){
        System.out.printf("%10s|%5s|%6s\n","Producto"," Cantidad","Costo");
        for (int i = 0; i < 13; i++){
            System.out.printf("%2d %10s:",i + 1, r[i]);
            for (int j = 0; j < 2; j++){
                System.out.printf("%6d ", n[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
