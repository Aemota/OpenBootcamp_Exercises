public class Main {
    public static void main(String[] args) {

        // DAR VALOR A LOS PARÁMETROS DE "SUMA" Y MOSTRAR RESULTADO
        System.out.println("PRIMERA PARTE DEL EJERCICIO: ");
        System.out.println("Resultado a): " + suma(3, 5, 6));
        System.out.println("Resultado b): " + suma(8, 4, 56) + "\n");

        // AÑADIR UNA PUERTA Y MOSTRARLO
        System.out.println("SEGUNDA PARTE DEL EJERCICIO: ");
        Coche miCoche = new Coche();
        miCoche.Numero_Puertas();
        System.out.println("Número de Puertas: "+ miCoche.puertas);

    }

    // PRIMERA PARTE: FUNCIÓN SUMA
    public static int suma(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

// SEGUNDA PARTE: CREACIÓN CLASE COCHE
class Coche {
    public int puertas = 0;
    public void Numero_Puertas() {
        this.puertas++;
    }
}