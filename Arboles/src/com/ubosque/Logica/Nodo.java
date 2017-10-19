package com.ubosque.Logica;

public class Nodo<T> {

	private T valor;
	private Nodo<T> izquierdo;
	private Nodo<T> derecho;
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	public void setIzquierdo(Nodo<T> izquierdo) {
		this.izquierdo = izquierdo;
	}
	public void setDerecho(Nodo<T> derecho) {
		this.derecho = derecho;
	}
		
}
