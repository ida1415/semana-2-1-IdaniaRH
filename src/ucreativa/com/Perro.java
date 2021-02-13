/**
 * 
 */
package ucreativa.com;

/**
 * @author Idania
 *
 */
public class Perro {
	protected String nombre;
	String color;
	public int nivelHambre;
	
	/**
	 * 
	 */
	public Perro(String nombre, String color, int nivelHambre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.color = color;
		this.nivelHambre = nivelHambre;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro var1 = new Perro("Dakota", "cafe",5);
		//ejemplo para imprimir valor
		System.out.print(var1.color);
	}

}
