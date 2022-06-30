public class Personal{
    public static void main(String[] args){
        int personal[][] = new int[50][3];
        int categorias[] = {550, 380, 400, 300};
        int empleado = 0;
        int indiceEmpleado = 0;
        boolean salida = false;
        final int CONTROLMENUPRINCIPAL = 1;
        final int CONTROLCATEGORIA = 2;
    
        paqueteFunciones.Funciones.cargaPersonal(personal);
        do{
            paqueteFunciones.Menues.menuPrincipal();
            int opcionMenu = Integer.parseInt(System.console().readLine());
            switch(paqueteFunciones.Funciones.controlMenu(opcionMenu, CONTROLMENUPRINCIPAL)){
                case 1:
                    paqueteFunciones.Funciones.muestraPersonal(personal);
                    break;
                case 2:
                    paqueteFunciones.Menues.seleccionCategoria();
                    int categoria = Integer.parseInt(System.console().readLine());
                    categoria = paqueteFunciones.Funciones.controlMenu(categoria, CONTROLCATEGORIA);
                    System.out.println("Categoria: " + categoria);
                    paqueteFunciones.Funciones.totalCategoria(personal, categorias[categoria - 1]);
                    break;
                case 3:
                    System.out.println("Ingrese codigo de empleado");
                    empleado = Integer.parseInt(System.console().readLine());
                    indiceEmpleado = paqueteFunciones.Funciones.existeEmpleado(personal, empleado);
                    paqueteFunciones.Funciones.sueldoEmpleado(personal, categorias, indiceEmpleado);
                    break;
                case 4:
                    System.out.println("Ingrese codigo de empleado");
                    empleado = Integer.parseInt(System.console().readLine());
                    indiceEmpleado = paqueteFunciones.Funciones.existeEmpleado(personal, empleado);
                    for (int i = 0; i < 3; i++){
                        personal[indiceEmpleado][i] = 0;    
                    }
                    System.out.println("Empleado retirado satisfactoriamente\n");
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