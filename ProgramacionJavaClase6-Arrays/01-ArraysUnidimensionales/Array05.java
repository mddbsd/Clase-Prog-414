public class Array05 {
    public static void main(String[] args){
        double[] nota = new double[4];
        System.out.println("Ingrese las notas de c/u de los examenes");

        for(int i = 0; i < 4; i++){
            System.out.print("Nota del examen N° " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");
        double suma = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(nota[i] + " ");
            suma += nota[i];
        }
        
        System.out.println("\nLa media es " + (suma/4));
    }
}
