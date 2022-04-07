package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {
	
	List<Integer>listaNumeros = new ArrayList<Integer>(); 
	
	/*
	public Counter(int numero) {
		this.agregarNumero(numero);
	}
	*/
	
	public void agregarNumero(int numero) {
		this.listaNumeros.add(numero);
	}
	
	public int getCantidadPares() {
				
		return this.listaNumeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList()).size();
	}
	
	public int getCantidadImpares() {
		
		return this.listaNumeros.stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList()).size();
	}
	
	public int getCantidadMultiplosDe(int num) {
		
		return this.listaNumeros.stream().filter(numero -> num % numero == 0).collect(Collectors.toList()).size();
	}
}

