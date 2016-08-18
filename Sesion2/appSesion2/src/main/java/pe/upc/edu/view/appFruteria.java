package pe.upc.edu.view;

import pe.upc.edu.entity.Fruta;
import pe.upc.edu.entity.Mermelada;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Fruta f=new Fruta("Amarillo", "Dulce");
		
		Mermelada mer=new Mermelada("Rojo","Acido",1,"Vidrio");
		
		System.out.println(f.toString());
		f.SoyunMetodoObjeto();
		
		System.out.println(mer.toString());
		mer.SoyunMetodoObjeto();
		
		Fruta.LugarOrigen="Tierra";
		Fruta.SoyunMetodoGlobal();
		

	}

}
