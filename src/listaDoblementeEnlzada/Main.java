package listaDoblementeEnlzada;

public class Main {
	
	public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Insertando elementos al principio de la lista
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);
        lista.insertarAlFinal(40);

        // Imprimiendo la lista
        lista.imprimirLista();
   
	}
	
	/*
	 * Una estructura de datos es una representación de un TAD y toca definir las acciones, en este caso,
	 * de una lista enlazada
	 * 
	 * un TAD puede describirse de dos maneras
	 * -Especificacion no-formal (usando un lenguaje natural)
	 * -Especificacion formal (Usando pseudocodigo o un lenguaje de programacion
	 * 
	 * 
	 * Una lista enlazada se utiliza para guardar informacion del mismo tipo y estos mantienen un orden
	 * explicito
	 */
}
