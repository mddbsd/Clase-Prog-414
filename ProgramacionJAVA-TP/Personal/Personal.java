public class Personal{
    public static void main(String[] args){
        int personal[][] = new int[50][3];
        boolean salida = false;
        final int CONTROLMENUPRINCIPAL = 1;
        //carga array
        paqueteFunciones.Funciones.cargaPersonal(personal);
        do{
            paqueteFunciones.Menues.menuPrincipal();
            int opcionMenu = Integer.parseInt(System.console().readLine());
            switch(paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRINCIPAL)){
                case 1:
                    paqueteFunciones.Funciones.muestraPersonal(personal);
                    break;
                case 2:
                    paqueteFunciones.Funciones.totalCategoria(personal);
                    break;
                case 3:
                    paqueteFunciones.Funciones.sueldoEmpleado(personal);
                    break;
                case 4:
                    paqueteFunciones.Funciones.retiraEmpleado(personal);
                    break;
                case 5:
                    paqueteFunciones.Funciones.contrataEmpleado(personal);
                    break;
                case 6:
                    salida = true;
                    break;
            }
            
        }while(!salida);
        
    }
}