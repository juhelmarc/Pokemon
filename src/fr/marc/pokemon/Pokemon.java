package fr.marc.pokemon;

public class Pokemon {
	
	
		private Pokemon pokemon;	
		private Pokemon pokemonSoin;
		private String nom;
		private int pointDeVie;
		private Attaques attaque1;
		private Attaques attaque2;
		private Attaques attaque3;
		private Attaques attaque4;
		private String message;
		static int nbrPokemon;
		private int pvMax;
	
	public  Pokemon(String nom, int pvMax, int pointDeVie, Attaques attaque1, Attaques attaque2, Attaques attaque3, Attaques attaque4, String message) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.attaque1 = attaque1;
		this.attaque1 = attaque2;
		this.attaque1 = attaque3;
		this.attaque1 = attaque4;
		this.message = message;
		this.pvMax = pvMax;
		nbrPokemon++;
	}
	
	
	public  Attaques getAttaque1() {
		return attaque1;
	}


	public void setAttaque1(Attaques attaque1) {
		this.attaque1 = attaque1;
	}


	public Attaques getAttaque2() {
		return attaque2;
	}


	public void setAttaque2(Attaques attaque2) {
		this.attaque2 = attaque2;
	}


	public Attaques getAttaque3() {
		return attaque3;
	}


	public void setAttaque3(Attaques attaque3) {
		this.attaque3 = attaque3;
	}


	public Attaques getAttaque4() {
		return attaque4;
	}


	public void setAttaque4(Attaques attaque4) {
		this.attaque4 = attaque4;
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
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	public int getPvMax() {
		return pvMax;
	}


	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}


	
	
}
