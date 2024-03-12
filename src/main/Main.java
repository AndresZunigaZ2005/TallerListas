package main;

import listaDoblementeEnlzada.ListaDoblementeEnlazada;
import listaSimpleGenerica.LinkedListGeneric;
import pruebaPregunta11.Polynomial;

public class Main {
	
	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		
		LinkedListGeneric<Integer> simpleLinkedListIntegers = new LinkedListGeneric<>();
		simpleLinkedListIntegers.addLast(5);
		simpleLinkedListIntegers.addLast(4);
		simpleLinkedListIntegers.addLast(2);
		simpleLinkedListIntegers.addLast(7);
		simpleLinkedListIntegers.addLast(5);
		
		LinkedListGeneric<Integer> simpleLinkedListIntegers2 = new LinkedListGeneric<>();
		simpleLinkedListIntegers.addLast(10);
		simpleLinkedListIntegers.addLast(12);

		
		
		LinkedListGeneric<Persona> simpleLinkedListPersona = new LinkedListGeneric<>();
		
		simpleLinkedListPersona.addLast(new Persona("12345"));
		simpleLinkedListPersona.addLast(new Persona("1234"));
		simpleLinkedListPersona.addLast(new Persona("12"));
		simpleLinkedListPersona.addLast(new Persona("123"));
		
		ListaDoblementeEnlazada<String> doubleLinkedListString = new ListaDoblementeEnlazada<>();
		
		doubleLinkedListString.insertarAlFinal("pacho");
		doubleLinkedListString.insertarAlFinal("noreña");
		doubleLinkedListString.insertarAlFinal("carballo");
		doubleLinkedListString.insertarAlFinal("robinson");
		
		
		ListaDoblementeEnlazada<Persona> doubleLinkedListPersona = new ListaDoblementeEnlazada<>();
		
		doubleLinkedListPersona.insertarAlFinal(new Persona("12345"));
		doubleLinkedListPersona.insertarAlFinal(new Persona("1234"));
		doubleLinkedListPersona.insertarAlFinal(new Persona("12"));
		doubleLinkedListPersona.insertarAlFinal(new Persona("123"));
		
		LinkedListGeneric<Double> listaDoubles = new LinkedListGeneric<>();

		// Agregar elementos a la lista
		listaDoubles.addLast(3.14);
		listaDoubles.addLast(2.718);
		listaDoubles.addLast(1.618);
		
		
		LinkedListGeneric<Integer> firstQuestion = metodos.returnListOddPositions(simpleLinkedListIntegers);
		System.out.println("Pregunta 1");
		firstQuestion.printList();
		System.out.println();
		
		
		LinkedListGeneric<Persona> secondQuestion = metodos.returnListPersonaCedulaEven(simpleLinkedListPersona);
		System.out.println("Pregunta 2");
		secondQuestion.printList();
		System.out.println();
		
		LinkedListGeneric<Integer> thirdQuestion = metodos.deleteEvenNumbersSimpleLinkedList(simpleLinkedListIntegers);
		System.out.println("Pregunta 3");
		thirdQuestion.printList();
		System.out.println();
		
		
		
		LinkedListGeneric<Integer> fourthQuestion = metodos.returnOddValuesList(simpleLinkedListIntegers);
		System.out.println("Pregunta 4");
		fourthQuestion.printList();
		System.out.println();
		
		
		
		System.out.println("Pregunta 5");
		System.out.println(simpleLinkedListIntegers.countRepetedData(5));
		
		
		
		System.out.println("Pregunta 6");
		doubleLinkedListString.imprimirHaciaAtras();
		System.out.println();
		
		
		
		System.out.println("Pregunta 8");
		ListaDoblementeEnlazada<Persona> eightQuestion = metodos.getCedulaEvenLenght(doubleLinkedListPersona);
		eightQuestion.imprimirLista();
		System.out.println();
		
		
		LinkedListGeneric<Integer> listaSimple = new LinkedListGeneric<>();
		LinkedListGeneric<Integer> tenQuestion = listaSimple.concatenarListas(simpleLinkedListIntegers, simpleLinkedListIntegers2);
		System.out.println("Pregunta 10");
		tenQuestion.printList();
		System.out.println();
		
		System.out.println("Pregunta 11");
        Polynomial polynomial = new Polynomial();
        // Ingresar términos del polinomio
        polynomial.insertTerm(4, 0);
        polynomial.insertTerm(-4, 2);
        polynomial.insertTerm(11, 0);

        // Generar tabla de valores para diferentes valores de x
        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x\t|\ty");
        System.out.println("---------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double y = polynomial.evaluate(x);
            System.out.println(x + "\t|\t" + y);
		
        }
		System.out.println("Pregunta 12");
		System.out.println(metodos.getMediaAritmetica(listaDoubles));
		System.out.println(metodos.calcularDesviacion(listaDoubles));
	}

	
}
