import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pronostico {
	Persona persona;
	private int pronosticoId;
    private String equipo1;
    private String equipo2;
    private int ganaEquipo1;
    private int empate;
    private int ganaEquipo2;
    private int grupo;

    public Pronostico(Persona persona, int id, String equipo1, String equipo2, int ganaEquipo1, int empate, int ganaEquipo2, int grupo) {
    	this.equipo1 = equipo1;
    	this.equipo2 = equipo2;
        this.ganaEquipo1 = ganaEquipo1;
        this.empate = empate;
        this.ganaEquipo2 = ganaEquipo2;
        this.grupo = grupo;
        this.persona = persona;
    }
    
    public static List<Pronostico> leerPronostico(String archivoPronostico, String archivoPersona) throws IOException {
        List<String> lineasPronostico = Files.readAllLines(Paths.get(archivoPronostico));
        List<String> lineasPersona = Files.readAllLines(Paths.get(archivoPersona));
        List<Pronostico> pronosticos = new ArrayList<>();
        Map<Integer, Persona> personas = new HashMap<>();

        for (String linea : lineasPersona) {
            String[] partes = linea.split(" ");
            int id = Integer.parseInt(partes[0].trim());
            String nombre = partes[1].trim();
            String apellido = partes[2].trim();

            Persona persona = new Persona(id, nombre, apellido);
            personas.put(id, persona);
        }

        for (String linea : lineasPronostico) {
            String[] partes = linea.split(" ");
            int pronosticoId = Integer.parseInt(partes[0].trim());
            int personaId = Integer.parseInt(partes[0].trim());
            String equipo1 = partes[1].trim();
            int ganaEquipo1 = Integer.parseInt(partes[2].trim());
            int empate = Integer.parseInt(partes[3].trim());
            int ganaEquipo2 = Integer.parseInt(partes[4].trim());
            String equipo2 = partes[5].trim();
            int grupo = Integer.parseInt(partes[6].trim());

            Persona persona = personas.get(personaId);
            Pronostico pronostico = new Pronostico(persona, pronosticoId, equipo1, equipo2, ganaEquipo1, empate, ganaEquipo2, grupo);
            pronosticos.add(pronostico);
        }

        return pronosticos;
    }
	public int getPronosticoId() {
		return pronosticoId;
	}
	public void setPronosticoId(int pronosticoId) {
		this.pronosticoId = pronosticoId;
	}

	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGanaEquipo1() {
		return ganaEquipo1;
	}
	public void setGanaEquipo1(int ganaEquipo1) {
		this.ganaEquipo1 = ganaEquipo1;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	public int getGanaEquipo2() {
		return ganaEquipo2;
	}
	public void setGanaEquipo2(int ganaEquipo2) {
		this.ganaEquipo2 = ganaEquipo2;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Persona getPersona() {
		return persona;
	}
}