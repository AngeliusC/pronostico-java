import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Partido {

	String equipo1;
	String equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}
	public static List<Partido> leerPartidos(String archivo) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(archivo));
        List<Partido> partidos = new ArrayList<>();

        for (String linea : lineas) {
            String[] partes = linea.split(" ");
            String equipo1 = partes[0].trim();
            int golesEquipo1 = Integer.parseInt(partes[1].trim());
            int golesEquipo2 = Integer.parseInt(partes[2].trim());
            String equipo2 = partes[3].trim();

            Partido partido = new Partido(equipo1, equipo2, golesEquipo1, golesEquipo2);
            partidos.add(partido);
        }

        return partidos;
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
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	@Override
	public String toString() {
		return "partido: " + equipo1 + " " + golesEquipo1 + " " + golesEquipo2
				+ " " + equipo2 + " ";
	}
	
}
