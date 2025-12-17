public class DoublyLinkedList<T> {

    private class Node {
        T value;
        Node next;
        Node prev;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Insertar al final
    public void addLast(T value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean deleteByValue(T value) {
        if (isEmpty())
            return false;

        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                // Caso único elemento
                if (current == head && current == tail) {
                    head = tail = null;
                }
                // Caso eliminar head
                else if (current == head) {
                    head = head.next;
                    head.prev = null;
                }
                // Caso eliminar tail
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // Caso eliminar nodo intermedio
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean search(T value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        if (isEmpty() || head == tail)
            return;

        Node current = head;
        Node temp;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    public String toString() {
        if (isEmpty())
            return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null)
                sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}