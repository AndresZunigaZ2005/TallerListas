package pruebaPregunta13;

public class Lista {
    NodoLista inicio;

    Lista(){
        inicio = null;
    }

    // Método para calcular la máxima distancia entre dos elementos con la clave x
    public int maximaDistancia(int x) {
        return maximaDistanciaRec(inicio, x, 0, 0);
    }

    private int maximaDistanciaRec(NodoLista nodo, int x, int distancia, int maximaDistancia) {
        if (nodo == null) {
            return maximaDistancia;
        }

        if (nodo.dato == x) {
            if (distancia != 0) {
                maximaDistancia = Math.max(maximaDistancia, distancia);
                distancia = 1;
            }
        } else {
            distancia++;
        }

        return maximaDistanciaRec(nodo.sig, x, distancia, maximaDistancia);
    }

}
