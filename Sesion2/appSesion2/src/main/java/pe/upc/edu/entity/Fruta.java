package pe.upc.edu.entity;

public class Fruta {
	
	//Atributos de instancia
	private String color;
	private String sabor;
	
	//Atributos de clase
	public static String LugarOrigen="UPC";

	//Constructores
	public Fruta(String color, String sabor) {
		super();
		this.color = color;
		this.sabor = sabor;
	}

	//Getters and Setters
	
	public static void SoyunMetodoGlobal() {
	}

	public void SoyunMetodoObjeto() {
		LugarOrigen="Hola";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+this.getColor();
	}
	
	

}
