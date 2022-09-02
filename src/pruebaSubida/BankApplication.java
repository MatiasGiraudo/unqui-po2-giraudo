package pruebaSubida;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Defino variable de tipo CajaAhorro.
		CajaAhorro miCajaAhorro;
		//Asigno nueva instancia de ese objeto.
		miCajaAhorro = new CajaAhorro();
		*/
		
		//Lo mismo
		CajaAhorro miCajaAhorro = new CajaAhorro();
		miCajaAhorro.depositar(10);
		miCajaAhorro.depositar(20);
		
		System.out.println("El saldo actual es: " + miCajaAhorro.getSaldo());
	}

}
