import paqueteFunciones.Funciones;
import paqueteFunciones.Menues;

public class Deposito{
    public static void main(String[] args){
        final int CONTROLMENUPRINCIPAL = 1;
        final int CONTROLMENUPRODUCTOS = 2;

        String stockNombres[] = {"Gabinetes","RAM","Fuentes","Micros","HDD","Mothers","Mouses","Teclados","Parlantes","Microfonos"}; 
        int stock[][] = {{100,5000}, //0: Gabinetes
                         {100,2500}, //1: RAM
                         {100,7000}, //2: Fuentes
                         {100,15000},//3: Micros
                         {100,6000}, //4: HDD
                         {100,1000}, //5: Mothers
                         {100,3000}, //6: Mouses
                         {100,3500}, //7: Teclados
                         {100,1000}, //8: Parlantes
                         {100,1250}}; //9: Microfonos
        boolean salida = false;

        do{
            paqueteFunciones.Menues.menuPrincipal();
            int opcionMenu = Integer.parseInt(System.console().readLine());      
            switch (paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRINCIPAL)){
                case 1:
                    paqueteFunciones.Funciones.cargaStock(stock, CONTROLMENUPRODUCTOS);
                    break;

                case 2:
                    paqueteFunciones.Funciones.muestraStock(stock,stockNombres);
                    break;

                case 3:
                    paqueteFunciones.Menues.menuProductos();
                    int opcionMenuStock = paqueteFunciones.Funciones.controlMenu(Integer.parseInt(System.console().readLine()),CONTROLMENUPRODUCTOS);
                    paqueteFunciones.Funciones.stockProducto(stock, stockNombres ,opcionMenuStock);
                    break;
                case 4:
                    paqueteFunciones.Funciones.stockTotal(stock);
                    break;

                case 5:
                    paqueteFunciones.Funciones.retiraStock(stock, CONTROLMENUPRODUCTOS);
                    break;

                case 6:
                    salida = true;
                    break;

                default:
            }
        }while (!salida);
        

    }
}