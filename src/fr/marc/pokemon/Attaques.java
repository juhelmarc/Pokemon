package fr.marc.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Attaques {

	private String nomAttaque;
	private int dmgAttaque;
	private String element;

	public Attaques() {

	}

	public Attaques(String nomAttaque, int dmgAttaque, String element) {
		this.nomAttaque = nomAttaque;
		this.dmgAttaque = dmgAttaque;
		this.element = element;

	}

	public int getDmgAttaque() {
		return dmgAttaque;
	}

	public void setDmgAttaque(int dmgAttaque) {
		this.dmgAttaque = dmgAttaque;
	}

	public String getNomAttaque() {
		return nomAttaque;
	}

	public void setNomAttaque(String nomAttaque) {
		this.nomAttaque = nomAttaque;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public static List<Attaques> ATTAQUE_GAYLORD = Arrays.asList(new Attaques("Giflette", 5, null),
			new Attaques("Coup de tête", 10, null), new Attaques("Crachat", 7, "eau"),
			new Attaques("Coup de point", 6, "vent"), new Attaques("Coup special : ghost rider", 25, "feu"));
	public static List<Attaques> ATTAQUE_ADRIEN = Arrays.asList(new Attaques("Tacle par derrière", 8, null),
			new Attaques("Double gifle papillon", 12, "vent"), new Attaques("Drague lourde", 5, "tenebres"),
			new Attaques("Regard insistant", 4, "tenebres"), new Attaques("Coup special : Nazaret big wave", 24, "eau")

	);
	public static List<Attaques> ATTAQUE_ADIL = Arrays.asList(new Attaques("Roulade", 2, null),
			new Attaques("Ecrasement", 5, "sol"), new Attaques("Hurlement", 4, "tenebre"),
			new Attaques("Donkey Kong, créée des tournades en frappant sur sa poitrine", 7, "vent"),
			new Attaques("Coup special : eclipse", 15, "tenebre"));

}
