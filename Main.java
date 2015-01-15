import java.util.Hashtable;

public class Main {
	public static void main (String [ ] Args) {
	        Escuela escuela = new Escuela ();
	        escuela.setDireccion("sagues");
	        escuela.setTipo("batxillergoa / zikloal");
	        escuela.setLocalidad("donostia");

	        
	        System.out.print("--- Escuela: ");
	        System.out.print("\nDireccionEscuela: " + escuela.getDireccion());
	        System.out.print("\Nombre: " + escuela.setTipo());
	        System.out.print("\nId: " + escuela.getIdMuseo());


	        Iglesia iglesia = new Iglesia();
	        iglesia.setNombreIglesia("Buen Pastor");
	        iglesia.setIdIglesia(2);
	        iglesia.setTipoIglesia("catedral");

	        
	        //Hashtable

	        Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();

	        otrosEspacios.put("Barrio", "amara");
			otrosEspacios.put("Polideportivo", "Anoeta");
			otrosEspacios.put("Biblioteca", "Koldo Mitxelena");
			otrosEspacios.put("Universidad", "EHU");


			System.out.print("\n\n----Impresion Hashtable : \n");
			System.out.println(otrosEspacios.get("Biblioteca"));
			System.out.println(otrosEspacios.get("Universidad"));
	        
	}
}
