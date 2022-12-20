public class Main {
    public static <string> void main(String[] args) {


        // CONDICIÓN "IF":
        System.out.println("----CONDICIÓN \"IF\":");

        int numeroIF = 2;

        if(numeroIF > 0)
            System.out.println("El númeroIF es positivo");
        else if (numeroIF == 0)
            System.out.println("El númeroIF es 0");
        else if (numeroIF < 0)
            System.out.println("El númeroIF es negativo");

        // BUCLE "WHILE":
        System.out.println("----BUCLE \"WHILE\":");

        int numeroWHILE = 1;

        while(numeroWHILE < 3){
            numeroWHILE++;
            System.out.println(numeroWHILE);
        }

        // BUCLE "DO WHILE":
        System.out.println("----BUCLE \"DO WHILE\":");

        int numeroDOWHILE = 3;

        do {
            numeroDOWHILE++;
            System.out.println(numeroDOWHILE);
        } while (numeroDOWHILE < 3);

        // BUCLE "FOR":
        System.out.println("----BUCLE \"FOR\":");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println(numeroFor);

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