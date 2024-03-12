package listaCircular;

public class CircleLinkedList<T> {

    private NodoCircular<T> head;

    public CircleLinkedList() {
        this.head = null;
    }

    /*
     * 9. Escribir el método insertar y buscar de una lista circular.
     */
    public void insertFirst(T dato) {
    	NodoCircular<T> nuevoNodo = new NodoCircular<>(dato);
        if (head == null) {
            nuevoNodo.next = nuevoNodo;
            head = nuevoNodo;
        } else {
        	NodoCircular<T> ultimo = head;
            while (ultimo.next != head) {
                ultimo = ultimo.next;
            }
            nuevoNodo.next = head;
            head = nuevoNodo;
            ultimo.next = head;
        }
    }
    
    public void insertLast(T dato) {
    	NodoCircular<T> nuevoNodo = new NodoCircular<>(dato);
        if (head == null) {
            nuevoNodo.next = nuevoNodo;
            head = nuevoNodo;
        }else {
        	NodoCircular<T> ultimo = head;
            while (ultimo.next != head) {
                ultimo = ultimo.next;
            }
            nuevoNodo.next = head;
            ultimo.next = nuevoNodo;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía");
        } else {
        	NodoCircular<T> actual = head;
            do {
                System.out.print(actual.data + " ");
                actual = actual.next;
            } while (actual != head);
            System.out.println();
        }
    }
}
