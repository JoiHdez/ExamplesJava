package mx.escuela.informatica;

import java.util.Scanner;

public class Escuela {
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		do {
			System.out.println("-----------------");
			System.out.println("Escuela");
			System.out.println("1. Registrar alumno");
			System.out.println("2. Registrar maestro");
			System.out.println("3. Registrar tutor");
			System.out.println("4. Salir");
			System.out.println("-----------------");

			opcion = sc.nextInt();
			try {
				System.out.print("\nIngrese ID: ");
				int id = sc.nextInt();

				System.out.print("Ingrese nombre: ");
				String nombre = sc.next();

				System.out.print("Ingrese apellido: ");
				String apellido = sc.next();

				System.out.print("Ingrese correo: ");
				String correo = sc.next();
				switch (opcion) {

				case 1:
					int opcionAlum = 0;
	                
	                Alumno alumno = new Alumno();
	                alumno.setId(id);
	                alumno.setNombre(nombre);
	                alumno.setApellido(apellido);
	                alumno.setCorreoElectronico(correo);

	    			System.out.println("-----------------");
	    			System.out.println("Alumno");
	    			System.out.println("1. Imprimir datos Alumno");
	    			System.out.println("2. Guarda una calificacion");
	    			System.out.println("3. Salir");
	    			System.out.println("-----------------");
	    			opcionAlum = sc1.nextInt();
	    			
	                switch(opcionAlum) {
		                case 1:
		                	alumno.imprimirPerfil(0,false);
		                case 2:
		                	int opcionClaf = 0;
		                	System.out.print("Ingrese una calificacion: ");
		                	double calificacion = sc.nextDouble();
		                	
		                	System.out.println("-----------------");
			    			System.out.println("Alumno");
			    			System.out.println("1. Imprimir datos Alumno");
			    			System.out.println("2. Salir");
			    			System.out.println("-----------------");
			    			opcionClaf = sc.nextInt();
		                	
			    			 switch(opcionClaf) {
				                case 1:
				                	alumno.imprimirPerfil(calificacion,true);
				                case 2:
				                	break;
				                default:
				                	break;
			    			 }
		                case 3: 
		                	break;
	                }
	                
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break;
				}
			} catch (Exception e) {

				System.out.println("Es necesario llenar los datos");
			}

		} while (opcion != 4);

	}

}
