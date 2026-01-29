public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        String tipo;

        switch (prioridad) {
            case 1:
                tipo = "Crítico";
                break;
            case 2:
                tipo = "Urgente";
                break;
            case 3:
                tipo = "Leve";
                break;
            default:
                tipo = "Desconocido";
                break;
        }

        return "Tipo: " + tipo + " Nombre: " + nombre;
    }

}