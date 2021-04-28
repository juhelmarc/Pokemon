package fr.marc.pokemon;

import java.util.ArrayList;
import java.util.Arrays;

public class Attaques {

	private String nomAttaque;
	private int dmgAttaque;
	public Attaques(String nomAttaque, int dmgAttaque) {
		this.setNomAttaque(nomAttaque);	
		this.setDmgAttaque(dmgAttaque);
		
		
			
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
	
	
				
}
