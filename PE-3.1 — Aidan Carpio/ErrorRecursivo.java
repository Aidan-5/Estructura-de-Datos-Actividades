public class ErrorRecursivo {
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;

    // FUNCION CORRECTA

    private static double calcularSubsidioBDH(int dependientes, boolean esRural) {

        // familia sin dependientes
        if (dependientes == 0) {
            return esRural ? MONTO_BASE * FACTOR_RURAL : MONTO_BASE;
        }

        // se reduce un dependiente
        double montoAnterior = calcularSubsidioBDH(dependientes - 1, esRural);
        double adicional = esRural
                ? MONTO_DEPENDIENTE * FACTOR_RURAL
                : MONTO_DEPENDIENTE;

        return montoAnterior + adicional;
    }

    // FUNCION CON ERROR (provoca StackOverflowError)
    private static double calcularSubsidioBDH_Error(int dependientes, boolean esRural) {

        // Caso base incorrecto (nunca se cumple)
        if (dependientes < -1) {
            return MONTO_BASE;
        }

        // Error no se reduce el número de dependientes
        return calcularSubsidioBDH_Error(dependientes, esRural) + MONTO_DEPENDIENTE;
    }

    public static void main(String[] args) {

        // ----- EJECUCION CORRECTA 
        System.out.println("Ejecucion correcta:");
        System.out.println("0 dependientes, urbano: " + calcularSubsidioBDH(0, false));
        System.out.println("2 dependientes, urbano: " + calcularSubsidioBDH(2, false));
        System.out.println("3 dependientes, rural:  " + calcularSubsidioBDH(3, true));

        // ----- PROVOCACION DE ERROR 
        System.out.println("\nProvocando StackOverflowError...");
        calcularSubsidioBDH_Error(3, true);
    }
}
