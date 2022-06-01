public class Ejercicio2 {
    public static void main(String[] args){
        System.out.print("Ingrese número del día: ");
        int dia = Integer.parseInt(System.console().readLine());
        String nombreDe1dia;

        switch(dia){
            case 1: nombreDe1dia="Lunes";
            break;

            case 2: nombreDe1dia="Martes";
            break;

            case 3: nombreDe1dia="Miercoles";
            break;

            case 4: nombreDe1dia="Jueves";
            break;

            case 5: nombreDe1dia="Viernes";
             break;

            case 6: nombreDe1dia="Sabado";
            break;

            case 7: nombreDe1dia="Domingo";
            break;

                    

            default:
                    nombreDe1dia="El día escrito no existe.";
        
        }
        System.out.println("Día " + dia + ": " + nombreDe1dia);
    }
    
}  
