public class AtencionAlPublico{
    public static void main (String[] args){
        final int CONTROLMENUPRINCIPAL = 1;
        final int CONTROLMENUPRODUCTOSDEPOSITO = 2;
        final int CONTROLMENUPRODUCCION = 3;
        final int CONTROLMENUVENTAS = 4;
        final int VENTAMAYORISTA = 5;
        final int VENTAMINORISTA = 6;

        String stockNombres[] = {"Gabinetes","RAM","Fuentes","Micros","HDD","Mothers","Mouses","Teclados","Parlantes","Microfonos","PC1","PC2","PC3"}; 
        int stock[][] = {{10,5000}, //0: Gabinetes
                         {10,2500}, //1: RAM
                         {10,7000}, //2: Fuentes
                         {10,15000},//3: Micros
                         {10,6000}, //4: HDD
                         {10,1000}, //5: Mothers
                         {10,3000}, //6: Mouses
                         {10,3500}, //7: Teclados
                         {10,1000}, //8: Parlantes
                         {10,1250}, //9: Microfonos
                         {10,55500}, //10: Pc1
                         {10,59000}, //11: Pc2
                         {10,69000}};//12: Pc3
        boolean salida = false;
        do{
            paqueteFunciones.Menues.menuPrincipal();
            int opcionMenu = Integer.parseInt(System.console().readLine());
            opcionMenu = paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRINCIPAL);
            switch (opcionMenu){
                case 1:
                    paqueteFunciones.Menues.menuProductosDeposito();
                    opcionMenu = Integer.parseInt(System.console().readLine());
                    paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRODUCTOSDEPOSITO);
                    paqueteFunciones.Funciones.cargaStock(stock, opcionMenu - 1);
                    break;
                case 2:
                    paqueteFunciones.Menues.menuProductosProduccion();
                    opcionMenu = Integer.parseInt(System.console().readLine());
                    paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRODUCCION);
                    paqueteFunciones.Funciones.cargaStock(stock, (opcionMenu - 1) + 10);
                    break;
                case 3:
                    paqueteFunciones.Funciones.ventas(stock, stockNombres, VENTAMAYORISTA, CONTROLMENUVENTAS);
                    break;
                case 4:
                    paqueteFunciones.Funciones.ventas(stock, stockNombres, VENTAMINORISTA, CONTROLMENUVENTAS);
                    break;
                case 5:
                    paqueteFunciones.Funciones.muestraStock(stock, stockNombres);
                    break;
                case 6:
                    salida = true;
                    break;
            }

        }while (!salida);
        
    }
}