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
            while (x < 1 || x > 3){
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
     */
    public static void totalCategoria(int n[][]){
        final int CONTROLCATEGORIA = 2;
        final int TECNICOSR = 550;
        final int TECNICOJR = 380;
        final int ADMINISTRATIVO = 400;
        final int STAFFGENERAL = 300;
        int totalCategoria1=0;
        int totalCategoria2=0;
        int totalCategoria3=0;
        int totalCategoria4=0;

        for (int i = 0; i < 50; i++){
            switch (n[i][1]){
                case 1:
                    totalCategoria1 += TECNICOSR + (((n[i][2] * 10) * TECNICOSR)/100);
                    break;
                case 2:
                    totalCategoria2 += TECNICOJR + (((n[i][2] * 10) * TECNICOJR)/100);
                    break;
                case 3:
                    totalCategoria3 += ADMINISTRATIVO + (((n[i][2] * 10) * ADMINISTRATIVO)/100);
                    break;
                case 4: 
                    totalCategoria4 += STAFFGENERAL + (((n[i][2] * 10) * STAFFGENERAL)/100);
                    break;
            }
        }
        System.out.println("Ingrese la categoria");
        int categoria = controlMenu(Integer.parseInt(System.console().readLine()),CONTROLCATEGORIA);
        switch (categoria){
            case 1:
                System.out.println("Tecnico Sr: " + totalCategoria1);
                break;
            case 2:
                System.out.println("Tecnico Jr: " + totalCategoria2);
                break;
            case 3:
                System.out.println("Administrativo: " + totalCategoria3);
                break;
            case 4:
                System.out.println("Staff general: " + totalCategoria4);
                break;
        }
    }

    /**
     * Calcula el sueldo de un empleado ingresado por el usuario
     * @param n Array que contiene los empleados
     */
    public static void sueldoEmpleado(int n[][]){
        int contadorEmpleado = 0;
        final int TECNICOSR = 550;
        final int TECNICOJR = 380;
        final int ADMINISTRATIVO = 400;
        final int STAFFGENERAL = 300;
       
        System.out.println("Ingrese codigo de empleado");
        int empleado = Integer.parseInt(System.console().readLine());
        while((contadorEmpleado < 50) && (n[contadorEmpleado][0] != empleado)){
            contadorEmpleado++;
        }
        contadorEmpleado++;
        System.out.println(contadorEmpleado);
        if (contadorEmpleado > 50){
            System.out.println("Empleado no existe");
        } else {
            contadorEmpleado --;
            System.out.println("Ingrese la cantidad de horas trabajadas");
            int horas = Integer.parseInt(System.console().readLine());
            System.out.println("Empleado N°: " + empleado + "| Categoria: " + n[contadorEmpleado][1] + "| Horas trabajadas: " + horas + "| Antiguedad: " + n[contadorEmpleado][2]);
            switch (n[contadorEmpleado][1]){
                case 1:
                    System.out.println(horas * TECNICOSR + (((n[contadorEmpleado][2]*10) * (horas * TECNICOSR)) / 100));
                    break;
                case 2:
                    System.out.println(horas * TECNICOJR + (((n[contadorEmpleado][2]*10) * (horas * TECNICOJR)) / 100));
                    break;
                case 3:
                    System.out.println(horas * ADMINISTRATIVO + (((n[contadorEmpleado][2]*10) * (horas * ADMINISTRATIVO)) / 100));
                    break;
                case 4:
                    System.out.println(horas * STAFFGENERAL + (((n[contadorEmpleado][2]*10) * (horas * STAFFGENERAL)) / 100));
                    break;
            }
        }
    }

    public static void retiraEmpleado(int n[][]){
        int contadorEmpleado = 0;
        System.out.println("Ingrese codigo de empleado");
        int empleado = Integer.parseInt(System.console().readLine());
        while((n[contadorEmpleado][0] != empleado) && (contadorEmpleado < 50)){
            contadorEmpleado++;
        }
        contadorEmpleado++;
        System.out.println(contadorEmpleado);
        if (contadorEmpleado > 50){
            System.out.println("Empleado no existe");
        } else {
            contadorEmpleado --;
            n[contadorEmpleado][0]=0;
            n[contadorEmpleado][1]=0;
            n[contadorEmpleado][2]=0;
        }

    }

    public static void contrataEmpleado (int n[][]){
        int contadorEmpleado = 0;
        //genera empleado
        int codigo = ((int)(Math.random() * 9000) + 1000);
        int categoria = ((int)(Math.random() * 4) + 1);
        while((contadorEmpleado < 50) && (n[contadorEmpleado][0] != 0)){
            contadorEmpleado++;
        }
        contadorEmpleado++;
        System.out.println(contadorEmpleado);
        if (contadorEmpleado > 50){
            System.out.println("El staff esta lleno");
        } else {
            contadorEmpleado --;
            n[contadorEmpleado][0]=codigo;
            n[contadorEmpleado][1]=categoria;
        }
    }
}

