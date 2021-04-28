package fr.marc.pokemon;
import javax.swing.JOptionPane;
public class Dresseurs {
	
	private static Attaques attaque;
	 
	public static void envoyerAuCombat(Pokemon pokemon) {
		
		System.out.println("le dresseur à envoyer le pokemon : " + pokemon.getNom() + " au combat !! Il débute avec : " + pokemon.getPointDeVie() + " point de vie.");
		JOptionPane.showMessageDialog(null, pokemon.getMessage());
	}
	
	public static void soin(Pokemon pokemonSoin) {
			
		pokemonSoin.setPointDeVie(pokemonSoin.getPointDeVie() + 50);
		System.out.println("Le dresseur a soigner le pokemon : " + pokemonSoin.getNom() + " ses points de vie sont maintenant de : " + pokemonSoin.getPointDeVie());
		
	}	
	
	public static void randomAttaques(Pokemon pokemon) {
		
		double random = 1;
		
		if (random <= 30) {
			attaque = pokemon.getAttaque1();
			
		} 
		if (random > 30 && random <= 60){
			 attaque = pokemon.getAttaque2();
			
		} 
		if (random > 60 && random <= 90) {
			 attaque = pokemon.getAttaque3();
			
		} 
		if (random > 90) {
			 attaque = pokemon.getAttaque4();
			
		}
		
		
	}
	public static Attaques getRandomAttaques() {
		return attaque;
	}
	public static void simulationCombat(Pokemon pokemonA, Pokemon pokemonB) {
		pokemonA.setPointDeVie(pokemonA.getPvMax());
		pokemonB.setPointDeVie(pokemonB.getPvMax());
	
		while (pokemonA.getPointDeVie() > 0 && pokemonB.getPointDeVie() > 0) {
			
		
			double esquive = Math.random() * 100;
			randomAttaques(pokemonA);
			System.out.println(pokemonA.getNom()+ " attaque : " + pokemonB.getNom() + " il utilise l'attaque : " + getRandomAttaques().getNomAttaque());
			
			if (esquive > 90) {
				System.out.println("L'attaque à été esquivé par : " + pokemonB.getNom());
			} else {
				pokemonB.setPointDeVie(pokemonB.getPointDeVie() - getRandomAttaques().getDmgAttaque());
				System.out.println("L'attaque de : " + getRandomAttaques().getDmgAttaque() + " dégats est un succès, ");
				System.out.println("Aie Aie " + pokemonB.getNom() + " n'a pas esquivé l'attaque et à désormais : " + pokemonB.getPointDeVie() + " de point de vie");
			}
			double esquive2 = Math.random() * 100;
			randomAttaques(pokemonB);
			
			if (esquive2 > 90) {
				System.out.println("L'attaque à été esquivé par : " + pokemonA.getNom());
			} else {
				pokemonA.setPointDeVie(pokemonA.getPointDeVie() - getRandomAttaques().getDmgAttaque());
				System.out.println("L'attaque de : " + getRandomAttaques().getDmgAttaque() + " dégats est un succès, ");
				System.out.println("Aie Aie " + pokemonA.getNom() + " n'a pas esquivé l'attaque et à désormais : " + pokemonA.getPointDeVie() + " de point de vie");
			}
		}
	}
	
		
}
