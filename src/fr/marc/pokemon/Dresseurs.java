package fr.marc.pokemon;
import javax.swing.JOptionPane;
public class Dresseurs {
	
	public static void envoyerAuCombat(Pokemon pokemon) {
		
		System.out.println("le dresseur à envoyer le pokemon : " + pokemon.getNom() + " au combat !! Il débute avec : " + pokemon.getPointDeVie() + " point de vie.");
		JOptionPane.showMessageDialog(null, pokemon.getMessage());
	}
	public static void soin(Pokemon pokemonSoin) {
			
		pokemonSoin.setPointDeVie(pokemonSoin.getPointDeVie() + 50);
		System.out.println("Le dresseur a soigner le pokemon : " + pokemonSoin.getNom() + " ses points de vie sont maintenant de : " + pokemonSoin.getPointDeVie());
		
	}
	public static void attaque1(Pokemon pokemonA, Pokemon pokemonD) {
		System.out.println(pokemonA.getNom()+ " attaque : " + pokemonD.getNom() + " il utilise l'attaque : " + pokemonA.getAttaque1());
		double esquive = Math.random() * 100;
		if (esquive > 90) {
			System.out.println("L'attaque à été esquivé par : " + pokemonD.getNom());
		} else {
			pokemonD.setPointDeVie(pokemonD.getPointDeVie() - pokemonA.getDmgAttaque1());
			System.out.println("L'attaque de : " + pokemonA.getDmgAttaque1() + " dégats est un succès, ");
			System.out.println("Aie Aie " + pokemonD.getNom() + " n'a pas esquivé l'attaque et à désormais : " + pokemonD.getPointDeVie() + " de point de vie");
		}
		
	}		
}
