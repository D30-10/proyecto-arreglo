public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos
    public void comer(String comida, double cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " gramos de " + comida);
    }

    public String ladrar() {
        return "guau guau";
    }
}
