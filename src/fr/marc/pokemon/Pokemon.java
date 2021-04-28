package fr.marc.pokemon;
import java
public class Pokemon {
	
	
		private Pokemon pokemon;	
		private Pokemon pokemonSoin;
		private String nom;
		private int pointDeVie;
		private String attaque1;
		private int dmgAttaque1;
		private String attaque2;
		private int dmgAttaque2;
		private String attaque3;
		private int dmgAttaque3;
		private String attaque4;
		private int dmgAttaque4;
		private String message;

	
	public Pokemon(String nom, int pointDeVie, String attaque1, int dmgAttaque1, String attaque2, int dmgAttaque2, String attaque3, int dmgAttaque3, String attaque4, int dmgAttaque4, String message) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.attaque1 = attaque1;
		this.dmgAttaque1 = dmgAttaque1;
		this.attaque2 = attaque2;
		this.dmgAttaque2 = dmgAttaque2;
		this.attaque3 = attaque3;
		this.dmgAttaque3 = dmgAttaque3;
		this.attaque4 = attaque4;
		this.dmgAttaque4 = dmgAttaque4;
		this.message = message;
		
	}
	
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public Pokemon getPokemonSoin() {
		return pokemonSoin;
	}
	public void setPokemonSoin(Pokemon pokemonSoin) {
		this.pokemonSoin = pokemonSoin;
	}
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getPointDeVie() {
		return pointDeVie;
	}


	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}


	public String getAttaque1() {
		return attaque1;
	}


	public void setAttaque1(String attaque1) {
		this.attaque1 = attaque1;
	}


	public int getDmgAttaque1() {
		return dmgAttaque1;
	}


	public void setDmgAttaque1(int dmgAttaque1) {
		this.dmgAttaque1 = dmgAttaque1;
	}


	public String getAttaque2() {
		return attaque2;
	}


	public void setAttaque2(String attaque2) {
		this.attaque2 = attaque2;
	}


	public int getDmgAttaque2() {
		return dmgAttaque2;
	}


	public void setDmgAttaque2(int dmgAttaque2) {
		this.dmgAttaque2 = dmgAttaque2;
	}


	public String getAttaque3() {
		return attaque3;
	}


	public void setAttaque3(String attaque3) {
		this.attaque3 = attaque3;
	}


	public int getDmgAttaque3() {
		return dmgAttaque3;
	}


	public void setDmgAttaque3(int dmgAttaque3) {
		this.dmgAttaque3 = dmgAttaque3;
	}


	public String getAttaque4() {
		return attaque4;
	}


	public void setAttaque4(String attaque4) {
		this.attaque4 = attaque4;
	}


	public int getDmgAttaque4() {
		return dmgAttaque4;
	}


	public void setDmgAttaque4(int dmgAttaque4) {
		this.dmgAttaque4 = dmgAttaque4;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	
	
}
