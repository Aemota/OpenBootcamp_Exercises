public class Main {
    public static void main(String[] args) {

        Persona Maria = new Persona();
        Maria.setNombre("María");
        Maria.setEdad(30);
        Maria.setTelefono(123456789);
        System.out.print("Mi nombre es: " + Maria.getNombre() + ". \n" + "Tengo " + Maria.getEdad() + " años. \n" + "Y mi teléfono es el: " + Maria.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    // SETTERS
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }


    // GETTERS

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
