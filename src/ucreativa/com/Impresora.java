/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Impresora {
	String marca;
	protected String color;
	public String tipoTinta;
	public float precio;
	
	/**
	 * 
	 */
	public Impresora(String marca, String color,String tipoTinta, float precio) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.color = color;
		this.tipoTinta = tipoTinta;
		this.precio = precio;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora impre = new Impresora("Canon","Negra", "EcoTank" , 10000);
	}

}
