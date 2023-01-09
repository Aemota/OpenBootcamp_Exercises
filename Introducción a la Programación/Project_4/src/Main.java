public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Cliente 1";
        cliente1.edad = 23;
        cliente1.telefono = 952112233;
        cliente1.credito = "positivo";
        System.out.println("El " + cliente1.nombre + " tiene " + cliente1.edad + " años.");
        System.out.println("Su teléfono es el: " + cliente1.telefono + " y su crédito es: " + cliente1.credito);

        System.out.print("\n");

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Trabajador 1";
        trabajador1.edad = 35;
        trabajador1.telefono = 666778899;
        trabajador1.salario = 30000;
        System.out.println("El " + trabajador1.nombre + " tiene " + trabajador1.edad + " años");
        System.out.println("Su teléfono es el: " + trabajador1.telefono + " y su salario es de: " + trabajador1.salario + " euros anuales");
    }
}
class Persona {
    String nombre;
    int telefono;
    int edad;
}

class Cliente extends Persona {
    String credito;

}
class Trabajador extends Persona{
    int salario;
}