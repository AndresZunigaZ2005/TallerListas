package listaCircular;

public class NodoCircular <T>{

    T data;
    NodoCircular<T> next;

    NodoCircular(T data) {
        this.data = data;
        this.next = null;
    }
}

