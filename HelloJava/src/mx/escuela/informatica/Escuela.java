package mx.escuela.informatica;

import java.util.Scanner;

public class Escuela {
	static Scanner scMenu = new Scanner(System.in);
	static Scanner scReg = new Scanner(System.in);
	static Scanner scAlum = new Scanner(System.in);
	static Scanner scAlumCal = new Scanner(System.in);
	static Scanner scMaes = new Scanner(System.in);
	static Scanner scTut = new Scanner(System.in);
	static Scanner scTutCapAlum = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		double calificacion = 0;
		Alumno alumno = new Alumno();
		Maestro maestro = new Maestro();
		Tutor tutor = new Tutor();
		
		do {
			System.out.println("-----------------");
			System.out.println("Escuela");
			System.out.println("1. Registrar alumno");
			System.out.println("2. Registrar maestro");
			System.out.println("3. Registrar tutor");
			System.out.println("4. Salir");
			System.out.println("-----------------");

			opcion = scMenu.nextInt();
			try {
				System.out.print("\nIngrese ID: ");
				int id = scReg.nextInt();

				System.out.print("Ingrese nombre: ");
				String nombre = scReg.next();

				System.out.print("Ingrese apellido: ");
				String apellido = scReg.next();

				System.out.print("Ingrese correo: ");
				String correo = scReg.next();
				
				switch (opcion) {

				case 1:
					int opcionAlum = 0;
	                
	                alumno.setId(id);
	                alumno.setNombre(nombre);
	                alumno.setApellido(apellido);
	                alumno.setCorreoElectronico(correo);
					
	    			System.out.println("-----------------");
	    			System.out.println("Alumno");
	    			System.out.println("1. Imprimir datos");
	    			System.out.println("2. Guarda una calificacion");
	    			System.out.println("3. Salir");
	    			System.out.println("-----------------");
	    			opcionAlum = scAlum.nextInt();
	    			
	                switch(opcionAlum) {
		                case 1:
		                	alumno.imprimirPerfil(0,false,"Alumno");
		                	break;
		                case 2:
		                	int opcionClaf = 0;
		                	
		                	System.out.print("Ingrese una calificacion: ");
		                	calificacion = scAlumCal.nextDouble();
		                	
		                	System.out.println("-----------------");
			    			System.out.println("Alumno");
			    			System.out.println("1. Imprimir datos");
			    			System.out.println("2. Salir");
			    			System.out.println("-----------------");
			    			opcionClaf = scAlumCal.nextInt();
		                	
			    			 switch(opcionClaf) {
				                case 1:
				                	alumno.imprimirPerfil(calificacion,true,"Alumno");
				                	break;
				                case 2:
				                	break;
				                default:
				                	break;
			    			 }
		                case 3: 
		                	break;
	                }
	                break;
				case 2:
					int opcionMaes = 0;
					
					maestro.setId(id);
	                maestro.setNombre(nombre);
	                maestro.setApellido(apellido);
	                maestro.setCorreoElectronico(correo);
	                
	                System.out.println("-----------------");
	    			System.out.println("Maestro");
	    			System.out.println("1. Imprimir datos");
	    			System.out.println("2. Salir");
	    			System.out.println("-----------------");
	    			
	    			opcionMaes = scMaes.nextInt();
                	
	    			switch(opcionMaes) {
		                case 1:
		                	maestro.imprimirPerfil(0,false,"Maestro");
		                	break;
		                case 2:
		                	break;
		                default:
		                	break;
	    			 }
	    			break;
				case 3:
					
					tutor.setId(id);
					tutor.setNombre(nombre);
					tutor.setApellido(apellido);
					tutor.setCorreoElectronico(correo);
	                
					if(alumno.getNombre() != null) {
						int opcionTutor = 0;
						
		    			System.out.println("-----------------");
		    			System.out.println("Tutor");
		    			System.out.println("1. Imprimir datos Tutor");
		    			System.out.println("2. Imprimir datos Alumno");
		    			System.out.println("3. Imprimir ambos");
		    			System.out.println("4. Salir");
		    			System.out.println("-----------------");
		    			opcionTutor = scTut.nextInt();
		    			
		    			switch(opcionTutor) {
			                case 1:
			                	tutor.imprimirPerfil(0,false,"Tutor");
			                	break;
			                case 2:
			                	alumno.imprimirPerfil(calificacion,true,"Alumno");
			                	break;
			                case 3:
			                	tutor.imprimirPerfil(0,false,"Tutor");
			                	alumno.imprimirPerfil(calificacion,true,"Alumno");
			                	break;
			                case 4:
			                	break;
			                default:
			                	break;
		    			}
		    			
					} else {
						int opcionTutorCapAl = 0;
						
						System.out.println("-----------------");
		    			System.out.println("Tutor");
		    			System.out.println("1. Imprimir datos");
		    			System.out.println("2. Capturar Alumno");
		    			System.out.println("3. Salir");
		    			System.out.println("-----------------");
		    			opcionTutorCapAl = scTutCapAlum.nextInt();
		    			
		    			switch(opcionTutorCapAl) {
			                case 1:
			                	tutor.imprimirPerfil(0,false,"Tutor");
			                	break;
			                case 2:
			                	System.out.print("\nIngrese ID: ");
			    				id = scReg.nextInt();

			    				System.out.print("Ingrese nombre: ");
			    				nombre = scReg.next();

			    				System.out.print("Ingrese apellido: ");
			    				apellido = scReg.next();

			    				System.out.print("Ingrese correo: ");
			    				correo = scReg.next();
			    				
			    				opcionAlum = 0;
				                
				                alumno.setId(id);
				                alumno.setNombre(nombre);
				                alumno.setApellido(apellido);
				                alumno.setCorreoElectronico(correo);
								
				    			System.out.println("-----------------");
				    			System.out.println("Alumno");
				    			System.out.println("1. Imprimir datos");
				    			System.out.println("2. Guarda una calificacion");
				    			System.out.println("3. Salir");
				    			System.out.println("-----------------");
				    			opcionAlum = scAlum.nextInt();
				    			
				                switch(opcionAlum) {
					                case 1:
					                	alumno.imprimirPerfil(0,false,"Alumno");
					                	break;
					                case 2:
					                	int opcionClaf = 0;
					                	
					                	System.out.print("Ingrese una calificacion: ");
					                	calificacion = scAlumCal.nextDouble();
					                	
					                	System.out.println("-----------------");
						    			System.out.println("Alumno / Tutor");
						    			System.out.println("1. Imprimir datos Tutor");
						    			System.out.println("2. Imprimir datos Alumno");
						    			System.out.println("3. Imprimir ambos");
						    			System.out.println("4. Salir");
						    			System.out.println("-----------------");
						    			opcionClaf = scAlumCal.nextInt();
					                	
						    			 switch(opcionClaf) {
						    			 	case 1:
							                	tutor.imprimirPerfil(0,false,"Tutor");
							                	break;
							                case 2:
							                	alumno.imprimirPerfil(calificacion,true,"Alumno");
							                	break;
							                case 3:
							                	tutor.imprimirPerfil(0,false,"Tutor");
							                	alumno.imprimirPerfil(calificacion,true,"Alumno");
							                	break;
							                case 4:
							                	break;
							                default:
							                	break;
						    			 }
					                case 3: 
					                	break;
				                }
				                
			                case 3:
			                	break;
			                default:
			                	break;
		    			}
		    			break;
					}
	    			
				default:
					break;
				}
			} catch (Exception e) {

				System.out.println("Es necesario llenar los datos");
			}

		} while (opcion != 4);

	}

}
