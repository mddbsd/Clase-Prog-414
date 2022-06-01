public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Digite el salario: ");
        int salario = Integer.parseInt(System.console().readLine());
        
        int salarioDiario = salario * 8;

        int salarioSemanal = salarioDiario * 5;

        int salarioExtra =  (salario+50) * 2;

        int salarioTotal = salarioExtra + salarioSemanal;

        System.out.println("El salario total diario es: " + salarioDiario);
        System.out.println("El salario  completo semanal es: " + salarioSemanal);
        System.out.println("El salario total semanal es: " + salarioTotal);


    
    
    
}
}