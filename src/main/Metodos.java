package main;

import listaDoblementeEnlzada.ListaDoblementeEnlazada;
import listaSimpleGenerica.LinkedListGeneric;
import listaSimpleGenerica.NodeGeneric;

public class Metodos {
	
	public Metodos() {
		
	}
	
	/*1. Obtener los números de las posiciones impares de una lista enlazada simple de 
	 	números
	 */
	
	public LinkedListGeneric<Integer> returnListOddPositions(LinkedListGeneric<Integer> listaNumeros) {
	    LinkedListGeneric<Integer> nuevaLista = new LinkedListGeneric<>();
	    NodeGeneric<Integer> nodoAux = listaNumeros.getHeadNode();

	    // Comprobamos si la lista está vacía o si solo tiene un elemento
	    if (nodoAux == null || nodoAux.getNext() == null) {
	        // En estos casos, simplemente devolvemos una lista vacía
	        return nuevaLista;
	    }

	    // Iteramos a través de los nodos de la lista original
	    while (nodoAux != null) {
    		// Añadimos el elemento en la posición impar a la nueva lista
    		nuevaLista.addLast(nodoAux.getData());
        	// Movemos el nodoAux dos posiciones hacia adelante
	    	if(nodoAux.getNext() != null) {
	        	nodoAux = nodoAux.getNext().getNext();
	    	}
	    	else {
	    		nodoAux = nodoAux.getNext();
	    	}
	    }

	    return nuevaLista;
	}

	/*2. Obtener la lista de personas tengan cédula con cantidad de números par de una lista
		enlazada simple de personas.
		*/
	
	public LinkedListGeneric<Persona> returnListPersonaCedulaEven(LinkedListGeneric<Persona> listaPersonas) {
	    LinkedListGeneric<Persona> nuevaLista = new LinkedListGeneric<>();
	    NodeGeneric<Persona> nodoAux = listaPersonas.getHeadNode();
	    
	    while (nodoAux != null) {
	        if (nodoAux.getData().isCedulaLengthEven()) {
	            nuevaLista.addLast(nodoAux.getData());
	        }
	        nodoAux = nodoAux.getNext();
	    }
	    
	    return nuevaLista;
	}

	
	/*3. Eliminar los números pares de una lista enlazada simple
	 */
	
	public LinkedListGeneric<Integer> deleteEvenNumbersSimpleLinkedList(LinkedListGeneric<Integer> listaNumeros){
		LinkedListGeneric<Integer> nuevaLista = new LinkedListGeneric<>();
		NodeGeneric <Integer> nodoAux = listaNumeros.getHeadNode();
		while(nodoAux!=null) {
			if(nodoAux.getData()%2!=0) {
				nuevaLista.addFirst(nodoAux.getData());
			}
			nodoAux = nodoAux.getNext();
		}
		return nuevaLista;
	}
	
	/* 4. Escribir un método que devuelva una lista enlazada con los valores impares de una lista de
		números.
		*/
	
	public LinkedListGeneric<Integer> returnOddValuesList(LinkedListGeneric<Integer> listaNumeros){
		LinkedListGeneric<Integer> nuevaLista = new LinkedListGeneric<>();
		NodeGeneric <Integer> nodoAux = listaNumeros.getHeadNode();
		while (nodoAux!=null) {
			if(nodoAux.getData()%2==1) {
				nuevaLista.addFirst(nodoAux.getData());
			}
			nodoAux = nodoAux.getNext();
		}
		return nuevaLista;
	}
	
	/*
	 * 8. Obtener la lista de personas tengan cédula con cantidad de elementos par de una lista
		enlazada doble de personas.
	 */
	
	public ListaDoblementeEnlazada<Persona> getCedulaEvenLenght(ListaDoblementeEnlazada<Persona> listaPersonas){
		ListaDoblementeEnlazada<Persona> newList = new ListaDoblementeEnlazada<>();
		for (Persona persona : listaPersonas) {
			if(persona.isCedulaLengthEven()) {
				newList.insertarAlFinal(persona);
			}
		}
		return newList;
	}
	
	
	/**
	 * 12. Escriba un programa que calcule la media y la desviación estándar de un conjunto de N
		números reales. Tenga en cuenta que:
		- Implementar una lista enlazada propia
		- Debe leer los n números reales de un archivo
		- Debe almacenar los N números reales en una lista enlazada para realizar los cálculos.
	 */
	
	public double getMediaAritmetica(LinkedListGeneric <Double>lista)
    {
        return getMediaAritmeticaRecursivo(lista , 0 , lista.getHeadNode() , 0);
    }

    //calcular la media de datos almacenados en una lista enlazada
    private double getMediaAritmeticaRecursivo(LinkedListGeneric <Double>lista , int cont,NodeGeneric<Double> nodo, double suma)
    {
        if(nodo==null)
        {
            return suma/cont;
        }
        else {
           return  getMediaAritmeticaRecursivo(lista , cont+1 , nodo.getNext() , suma + nodo.getData());
        }
    }

    private double calcularSumatoriaDesviacion(LinkedListGeneric <Double>lista )
    {
        double suma = 0;
        double media = getMediaAritmetica(lista);

        for(NodeGeneric<Double> nodo = lista.getHeadNode() ; nodo!= null ;nodo = nodo.getNext())
        {
            suma += Math.pow((nodo.getData() - media) , 2);
        }
        return suma;
    }

    public double calcularDesviacion(LinkedListGeneric <Double>lista)
    {
        double sumatoria = calcularSumatoriaDesviacion(lista);
        return Math.sqrt((sumatoria) / (lista.getSize()-1));
    }
	
}
