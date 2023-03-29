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
    	    System.out.println("===APUESTAS REALIZADAS===");
    	    for (Pronostico pronostico : pronosticos) {
    	           	int id = pronostico.persona.getId();
    	           	String nombre = pronostico.persona.getNombre();
    	           	String apellido = pronostico.persona.getApellido();
    	           	String equipo1 = pronostico.getEquipo1();
    	           	String equipo2 = pronostico.getEquipo2();
    	           	String apuesta = pronostico.getGanaEquipo1() == 1 ? "Gana a " : 
    	                 (pronostico.getEmpate() == 1 ? "Empata contra " : "Pierde contra");
    	           	String apuestaGanada = apuesta.equals("Gana a ") ? "Has ganado la apuesta" : "Has perdido la apuesta";
    	           	int grupo = pronostico.getGrupo();
    	           	System.out.println("ID apostador: " + id);
    	           	System.out.println("Nombre apostador: " + nombre + " " + apellido);
    	           	System.out.println("Partido: " + equipo1 + " VS " + equipo2);
    	           	System.out.println("Apuesta: " + equipo1 + " " + apuesta + " " + equipo2);
    	           	for (Partido partido : partidos) {
    	                if (partido.getEquipo1().equals(equipo1) && partido.getEquipo2().equals(equipo2)) {
    	                    String resultado = partido.toString();
    	                    System.out.println("Resultado " + resultado);
    	                    break;
    	                    
    	                }
    	      }
    	           	System.out.println("Resultado apuesta: " + apuestaGanada);
    	           	System.out.println("Grupo: " + grupo);
    	 }
    }
}

    