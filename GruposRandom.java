public class GruposRandom {
    public static void main(String[] args){
        String alumnos[] = {"BUGGETHIN","CACERES","CARON","COPA","ECHEÑIQUE","FERNANDO","GEREZ",
                            "MONTOYA", "ORTEGA", "PEDREIRA", "PEÑARANDA", "SALVA", "SANGUINO",
                            "SEGUIL", "SOTELO", "TOLOSA"};
        String grupos[] = {"Produccion", "Personal", "Deposito", "Atencion al publico"};
        System.out.println("Asignador aleatorio de grupos");
        System.out.println("------------------------------");
        
        // Contador de grupo
        for (int g = 0; g < 4; g++){
            System.out.println("Grupo " + (g+1) + ": " + (grupos[g]));
            
            //Asgigna 4 alumnos por grupo
            for (int f = 0; f < 4; f++){
                boolean salida = false;
                int idAlumno = (int)(Math.random()*16);
                //Verifica que el string contenga un alumno, se repite la seleccion hasta que salga un string diferente de x
                do{
                    if(!"x".equals(alumnos[idAlumno])){
                        System.out.printf("%s ", alumnos[idAlumno]);
                        alumnos[idAlumno] = "x"; //Una vez mostrado el alumno, cambio el string para no repetirlo
                        salida = true;
                    }else{
                        idAlumno = (int)(Math.random()*16);
                    }
                }while (!salida);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < alumnos.length; i++){
            System.out.print(alumnos[i] + " ");
        }
    }
}
