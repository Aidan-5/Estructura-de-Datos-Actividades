public class Triaje {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Triaje (Validación del MinHeap) ===");

        MinHeap<Paciente> salaEmergencia = new MinHeap<>();

        System.out.println("\n-> Ingresando pacientes...");

        Paciente p1 = new Paciente("Juan Perez", 3); // Leve
        Paciente p2 = new Paciente("Maria Gomez", 1); // Crítico
        Paciente p3 = new Paciente("Carlos Ruiz", 2); // Urgente
        Paciente p4 = new Paciente("Ana Lopez", 1); // Crítico
        Paciente p5 = new Paciente("Pedro Diaz", 3); // Leve

        salaEmergencia.insertar(p1);
        System.out.println("Ingresado: " + p1);

        salaEmergencia.insertar(p2);
        System.out.println("Ingresado: " + p2);

        salaEmergencia.insertar(p3);
        System.out.println("Ingresado: " + p3);

        salaEmergencia.insertar(p4);
        System.out.println("Ingresado: " + p4);

        salaEmergencia.insertar(p5);
        System.out.println("Ingresado: " + p5);

        // 3. Atender pacientes (Validación del orden de prioridad)
        System.out.println("\n-> Atendiendo pacientes (Extrayendo del MinHeap)...");
        System.out.println("Esperado: Criticos (1) -> Urgentes (2) -> Leves (3)");
        System.out.println("-----------------------------------------------------");

        while (!salaEmergencia.esVacio()) {
            Paciente atendido = salaEmergencia.extraerMinimo();
            System.out.println("Atendiendo a: " + atendido);
        }

        System.out.println("\n Validación completada.");
    }
}
