package pruebaPregunta13;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inicio = new NodoLista(3, new NodoLista(5, new NodoLista(7, new NodoLista(5, new NodoLista(8, null)))));
        int clave = 5;
        System.out.println(lista.maximaDistancia(clave));
    }
}
