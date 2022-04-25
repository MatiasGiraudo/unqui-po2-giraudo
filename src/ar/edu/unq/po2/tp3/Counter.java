package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {
	
	List<Integer>listaNumeros = new ArrayList<Integer>(); 

	
	public void agregarNumero(int numero) {
		this.listaNumeros.add(numero);
	}
	
	public int getCantidadPares() {
				
		return this.getListaNumeros().stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList()).size();
	}
	
	public int getCantidadImpares() {
		
		return this.getListaNumeros().stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList()).size();
	}
	
	public int getCantidadMultiplosDe(int num) {
		
		return this.getListaNumeros().stream().filter(numero -> num % numero == 0).collect(Collectors.toList()).size();
	}
	
   private List<Integer> getListaNumeros() {
	   return this.listaNumeros;
   }
	
}

