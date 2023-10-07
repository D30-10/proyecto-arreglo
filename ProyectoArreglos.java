 import java.util.Scanner;

    public class ProyectoArreglos {
        public void operacion() {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[20];

            // Leer 20 números desde el teclado
            for (int i = 0; i < 20; i++) {
                System.out.println("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Mostrar cada número, su cuadrado y su cubo
            for (int i = 0; i < 20; i++) {
                int cuadrado = numeros[i] * numeros[i];
                int cubo = cuadrado * numeros[i];
                System.out.println("Número: " + numeros[i] + ", Cuadrado: " + cuadrado + ", Cubo: " + cubo);
            }

            scanner.close();
        }
    }

