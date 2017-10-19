package com.ubosque.Logica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer values[] = {1,2,3,4,5,6,7,8,9,10};
		Arbol<Integer> b = new Arbol();
		Nodo<Integer> raiz =  b.ordenadoPorNivel(values);
		b.setCentral(raiz);
		System.out.println(b);
	}

}
