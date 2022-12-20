public class Main {
    public static <string> void main(String[] args) {


        // CONDICIÓN "IF":
        System.out.println("----CONDICIÓN \"IF\":");

        int numero = 2;

        if(numero > 0)
            System.out.println("El número es positivo");
        else if (numero == 0)
            System.out.println("El número es 0");
        else if (numero < 0)
            System.out.println("El número es negativo");

        // BUCLE "WHILE":
        System.out.println("----BUCLE \"WHILE\":");

        while(numero < 3){
            System.out.println(numero);
            numero++;
        }

        // BUCLE "DO WHILE" (se toma por valor el resultado del bucle "while" anterior):
        System.out.println("----BUCLE \"DO WHILE\":");

        do {
            numero++;
            System.out.println(numero);
        } while (numero < 3);

        // BUCLE "FOR":
        System.out.println("----BUCLE \"FOR\":");
        for(int num = 0; num <= 3; num++)
            System.out.println(num);

        // "SWITCH":
        System.out.println("----\"SWITCH\":");

        String estacion = "invierno";

        switch (estacion.toUpperCase()){
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No se ha introducido ninguna estación");
        }








    }
}