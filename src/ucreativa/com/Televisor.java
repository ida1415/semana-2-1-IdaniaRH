/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Televisor {
	public String marca;
	public float tamano;
	public String color;
	public float precio;
	
	/**
	 * 
	 */
	public Televisor(String marca, float tamano, String color, float precio) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.tamano = tamano;
		this.color = color;
		this.precio = precio;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tele = new Televisor("ASUS", 27,"Negro", 16000);
	}

}
