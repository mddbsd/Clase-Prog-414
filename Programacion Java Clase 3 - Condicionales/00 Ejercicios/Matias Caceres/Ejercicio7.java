public class Ejercicio7{
    public static void main(String[] args){
    System.out.println("Digite 3 números");

        int numero1 = Integer.parseInt(System.console().readLine());
        int numero2 = Integer.parseInt(System.console().readLine());
        int numero3 = Integer.parseInt(System.console().readLine());

    if((numero1 > numero2 ) && (numero1 > numero3) && (numero2 > numero3)){ //1,2,3
        System.out.println(numero1 + "," + numero2 + "," +numero3);

    }else if((numero1 > numero2 ) && (numero1 > numero3) && (numero3 > numero2)){ //1,3,2
        System.out.println(numero1 + "," + numero3 + "," +numero2);
     
    }else if((numero2 > numero1 ) && (numero2 > numero3) && (numero1 > numero3)){ //2,1,3
        System.out.println(numero2 + "," + numero1 + "," +numero3);
     
    }else if((numero2 > numero1 ) && (numero2 > numero3) && (numero3 > numero1)){ //2,3,1
        System.out.println(numero2 + "," + numero3 + "," +numero1);
        
    }else if((numero3 > numero1 ) && (numero3 > numero2) && (numero1 > numero2)){ //3,1,2
        System.out.println(numero3 + "," + numero1 + "," +numero2);

    }else if((numero3 > numero1 ) && (numero3 > numero2) && (numero2 > numero1)){ //3,2,1
        System.out.println(numero3 + "," + numero2 + "," +numero1); 
}

}

}