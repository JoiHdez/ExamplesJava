package mx.escuela.informatica;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private String correoElectronico;

	public Persona(int id, String nombre, String apellido, String correoElectronico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
	}

	public Persona() {
	}

	public void imprimirPerfil(double calificacion, boolean calf) {
		
		String calfs = calf ? correoElectronico + "\nCalificacion = " + calificacion : "";
		System.out.println("-----------------");
		System.out.println("\nInformacion \n\n" +"id = " + id + "\nNombre = " + nombre + "\nApellido = " + apellido
				+ "\nCorreoElectronico = " + correoElectronico + calfs);
		System.out.println("-----------------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
}
