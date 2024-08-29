
package genericidad;
import java.util.*;


public class Genericidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese la edad del usuario: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        
        Pair<Integer, String> personaData = new Pair<>(edad, nombre);
        System.out.println("Datos de la persona: " + personaData);
        
        System.out.println("Ingrese la eps del usuario: ");
        String eps = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento en formato DD/MM/AAAA: ");
        String fecha = scanner.nextLine();
        
        
        Pair<String, String> medicaData = new Pair <>("Famisanar", "29/03/2005");
        System.out.println("Datos médicos: " + medicaData);
        
        scanner.close();
        System.out.println("La eps de la persona es: " + medicaData.getFirst());
        System.out.println("El nombre de la persona es: " + personaData.getSecond());
    }
    
}
