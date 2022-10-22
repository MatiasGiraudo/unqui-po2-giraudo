package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moverPunto(int x, int y) {
		this.setX(x); 
		this.setY(y);
	}
	
	public void sumarPunto(Point punto) {
		
		this.x += punto.x;
		this.y += punto.y;
	}
	
	
	
	

}
