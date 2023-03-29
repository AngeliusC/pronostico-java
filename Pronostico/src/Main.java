import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	    List<Partido> partidos = Partido.leerPartidos("src/archivos/resultados.txt");
    	    System.out.println("===PARTIDOS ANTERIORES===");
    	    for (Partido partido : partidos) {
    	    	System.out.println(partido.toString());
    	}
    	    List<Pronostico> pronosticos = Pronostico.leerPronostico("src/archivos/pronosticos.txt", "src/archivos/persona.txt");
    	    List<Persona> persona = Persona.leerPersonas("src/archivos/persona.txt");
    	    System.out.println("===APUESTAS REALIZADAS===");
    	    
    	    for (Pronostico pronostico : pronosticos) {
    	           	int id = pronostico.persona.getId();
    	           	String nombre = pronostico.persona.getNombre();
    	           	String apellido = pronostico.persona.getApellido();
    	           	String equipo1 = pronostico.getEquipo1();
    	           	String equipo2 = pronostico.getEquipo2();
    	           	System.out.println("ID apostador: " + id);
    	           	System.out.println("Nombre apostador: " + nombre + " " + apellido);
    	           	System.out.println("Partido: " + equipo1 + " VS " + equipo2);
    	           	System.out.println("Apuesta: " );
    	           	System.out.println("Resultado partido: ");
    	           	System.out.println("Resultado apuesta: ");
    	        
    	 }
    }
}

    