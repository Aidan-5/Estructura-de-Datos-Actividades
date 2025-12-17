public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Caso 1: Lista vacía
        System.out.println("1. Lista vacía:");
        System.out.println("   Lista: " + list);
        System.out.println("   isEmpty(): " + list.isEmpty());
        System.out.println("   size(): " + list.size());
        System.out.println();

        // Caso 2: Insertar en lista vacía
        System.out.println("2. Insertar primer elemento (10):");
        list.addLast(10);
        System.out.println("   Lista: " + list);
        System.out.println("   head == tail: " + (list.getHead() == list.getTail()));
        System.out.println();

        // Caso 3: Agregar más elementos
        System.out.println("3. Agregar 20 y 30:");
        list.addLast(20);
        list.addLast(30);
        System.out.println("   Lista: " + list);
        System.out.println("   size(): " + list.size());
        System.out.println();

        // Caso 4: Búsqueda de elementos
        System.out.println("4. Búsquedas:");
        System.out.println("   search(20): " + list.search(20));
        System.out.println("   search(99): " + list.search(99));
        System.out.println();

        // Caso 5: Eliminar elemento intermedio
        System.out.println("5. Eliminar 20 (elemento intermedio):");
        System.out.println("   deleteByValue(20): " + list.deleteByValue(20));
        System.out.println("   Lista: " + list);
        System.out.println();

        // Caso 6: Eliminar head
        System.out.println("6. Eliminar head (10):");
        System.out.println("   deleteByValue(10): " + list.deleteByValue(10));
        System.out.println("   Lista: " + list);
        System.out.println();

        // Caso 7: Eliminar tail
        System.out.println("7. Agregar 40 y eliminar tail (40):");
        list.addLast(40);
        System.out.println("   Lista después de agregar 40: " + list);
        System.out.println("   deleteByValue(40): " + list.deleteByValue(40));
        System.out.println("   Lista: " + list);
        System.out.println();

        // Caso 8: Eliminar único elemento
        System.out.println("8. Eliminar el último elemento (30):");
        System.out.println("   deleteByValue(30): " + list.deleteByValue(30));
        System.out.println("   Lista: " + list);
        System.out.println("   isEmpty(): " + list.isEmpty());
        System.out.println();

        // Caso 9: Invertir lista vacía
        System.out.println("9. Invertir lista vacía:");
        list.reverse();
        System.out.println("   Lista: " + list);
        System.out.println();

        // Caso 10: Probar reverse con varios elementos
        System.out.println("10. Probar reverse con varios elementos:");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("    Lista original: " + list);
        list.reverse();
        System.out.println("    Lista invertida: " + list);
        System.out.println();

        // Caso 11: Reverse con un solo elemento
        System.out.println("11. Reverse con un solo elemento:");
        list = new DoublyLinkedList<>();
        list.addLast(999);
        System.out.println("    Lista original: " + list);
        list.reverse();
        System.out.println("    Lista después de reverse: " + list);
    }
}
