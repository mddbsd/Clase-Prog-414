public class Produccion{
    public static void main (String[] args){
        int stock[] = {20, 20, 20, 0, 20, 20, 0, 0, 20};
        String nombres[] = {"gabinetes", "RAM", "HDD", "Motherboards", "Micropocesadores", "Fuentes", "PC1", "PC2", "PC3"};
        final int CONTROLMENUPRINCIPAL = 1;
        final int CONTROLMENUENSAMBLAJE = 2;
        final int CONTROLMENUCARGA = 3;
        boolean salida = false;
        do{
            PaqueteFunciones.Menues.menuPrincipal();
            int opcionMenu = Integer.parseInt(System.console().readLine());
            PaqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRINCIPAL);
            switch (opcionMenu){
                case 1:
                    for(int i = 0; i < 6; i++){
                        System.out.printf("%d: %s\n",i + 1 ,nombres[i]);
                    }
                    System.out.println("Ingrese producto a cargar");
                    opcionMenu = PaqueteFunciones.Funciones.controlMenu(Integer.parseInt(System.console().readLine()), CONTROLMENUCARGA);
                    PaqueteFunciones.Funciones.cargaStock(stock, opcionMenu);
                    break;
                case 2:
                    for(int i = 0; i < 6; i++){
                        System.out.printf("%16s %d\n",nombres[i] ,stock[i]);
                    }
                    break;
                case 3:
                    PaqueteFunciones.Menues.menuEnsamblaje();
                    opcionMenu = PaqueteFunciones.Funciones.controlMenu(Integer.parseInt(System.console().readLine()), CONTROLMENUENSAMBLAJE);
                    PaqueteFunciones.Funciones.ensambla(stock, opcionMenu);
                    break;
                case 4:
                    for(int i = 6; i < 9; i++){
                        System.out.printf("%3s %d\n",nombres[i] ,stock[i]);
                    }
                    break;
                case 5:
                    salida = true;
                    break;
            }

        }while (!salida);
    }
}