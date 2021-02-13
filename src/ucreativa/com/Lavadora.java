/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Lavadora {
	String marca;
	protected String color;
	public int libras;
	protected String ciclosLavado;
	public float precio;
	
	/**
	 * 
	 */
	public Lavadora(String marca, String color,int libras, String ciclosLavado, float precio) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.color = color;
		this.libras = libras;
		this.ciclosLavado = ciclosLavado;	
		this.precio = precio;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lavadora lampara = new Lavadora("Samsumg","Gris",40, "Fuerte" , 12000);
	}

}
