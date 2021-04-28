package fr.marc.pokemon;

import javax.swing.JOptionPane;
import static fr.marc.pokemon.Pokemon.randomAttaques;

public class Dresseurs {

	public static void envoyerAuCombat(Pokemon pokemon) {

		System.out.println("le dresseur à envoyer le pokemon : " + pokemon.getNom() + " au combat !! Il débute avec : "
				+ pokemon.getPointDeVie() + " point de vie.");
		JOptionPane.showMessageDialog(null, pokemon.getMessage());
	}

	public static void soin(Pokemon pokemonSoin) {

		pokemonSoin.setPointDeVie(pokemonSoin.getPointDeVie() + 50);
		System.out.println("Le dresseur a soigner le pokemon : " + pokemonSoin.getNom()
				+ " ses points de vie sont maintenant de : " + pokemonSoin.getPointDeVie());

	}

	public static void simulationCombat(Pokemon pokemonA, Pokemon pokemonB) {
		pokemonA.setPointDeVie(pokemonA.getPvMax());
		pokemonB.setPointDeVie(pokemonB.getPvMax());
		Pokemon pokemonMort = new Pokemon();
		boolean combatTerminé = false;

		while (combatTerminé == false) {

			double esquive = Math.random() * 100;

			System.out.println(pokemonA.getNom() + " attaque : " + pokemonB.getNom() + " il utilise l'attaque : "
					+ randomAttaques(pokemonA).getNomAttaque());

			if (esquive > 90) {
				System.out.println("L'attaque à été esquivé par : " + pokemonB.getNom());
			} else {
				pokemonB.setPointDeVie(pokemonB.getPointDeVie() - randomAttaques(pokemonA).getDmgAttaque());
				System.out.println(
						"L'attaque de : " + randomAttaques(pokemonA).getDmgAttaque() + " dégats est un succès, ");
				System.out.println("Aie Aie " + pokemonB.getNom() + " n'a pas esquivé l'attaque et à désormais : "
						+ pokemonB.getPointDeVie() + " de point de vie");
			}
			if (pokemonB.getPointDeVie() <= 0) {
				pokemonMort = pokemonB;
				combatTerminé = true;
				break;
			}
			double esquive2 = Math.random() * 100;

			if (esquive2 > 90) {
				System.out.println("L'attaque à été esquivé par : " + pokemonA.getNom());
			} else {
				pokemonA.setPointDeVie(pokemonA.getPointDeVie() - randomAttaques(pokemonB).getDmgAttaque());
				System.out.println(
						"L'attaque de : " + randomAttaques(pokemonB).getDmgAttaque() + " dégats est un succès, ");
				System.out.println("Aie Aie " + pokemonA.getNom() + " n'a pas esquivé l'attaque et à désormais : "
						+ pokemonA.getPointDeVie() + " de point de vie");
			}
			if (pokemonA.getPointDeVie() <= 0) {
				pokemonMort = pokemonA;
				combatTerminé = true;
				break;
			}
		}

		System.out.println("Le pokemon " + pokemonMort.getNom() + " a perdu");

	}

}
