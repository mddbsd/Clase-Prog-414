package PaqueteFunciones;

public class Funciones {
    /**
     * Controla que el usuario ingrese la opcion correcta
     * devuelve un numero limitado por el programa
     * @param x opcion igresada por el usuario
     * @param j constante de control
     * @return devuelve la opcion limitada por el programa
     */
    public static int controlMenu(int x, int j){
        switch (j){
        case 1:
            while (x < 1 || x > 5){
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
            while (x < 1 || x > 7){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                x = Integer.parseInt(System.console().readLine());
            }
            break;
        }   
        return x;
    }

    public static void cargaStock(int n[], int i){
        i -= 1;
        System.out.println("Ingrese cantidad a cargar");
        int cantidad = Integer.parseInt(System.console().readLine());
        while(cantidad < 0 || cantidad > 20){
            System.out.println("Cantidad incorrecta, ingrese nuevamente");
            cantidad = Integer.parseInt(System.console().readLine());
        }
        if ((n[i] + cantidad) > 20){
            System.out.println("Se supera el limite de stock");
        } else {
            n[i] += cantidad;
        }

    }

    /**
     * Resta los componentes basicos del ensamblaje
     * 
     * @param s Array que contiene el stock
     */
    public static void ensamblaBasicos(int s[]){
        s[0] -= 1;
        s[3] -= 1;
        s[4] -= 1;
        s[5] -= 1;
    }

    /**
     * Comprueba el stock de PCs y la disponibilidad de sus componentes,
     * en caso de faltar alguno, muestra cual es y devuelve falso
     * 
     * @param s Array que contiene el stock
     * @param t Opcion ingresada por el usuario
     * @return Devuelve falso en caso de faltar alguno o si el stock esta lleno, y true si se puede completar la operacion
     */
    public static boolean compruebaEnsamblaje(int s[], int t){
        switch(t){
            case 1:
                if (compruebaBasicos(s)){
                    if ((s[1] - 1) < 0){
                        System.out.println("Faltan Memorias RAM");
                    }
                    if ((s[2] - 1) < 0){
                        System.out.println("Faltan Discos Rigidos");
                    }
                    return false;
                }
                break;
            case 2:
                if (compruebaBasicos(s)){
                    if ((s[1] - 4) < 0){
                        System.out.println("Faltan Memorias RAM");
                    }
                    if ((s[2] - 2) < 0){
                        System.out.println("Faltan Discos Rigidos");
                    }
                    return false;
                }
                break;
            case 3:
                if (compruebaBasicos(s)){
                    if ((s[1] - 8) < 0){
                        System.out.println("Faltan Memorias RAM");
                    }
                    if ((s[2] - 2) < 0){
                        System.out.println("Faltan Discos Rigidos");
                    }
                    return false;
                }
                break;
            }
        return true;
    } 
    /**
     * Comprueba cada uno de los componentes basicos,
     * en caso de faltar alguno, muestra cual es y devuelve falso
     * @param s Array que contiene el stock
     * @return Devuelve falso en caso de faltar alguno, y true si se puede completar la operacion
     */
    public static boolean compruebaBasicos(int s[]){
        if(s[0] - 1 <= 0){
            System.out.println("Faltan Gabinetes");
            return false;
        }else if(s[3] - 1 <= 0){
            System.out.println("Faltan Motherboards");
            return false;
        }else if(s[4] - 1 <= 0){
            System.out.println("Faltan Microprocesadores");
            return false;
        }else if(s[5] - 1 <= 0){
            System.out.println("Faltan Fuentees de alimentacion");
            return false;
        }else{
            return true;
        }
    }

    /**
     * Ensambla pcs y suma su correspondiente stock
     * @param s Array que contiene el stock
     * @param t Pc ingresada ingresada por el usuario
     */
    public static void ensambla(int s[], int t){
        System.out.println("opcion " + t);
        if (s[(t - 1) + 6] == 20){
            System.out.println("Stock de Pc" + t + " lleno");
        }else{
            switch(t){
                case 1:
                    if (!compruebaEnsamblaje(s, t)){
                        ensamblaBasicos(s);
                        s[1] -= 1;
                        s[2] -= 1;
                        s[6] += 1;
                    }
                    break;
                case 2:
                    if (!compruebaEnsamblaje(s, t)){    
                        ensamblaBasicos(s);
                        s[1] -= 4;
                        s[2] -= 2;
                        s[7] += 1;
                    }
                    break;
                case 3:
                    if (!compruebaEnsamblaje(s, t)){
                        ensamblaBasicos(s);
                        s[1] -= 8;
                        s[2] -= 2;
                        s[8] += 1;
                    }
                    break;
            }
        }
    }
    
}
