public class SalidaFormateada02 {
    public static void main(String[] args) {
    System.out.println(" Artículo Precio/caja Nº cajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s %8.2f %6d\n", "manzanas", 400.0, 10);
    System.out.printf("%-10s %8.2f %6d\n", "peras", 250.0, 120);
    System.out.printf("%-10s %8.2f %6d\n", "paltas", 1000.0, 6);
    } 
}
