IDE > ENtonno de desarrollo integrado. Usa como motor el JDK y esta conectado al FileSystem.
JDK > paquete de herramientas para poder desarrollar en Java.
JRE > paquete para correr sistemas en Java.

clase .java > compilado en ByteCodes.

Cada Sistema operativo tiene su JWM(Java Virtual Machine) que entiende el Bytecode generado en Java.
Esto esta dado para no tener que compilar las aplicaciones para cada SO.


Convenciones en JAVA:
Variables y paquetes: comienzan con minusculas.
Clases y metodos: comienzan con mayusculas.

Clase main para ejecutar la aplicacion
public static void main(String[] args) {
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
  
  Clase de prueba
  package paqueteBancario;

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







