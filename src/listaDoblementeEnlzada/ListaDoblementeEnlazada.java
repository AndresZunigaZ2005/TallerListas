package listaDoblementeEnlzada;

import java.util.Iterator;
import java.util.NoSuchElementException;

import listaSimpleGenerica.NodeGeneric;

public class ListaDoblementeEnlazada <T> implements Iterable<T>{

    private Node <T> head; // Nodo que apunta al inicio de la lista
    private Node <T> tail;
    private int size;
    
    // Constructor
    public ListaDoblementeEnlazada() {
        head = null;
        tail = null;
        size = 0;
    }

    // Método para insertar un nuevo nodo al principio de la lista
    public void insertarAlInicio(T dato) {
        Node<T> nuevoNodo = new Node<>(dato);
        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            nuevoNodo.next = head;
            head.previous = nuevoNodo;
            head = nuevoNodo;
        }
        size++;
    }
    
    // Método para insertar un nuevo nodo al final de la lista
    public void insertarAlFinal(T dato) {
        Node<T> nuevoNodo = new Node<>(dato);
        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.previous = tail;
            tail = nuevoNodo;
        }
        size++;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Node <T> temporal = head;
        System.out.print("Lista enlazada: ");
        while (temporal != null) {
            System.out.print(temporal.data + " ");
            temporal = temporal.next;
        }
        System.out.println();
    }
    
    /*
     * 6. Escribir el método imprimirHaciaAtras() de una lista doblemente enlazada.
     */
    
    public void imprimirHaciaAtras() {
        Node <T> temporal = tail;
        System.out.print("Lista enlazada: ");
        while (temporal != null) {
            System.out.print(temporal.data + " ");
            temporal = temporal.previous;
        }
        System.out.println();
    }
    
    /*
     * 7. Escribir el Iterador para una lista doblemente enlazada.
     */

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListaDoblementeEnlazadaIterator(head);
	}

	public class ListaDoblementeEnlazadaIterator implements Iterator<T>{
		
		private Node<T> node;
			
		public ListaDoblementeEnlazadaIterator(Node<T> node) {
			this.node = node;
		}

		@Override
		public boolean hasNext() {
			return node != null;
		}

		@Override
		public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos en la lista");
            }
            T data = node.getData();
            node = node.getNext();
            return data;
        }
		
	}
}
