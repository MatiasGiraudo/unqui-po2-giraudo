IDE > ENtonno de desarrollo integrado. Usa como motor el JDK y esta conectado al FileSystem.
JDK > paquete de herramientas para poder desarrollar en Java.
JRE > paquete para correr sistemas en Java.

clase .java > compilado en ByteCodes.

Cada Sistema operativo tiene su JWM(Java Virtual Machine) que entiende el Bytecode generado en Java.
Esto esta dado para no tener que compilar las aplicaciones para cada SO.


Convenciones en JAVA:
Variables y paquetes: comienzan con minusculas.
Clases y metodos: comienzan con mayusculas.


Clase Producto
package tp4;

public class Producto {

	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado = false;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double d) {
		this.precio += d;		
	}
	
	
	
}


Clase Prod primera necesidad
package tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}
	
}


Clase supermercado
package tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> listaProductos = new ArrayList<Producto>();

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.listaProductos.size();
	}
	
	public double getPrecioTotal() {
		return this.listaProductos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
	}

}







