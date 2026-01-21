public class RecursivoAidan {
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;

    private static double calcularRecursivo(int dependientes, boolean esRural) {

        // CASO BASE: familia sin dependientes → solo monto base
        if (dependientes == 0) {
            return esRural ? MONTO_BASE * FACTOR_RURAL : MONTO_BASE;
        }

        // CASO RECURSIVO:
        // Se resta un dependiente y se vuelve a llamar a la función
        double montoAnterior = calcularRecursivo(dependientes - 1, esRural);

        double adicional = esRural
                ? MONTO_DEPENDIENTE * FACTOR_RURAL
                : MONTO_DEPENDIENTE;

        return montoAnterior + adicional;
    }

    public static void main(String[] args) {

        // Caso-1: Sin dependientes, zona urbana
        System.out.println("Caso 1: " + calcularRecursivo(0, false));

        // Caso-2: 2 dependientes, zona urbana
        System.out.println("Caso 2: " + calcularRecursivo(2, false));

        // Caso-3: 3 dependientes, zona rural
        System.out.println("Caso 3: " + calcularRecursivo(3, true));
    }

}
