public class JuegoArrays {
    public static void main(String[] args) {
        // se definen constantes para representar el
        // contenido de las celdas
        final int VACIO = 0;
        final int TRAMPA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;
        int x;
        int y;
        int[][] cuadrante = new int[5][4];
        
        // inicializa el array
        for(x = 0; x < 4; x++) {
            for(y = 0; y < 3; y++) {
            cuadrante[x][y] = VACIO;
            }
        }
        // coloca la TRAMPA
        int trampaX = (int)(Math.random() * 5);
        int trampaY = (int)(Math.random() * 4);
        cuadrante[trampaX][trampaY] = TRAMPA;

        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((trampaX == tesoroX) && (trampaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;

        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
            // pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for(x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                    System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");

            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(System.console().readLine());

            // mira lo que hay en las coordenadas indicadas por el usuario
            switch(cuadrante[x][y]) {
                
                case VACIO:
                cuadrante[x][y] = INTENTO;
                break;
                
                case TRAMPA:
                System.out.println("F, era una trampa");
                salir = true;
                break;

                case TESORO:
                System.out.println("Felicidades! encontraste el tesoro!");
                salir = true;
                break;
                
                default:
            }
        } while (!salir);
        
        // pinta el cuadrante
        for(y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for(x = 0; x < 5; x++) {
                switch(cuadrante[x][y]) {
                
                    case VACIO:
                    c = " ";
                    break;
                    
                    case TRAMPA:
                    c = "* ";
                    break;
                    
                    case TESORO:
                    c = "€ ";
                    break;
                    
                    case INTENTO:
                    c = "X ";
                    break;

                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");
    }
}
