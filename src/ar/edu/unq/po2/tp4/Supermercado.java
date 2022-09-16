package ar.edu.unq.po2.tp4;

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
