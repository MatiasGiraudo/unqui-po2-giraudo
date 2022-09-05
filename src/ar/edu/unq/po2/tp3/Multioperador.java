package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
private ArrayList<Integer> listaNumeros;
	
	public Multioperador(ArrayList<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
	
	public int resultadoSuma() {
		int resultado = 0;
		
		for(int numero :listaNumeros) {
			resultado += numero;
		}
		
		return resultado;
	}
	
	public int resultadoResta() {
				
		int resultado = 0;	
		
		for(int numero :listaNumeros) {
		
			resultado -= numero;
		}
		
		return resultado;
	}
	
	public int resultadoMultiplicacion() {
		int resultado = 1;
		
		for(int numero :listaNumeros) {
			resultado *= numero;
		}
		
		return resultado;
	}
}
