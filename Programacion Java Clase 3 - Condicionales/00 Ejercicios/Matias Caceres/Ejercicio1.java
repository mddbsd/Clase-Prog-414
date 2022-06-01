public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("Por favor, introduzca la hora.");
        String linea = System.console().readLine();
        int horario = Integer.parseInt(linea);

    if((horario >= 6) && (horario<=12)){
        System.out.println("Buenos dias.");

        }else if((horario > 12) && (horario <20)){
            System.out.println("Buenas tardes."); 
        
        }else if((horario >= 20) && (horario <= 24) || (horario > 0) && (horario <=5)){
            System.out.println("Buenas noches.");
        }else{
            System.out.println("El horario digitado no existe."); 
        }
    }
}