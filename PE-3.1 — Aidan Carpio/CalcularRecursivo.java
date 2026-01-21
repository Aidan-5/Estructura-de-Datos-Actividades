public class CalcularRecursivo {
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;

    private static double calcularRecursivo(int dependientes, boolean esRural){
        // Caso exitoso donde no hay dependientes ni es rural
        if(dependientes == 0){
            //Caso exitoso donde no hay dependientes ni es rural
            return esRural ? MONTO_BASE * FACTOR_RURAL : MONTO_BASE;
        }

        //Recursividad
        double montoAnterior = calcularRecursivo(dependientes, esRural);
        double adicional = esRural ? MONTO_DEPENDIENTE * FACTOR_RURAL : MONTO_DEPENDIENTE;
        return montoAnterior + adicional;
    }
    public static void main(String[] args){

    } 
}