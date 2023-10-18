import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);


        try {
            // Crear primer perro
            Perro perro1 = new Perro();
            System.out.println("Ingrese el nombre del primer perro:");
            perro1.setNombre(scanner.nextLine());
            if (perro1.getNombre().matches("[0-9]+")) throw new NumberFormatException();
            System.out.println("Ingrese la raza del primer perro:");
            perro1.setRaza(scanner.nextLine());
            if (perro1.getRaza().matches("[0-9]+")) throw new NumberFormatException();
            System.out.println("Ingrese la edad del primer perro:");
            perro1.setEdad(Integer.parseInt(scanner.nextLine()));

            // Crear segundo perro
            Perro perro2 = new Perro();
            System.out.println("Ingrese el nombre del segundo perro:");
            perro2.setNombre(scanner.nextLine());
            if (perro2.getNombre().matches("[0-9]+")) throw new NumberFormatException();
            System.out.println("Ingrese la raza del segundo perro:");
            perro2.setRaza(scanner.nextLine());
            if (perro2.getRaza().matches("[0-9]+")) throw new NumberFormatException();
            System.out.println("Ingrese la edad del segundo perro:");
            perro2.setEdad(Integer.parseInt(scanner.nextLine()));

            // Invocar métodos
            perro1.comer("croquetas", 500);
            System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

            perro2.comer("carne", 600);
            System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
        } catch (NumberFormatException e) {
            System.out.println("Ha ocurrido un error al capturar los datos. Por favor, asegúrate de ingresar un número para la edad y una cadena para el nombre y la raza.");
        }
    }
}