package paqueteFunciones;

public class Funciones{
    /**
     * Carga el array
     * @param n Array para guardar el personal
     */
    public static void cargaPersonal(int n[][]){
        for (int i = 0; i < 50; i++){
            for(int j = 0; j < 3; j++){
                switch (j){
                  case 0:
                        n[i][j] = ((int)(Math.random() * 9000) + 1000);
                        break;
                    case 1:
                        n[i][j] = ((int)(Math.random() * 4) + 1);
                        break;
                    case 2:
                        n[i][j] = ((int)(Math.random() * 10));
                        break;  
                }
            }
        }
    }
    
    /**
     * Muestra el listado del peronal
     * @param n Array que contiene el pesonal
     */
    public static void muestraPersonal(int n[][]){
        System.out.printf("%4s | %4s | %4s\n","Codigo", "Categoria","Antiguedad");
        for (int i = 0; i < 50; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%7d",n[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * Controla que el usuario ingrese la opcion correcta
     * devuelve un numero limitado por el programa
     * @param x opcion igresada por el usuario
     * @param j constante de control: 1=menu principal
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
            while (x < 1 || x > 4){
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

    /**
     * Calcula el total a pagar por hora de una categoria determinada
     * @param n Array que contiene los empleados
     * @param j Categoria seleccionada
     */
    public static void totalCategoria(int n[][], int j){
        int total = 0;
        for (int i = 0; i < 50; i++){
            total += j + (((n[i][2] * 10) * j) / 100);
        }
        System.out.println("\nTotal a pagar por hora: " + total);

    }

    /**
     * Calcula el sueldo de un empleado ingresado por el usuario
     * @param n Array que contiene los empleados
     * @param c Array que contiene las categorias
     * @param x indice del empleado
     */
    public static void sueldoEmpleado(int n[][], int c[], int x){
        System.out.println("ingrese cantidad de horas");
        int horas = Integer.parseInt(System.console().readLine());
        int total = (horas * c[n[x][1]]) + (n[x][2] * (horas * c[n[x][1]]) / 100);
        System.out.println("Empleado: " + x + "\nHoras trabajadas: " + horas + "\nTotal a pagar: " + total);
    }

    /**
     * Simula la integracion de un empleado
     * @param n
     */
    public static void contrataEmpleado (int n[][]){
        int contadorEmpleado = 0;
        
        //genera empleado
        int codigo = ((int)(Math.random() * 9000) + 1000);
        int categoria = ((int)(Math.random() * 4) + 1);

        while((contadorEmpleado < 50) && (n[contadorEmpleado][0] != 0)){
            contadorEmpleado++;
        }
        System.out.println(contadorEmpleado);
        if (contadorEmpleado > 50){
            System.out.println("El staff esta lleno\n");
        } else {
            n[contadorEmpleado][0]=codigo;
            n[contadorEmpleado][1]=categoria;
            System.out.println("Empleado cargado satisfacoriamente\n");
        }
    }
    
    /**
     * Verifica que el empleado exista en el array
     * @param n Array que contiene los empleados
     * @param x Codigo de empleado ingresado por el usuario
     * @return Devuelve el indice del empleado
     */
    public static int existeEmpleado(int n[][], int x){
        int contadorEmpleado = 0;
        boolean salida = false;
        do{
            while ((contadorEmpleado < 50) && (n[contadorEmpleado][0] != x)){
                contadorEmpleado ++;
            }
            if (contadorEmpleado == 50){
                System.out.println("Empleado no existe, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
                contadorEmpleado = 0;
            }else{
                salida = true;
            }
        }while (!salida);    
        System.out.println();
        return contadorEmpleado;
    }
}

