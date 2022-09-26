public class Persona {
    private int edad;
    private string nombre;
    private long telefono;
    
    public static void main(String[] args) {

        Persona persona1;
        persona1 = new Persona("belen", "robledo");

    }

    public int getEdad() {
        return edad;
        System.out.println("edad: " + persona1.edad);
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public string getNombre() {
        return nombre;
        System.out.println("nombre: " + persona1.nombre);
    }
    public void setNombre(string nombre) {
        this.nombre = nombre;
    }
    public long getTelefono() {
        return telefono;
        System.out.println("telefono: " + persona1.telefono);
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}