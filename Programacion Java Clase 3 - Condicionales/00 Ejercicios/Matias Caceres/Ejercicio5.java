public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Digite las 3 notas para sacar el promedio.");
        
        int nota1 = Integer.parseInt(System.console().readLine()); 
        int nota2 = Integer.parseInt(System.console().readLine()); 
        int nota3 = Integer.parseInt(System.console().readLine()); 

        float promedio = ((nota1+nota2+nota3)/3);
        System.out.println("Promedio: " + promedio);

        if(promedio < 5 ){
            System.out.println("Nota de los promedios: Insuficiente");

        }else if(promedio == 5){
            System.out.println("Nota de los promedios: Suficiente");

        }else if(promedio == 6){
            System.out.println("Nota de los promedios: Bien");

        }else if(promedio == 7){
            System.out.println("Nota de los promedios: Notable");

        }else if(promedio == 8){
            System.out.println("Nota de los promedios: Sobresaliente");

        }else if(promedio == 9){
            System.out.println("Nota de los promedios: Sobresaliente");

        }else if(promedio == 10){
            System.out.println("Nota de los promedios: Sobresaliente");

        }else if((promedio < 0) || (promedio > 10)) {
            System.out.println("Nota de los promedios: Inexistente");
        } 

    }

}



