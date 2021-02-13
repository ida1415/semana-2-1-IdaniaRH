/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Lampara {
	String marca;
	protected String color;
	public float precio;
	
	/**
	 * 
	 */
	public Lampara(String marca, String color, float precio) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampara lavadora = new Lampara("LG","Gris", 1200);
	}

}
