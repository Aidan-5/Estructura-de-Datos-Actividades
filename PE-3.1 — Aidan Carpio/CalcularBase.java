public class CalcularBase {

    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;
    
    // ← Agregamos static aquí
    public static double calculo(int dependientes, boolean esRural) {
        double monto = MONTO_BASE;
        for (int i = 0; i < dependientes; i++) {
            monto += MONTO_DEPENDIENTE;
        }
        return esRural ? monto * FACTOR_RURAL : monto;
    }

    public static void main(String[] args) {
        System.out.println("Caso 1: Zona urbana $" + calculo(0, false));
        System.out.println("Caso 2: Aldrin: Zona urbana $" + calculo(0, false));
    }
}