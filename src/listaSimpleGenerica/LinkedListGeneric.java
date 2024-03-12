package listaSimpleGenerica;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListGeneric<T> implements Iterable<T>{
	
	private NodeGeneric <T> headNode;
	private int size;
	
	
	public LinkedListGeneric() {
        headNode = null;
        size = 0;
    }
	
    public void addFirst(T dato) {
        NodeGeneric<T> nuevoNodo = new NodeGeneric<T>(dato);
        nuevoNodo.next = headNode;
        if (headNode == null) {
        	this.headNode = nuevoNodo;
        }
        else {
         nuevoNodo.setNext(headNode);
         this.headNode = nuevoNodo;
        }
        size++;
    }
	
	public void addLast(T dato) {
	    NodeGeneric<T> nuevoNodo = new NodeGeneric<>(dato);
	    if (headNode == null) {
	        headNode = nuevoNodo;
	    } else {
	    	NodeGeneric<T> nodoActual = headNode;
	        while (nodoActual.getNext() != null) {
	            nodoActual = nodoActual.getNext();
	        }
	        nodoActual.setNext(nuevoNodo);
	    }
	    size++;
	}
	
    public void addNodePosition(int posicion, T data) {
        NodeGeneric<T> nuevoNodo = new NodeGeneric<T>(data);
        if (posicion == 0) {
            addFirst(data);
        } else {
            NodeGeneric<T> nodoActual = headNode;
            for (int i = 0; i < posicion - 1 ; i++) {
                nodoActual = nodoActual.getNext();
            }
            nuevoNodo.setNext(nodoActual.getNext());
            nodoActual.setNext(nuevoNodo);
        }
        size++;
    }

	
	public void deleteFirst()
    {
        if(headNode != null)
        {
        	headNode = headNode.next;
        }
    }
	
	public void deleteLast()
    {
        if (headNode != null)
        {
            NodeGeneric<T> aux = headNode;
            while(aux.next.next != null)
            {
                aux = aux.next;
            }
            aux.next=null;
        }
    }
	
	public void printList() {
		NodeGeneric<T> aux = headNode;
		while(aux!=null) {
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
	}
	
	/*
	 * 5. Escribir un método que retorne la cantidad de veces que se repite un valor en una lista
		enlazada.
	 */
	
	public int countRepetedData(T dataSearch) {
		NodeGeneric <T> nodeAux = headNode;
		int cont = 0;
		while (nodeAux!=null) {
			if(nodeAux.getData().equals(dataSearch)) {
				cont++;
			}
			nodeAux = nodeAux.next;
		}
		return cont;
	}
	
	/*
	 * 10. Escribir un método que permita “concatenar” dos listas enlazadas simples, 
	 * el método debe recibir como parámetro dos objetos de tipo Lista, unirlas y 
	 * retornar una lista que contenga a ambas.
	 */
	
    public LinkedListGeneric<T> concatenarListas(LinkedListGeneric<T> lista1, LinkedListGeneric<T> lista2) {
    	LinkedListGeneric<T> listaConcatenada = new LinkedListGeneric<>();

        if (lista1.headNode == null && lista2.headNode == null) {
            return listaConcatenada;
        }

        NodeGeneric<T> actual = lista1.headNode;
        while (actual != null) {
            listaConcatenada.addLast(actual.data);
            actual = actual.next;
        }

        actual = lista2.headNode;
        while (actual != null) {
            listaConcatenada.addLast(actual.data);
            actual = actual.next;
        }

        return listaConcatenada;
    }
	
	public boolean isEmpty() {
		return !headNode.equals(null);
	}

	public NodeGeneric<T> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(NodeGeneric<T> headNode) {
		this.headNode = headNode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorLinkedListGeneric(headNode);
	}
	
	public class IteratorLinkedListGeneric implements Iterator<T>{
		
		private NodeGeneric<T> node;
			
		public IteratorLinkedListGeneric(NodeGeneric<T> node) {
			super();
			this.node = node;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
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
