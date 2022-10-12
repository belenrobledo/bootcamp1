class Main {   
        public static void main(String [] args){
    Cliente cliente = new Cliente();
    cliente.setNombre("belen");
    cliente.setEdad(12);
    cliente.setCredito(4);
    cliente.setTelefono(567890);
    System.out.println(cliente.getNombre()+ cliente.getEdad() + cliente.getCredito()+ cliente.getTelefono());

}
}
class Persona {
    int edad;
    String nombre;
    long telefono;
}

class Cliente extends Persona {
    int credito;

    public String getNombre(){
        return this.nombre;
     }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     public int getEdad(){
         return this.edad;
     }
     public void setEdad(int edad){
         this.edad = edad;
     }
     public long getTelefono(){
         return this.telefono;
     }
     public void setTelefono(long telefono){
         this.telefono= telefono;
     }
     public int getCredito(){
         return this.credito;
     }
     public void setCredito (int credito){
         this.credito= credito;
     }

}


class Trabajador extends Persona {
    int salario;
}