public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Lista vacia:" + list.isEmpty());

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtEnd(9);
        list.insertAtEnd(10);

        System.out.print("Lista creada:");
        list.display();

        System.out.println("Parte 2");
        System.out.println("Lista original");
        list.display();
        System.out.println("Lista reverse");
        list.reverse();
        list.display();

        DoublyLinkedList singleList = new DoublyLinkedList();
        System.out.println("Un solo elemento (Caso borde)");
        singleList.insertAtEnd(6); 
        singleList.display();
        System.out.println("Reserva");
        singleList.reverse();
        singleList.display();
        
        //parte 3
        System.out.println("Parte 3");
        System.out.println("Parte 3.1");
        System.out.println("lista original");
        list.display();
        System.out.println("Nodo eliminado");
        list.deleteByValue(4);
        list.display();

    }
}
