public class Main {

    public static void main(String[] args) {

        // ===== 1. Abstracción y Genéricos =====
        Package<String> p1 = new Package<>("PK1", "Vidrio", PackageType.FRAGILE, 2);
        Package<String> p2 = new Package<>("PK2", "Documentos", PackageType.EXPRESS, 0);
        Package<String> p3 = new Package<>("PK3", "Ropa", PackageType.STANDARD, 1);

        System.out.println("=== Paquetes creados ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // ===== 2. Rutas Flexibles (DLL) =====
        System.out.println("\n=== Rutas ===");
        RouteManager<String> routeManager = new RouteManager<>();
        routeManager.add("Centro");
        routeManager.add("Sucursal Norte");
        routeManager.add("Sucursal Sur");

        routeManager.moveNext();
        routeManager.movePrev();

        // ===== 3. Inventario Rápido (Hash Table) =====
        System.out.println("\n=== Inventario ===");
        HashTable<String, Package<?>> inventory = new HashTable<>(10);
        inventory.put(p1.getId(), p1);
        inventory.put(p2.getId(), p2);
        inventory.put(p3.getId(), p3);

        System.out.println("Buscar PK2 -> " + inventory.get("PK2"));

        // ===== 4. Optimización Prioritaria (Sorting) =====
        System.out.println("\n=== Ordenamiento por prioridad (Insertion Sort) ===");
        Package<?>[] packages = { p1, p2, p3 };

        PrioritySorter.insertionSort(packages);

        for (Package<?> p : packages) {
            System.out.println(p);
        }

        System.out.println("\n=== Ordenamiento por prioridad (Selection Sort) ===");
        PrioritySorter.selectionSort(packages);

        for (Package<?> p : packages) {
            System.out.println(p);
        }
    }
}
