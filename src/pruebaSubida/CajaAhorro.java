package pruebaSubida;

public class CajaAhorro {
	//Por convención la variable tiene que ser privada para que demas objetos le pidan el dato.
		//Siempre comienzan con minusculas
		private float saldo;
		
		//Los getters y setters por convension comienzan con get o set respectivamente.
		//Se pueden generar desde el menu "Source"
		public float getSaldo() {
			return saldo;
		}
		
		//Se coloca this porque el parametro se llama igual que el colaborador interno.
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public void depositar(float monto) {
			saldo += monto;		
		}
}
