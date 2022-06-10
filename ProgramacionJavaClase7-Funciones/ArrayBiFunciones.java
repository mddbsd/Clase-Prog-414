import matematicas.Varias;
public class ArrayBiFunciones {
    public static void main(String[] args){
        int[][] n = new int[7][8];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 8; j++){
                n[i][j] = (int)(Math.random()*1000000);
            }
        }
        muestraArrayIntBi(n);
    }

    // Funciones ///////////////////////////////////////////
    /**
     * Devuelve el numero de filas de un array bidimencional de numeros enteros
     * 
     * @param x array bidimensional de numeros enteros
     * @return numero de filas del array
     */
    public static int filasArrayIntBi(int x[][]){
        return x.length;
    }

    /**
     * Devuelve el numero de columnas de un array bidimensional de numeros enteros
     * 
     * @param x array bidimensional de numeros enteros
     * @return numero de columnas del array
     */
    public static int columnasArrayIntBi(int x[][]){
        return x[0].length;
    }

    /**
     * Devuelve el maximo de un array b idimensional de numeros enteros
     * 
     * @param x array bidimensional de numeros enteros
     * @return el valor maximo encontrado en el array
     */
    public static int maximoArrayIntBi(int x[][]){
        int maximo = Integer.MIN_VALUE;

        for (int f = 0; f < filasArrayIntBi(x); f++){
            for (int c = 0; c < columnasArrayIntBi(x); c++){
                if (x[f][c] > maximo){
                    maximo = x[f][c];
                }
            }
        }
    return maximo;
    } 

    /**
     * Muestra por pantalla el contenudo de un array bidimensional de numeros enteros
     * 
     * @param x array bidimensional de numeros enteros
     */
    public static void muestraArrayIntBi(int x[][]){
        String formatoNumero = "%" + matematicas.Varias.digitos(maximoArrayIntBi(x)) + "d";
        
        for (int f = 0; f < filasArrayIntBi(x); f++){
            for (int c = 0; c < columnasArrayIntBi(x); c++){
                System.out.printf(formatoNumero + " ", x[f][c]);
            }
            System.out.println();
        }
    }

}
