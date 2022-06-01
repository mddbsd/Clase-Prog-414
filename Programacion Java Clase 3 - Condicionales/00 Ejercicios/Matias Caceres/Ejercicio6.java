public class Ejercicio6{
    public static void main(String[] args){
        System.out.print("Ingrese número del mes: ");
        int mes = Integer.parseInt(System.console().readLine());

        System.out.print("Ingrese número del día: ");

        int dia = Integer.parseInt(System.console().readLine());
        String nombreDe1Mes;

        switch(mes){
            case 1: nombreDe1Mes="Enero";
                    if((dia > 1) && (dia < 20)){ 
                    System.out.print("El signo del zodiaco seleccionado es: Capricornio");
                    }else if((dia >= 21) && (dia <= 30)){
                        System.out.println("El signo del zodiaco seleccionado es: Acuario");
                    }else{
                        System.out.println("Dia inexistente.");
                    }
                    break;

            case 2: nombreDe1Mes="Febrero";
                   if((dia > 1) && (dia < 20)){ 
                   System.out.print("El signo del zodiaco seleccionado es: Acuario");
                   }else if((dia >= 21) && (dia <= 28)){
                    System.out.println("El signo del zodiaco seleccionado es: Piscis");
                   }else{
                    System.out.println("Dia inexistente.");
                   }
                    break;

            case 3: nombreDe1Mes="Marzo";
                 if((dia > 1) && (dia < 20)){ 
                 System.out.print("El signo del zodiaco seleccionado es: Piscis");
                 }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Aries");
                 }else{
                 System.out.println("Dia inexistente.");
                 }
                    break;
                    
            case 4: nombreDe1Mes="Abril";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Aries");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Tauro");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;
                   
            case 5: nombreDe1Mes="Mayo";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Tauro");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Geminis");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 6: nombreDe1Mes="Junio";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Geminis");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Cancer");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 7: nombreDe1Mes="Julio";
                 if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Cancer");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Leo");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 8: nombreDe1Mes="Agosto";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Leo");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Virgo");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 9: nombreDe1Mes="Septiembre";
               if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Virgo");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Libra");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 10: nombreDe1Mes="Octubre";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Libra");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Escorpio");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 11: nombreDe1Mes="Noviembre";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Escorpio");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Sagitario");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;

            case 12: nombreDe1Mes="Diciembre";
                if((dia > 1) && (dia < 20)){ 
                System.out.print("El signo del zodiaco seleccionado es: Sagitario");
                }else if((dia >= 21) && (dia <= 28)){
                 System.out.println("El signo del zodiaco seleccionado es: Capricornio");
                }else{
                 System.out.println("Dia inexistente.");
                }
            break;
            

            default:
                    nombreDe1Mes="Mes no existe";
        
        }
        
    }
    
} 


 