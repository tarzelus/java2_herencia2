//package com.zubiri.eleccionesssssssssssssssssssrethjetjmr;
import java.util.Scanner;


public class Escuela {

    
	public Escuela(){
		super();
	}



		private int idEscuela;
		private String tipoEscuela;
		private String nombreEscuela;
		private String direccionEscuela;
	
		
//--------------------id escuela--------------------------------	
		public int getIdEscuela()
		{
			return idEscuela;
		}
		
		public void  setIdEscuela(int idEscuela1)
		{
			idEscuela = idEscuela1;
		}


//--------------------tipo de escuela--------------------------------

		public String getTipoEscuela()
		{
			return tipoEscuela;
		}
		
		public void  setTipoEscuela(String tipoEscuela1)
		{
			tipoEscuela=tipoEscuela1;
		}


//---------------------nombreEscuela-------------------------------

		public String getNombreEscuela()
		{
			return nombreEscuela;
		}
		
		public void  setNombreEscuela(String nombreEscuela1)
		{
	 		nombreEscuela = nombreEscuela1;
		}

//---------------------direccionescuela-------------------------------

		public String getDireccionEscuela()
		{
			return direccionEscuela;
		}
		
		public void  setDireccionEscuela(String direccionEscuela1)
		{
	 		direccionEscuela = direccionEscuela1;
		}

		public void imprimir()
		 {
		
		 System.out.print("\n\n--- Profesor: ");
		 System.out.println("Nombre del profesor: " + getIdEscuela());
		 System.out.println("Id del profesor: " + getTipoEscuela());
		 System.out.println("tipo de profesor: " + getNombreEscuela());
		 System.out.println("Horario del profesor: " + getDireccionEscuela());
		}



	

	
}
