package com.ubosque.Logica;

public class Arbol<T> {

	Nodo<T> central;
	
	public Nodo getCentral(){
		return central;
	}
	
	public void setCentral(Nodo central){
		this.central = central;
	}
	
	public Nodo<T> ordenadoPorNivel(T[] arreglo){
		return ordenadoPorNivel(arreglo,0);
	}
	
	public Nodo<T> ordenadoPorNivel(T[] arreglo, int inicio){
		int tamanio = arreglo.length;
		Nodo actual = new Nodo();
		actual.setValor(arreglo[inicio]);
		int izquierdo = 2*inicio+1;
		int derecho = 2*inicio+2;
		if (izquierdo<tamanio) {
			actual.setIzquierdo(ordenadoPorNivel(arreglo,izquierdo));
		}
		if (derecho<tamanio) {
			actual.setDerecho(ordenadoPorNivel(arreglo, derecho));
		}
		return actual;
	}
	

}
