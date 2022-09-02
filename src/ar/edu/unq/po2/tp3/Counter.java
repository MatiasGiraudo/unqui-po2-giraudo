package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	 
	private ArrayList<Integer> listNumbers = new ArrayList<Integer>();

	public void addNumber(int number) {
		listNumbers.add(number);
	}
	
	public int cantPares() {
		int count = 0;
		for(int number : listNumbers) {
			if(number % 2 == 0) count++;
		}
		return count;
	}
	
	public int cantImpares() {
		int count = 0;
		for(int number : listNumbers) {
			if(number % 2 != 0) count++;
		}
		return count;
	}
	
	public int cantidadMultiplosDe(int numberADividir) {
		int count =0;
		for(int number : listNumbers) {
			if(numberADividir % number == 0) count++;
		}
		return count;
	}
	
}
