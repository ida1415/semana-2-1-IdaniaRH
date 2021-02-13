/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Telefono {
	public String marca;
	public int tamano;
	public String color;
	public float precio;
	String sistemaOperativo;
	
	/**
	 * 
	 */
	public Telefono(String marca, int tamano, String color, float precio, String sistemaOperativo) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.tamano = tamano;
		this.color = color;
		this.precio = precio;
		this.sistemaOperativo = sistemaOperativo;
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono cel = new Telefono("Samsung", 5 ,"Negro", 10000, "Android");
	}

}
