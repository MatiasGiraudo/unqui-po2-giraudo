package ar.edu.unq.po2.tp3;

public class NumeroMayorPares {

	public int numeroConMayorPares(int[] arregloEnteros) {

		int countPares = 0;
		int numeroConMayorPares = 0;

		for (int numero : arregloEnteros) {

			if (cantidadParesDeNumero(numero) > countPares) {
				countPares = cantidadParesDeNumero(numero);
				numeroConMayorPares = numero;
			}
		}

		return numeroConMayorPares;

	}

	private int cantidadParesDeNumero(int numero) {

		int numeroRecibido = numero;
		int cantPares = 0;

		while (numeroRecibido > 0) {

			if ((numeroRecibido % 10) % 2 == 0) {
				cantPares++;
			}
			numeroRecibido /= 10;
		}

		return cantPares;
	}

}
