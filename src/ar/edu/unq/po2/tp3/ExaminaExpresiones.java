package ar.edu.unq.po2.tp3;

public class ExaminaExpresiones {

	private String a = "abc";
	private String s = "a";
	private String t;

	public void examinar() {
		//Devuelve un int con el largo de cadena.
		int largoS = s.length();
		//Da error ya que t esta inicializado pero nunca se le asigan un valor.
		//int largoT = t.length();
		//Devuelve la concatenacion de ambos valores
		String concatenar = 1 + a;
		//Devuelve un int con el lugar donde se posiciona la r.
		int lugarR = "Libertad".indexOf("r");
		//Devuelve un int con el lugar donde se posiciona la i.
		int lugarI = "Universidad".lastIndexOf('i');
		//Devuelve el string resultante entre la posicion 2 hasta la posicion 4 de Quilmes.
		String cortarCadena = "Quilmes".substring(2,4);
		//Setea true cuando la cadena comienza con "a".
		boolean compara = (a.length() + a).startsWith("a");
		//Devuelve false ya que "s" no es igual a "a".
		boolean comparaCadenas = s == a;
		//Compara si lo obtenido por substring es igual a "bc".
		boolean comparaCadenas2 = a.substring(1,3).equals("bc");
		
		
		
	}
}
