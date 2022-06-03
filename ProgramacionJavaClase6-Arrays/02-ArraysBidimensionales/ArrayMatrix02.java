public class ArrayMatrix02 {
    public static void main(String[] args)
        throws InterruptedException{
            int fila, columna;
            int[][] n = {{20, 4}, {67, 33}, {0, 7}};

            for(fila = 0; fila < 3; fila++){
                System.out.print("Fila: " + fila);
                for(columna = 0; columna < 2; columna++){
                    System.out.printf("%10d ", n[fila][columna]);
                    Thread.sleep(1000);
                }
                System.out.println();
            }
        }
}
