import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Persona {

	private int id;
	private String nombre;
	private String apellido;
	
	
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public static List<Persona> leerPersonas(String archivo) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(archivo));
        List<Persona> personas = new ArrayList<>();

        for (String linea : lineas) {
            String[] partes = linea.split(" ");
            int id = Integer.parseInt(partes[0].trim());
            String nombre = partes[1].trim();
            String apellido = partes[2].trim();

            Persona persona = new Persona(id, nombre, apellido);
            personas.add(persona);
        }

        return personas;
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
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
