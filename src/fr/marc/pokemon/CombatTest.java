package fr.marc.pokemon;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class CombatTest {
	private static Attaques attaqueG1 = Attaques.getAttaque(Attaques.ATTAQUE_GAYLORD, 0);
	private static Attaques attaqueG2 = Attaques.getAttaque(Attaques.ATTAQUE_GAYLORD, 1);
	private static Attaques attaqueG3 = Attaques.getAttaque(Attaques.ATTAQUE_GAYLORD, 2);
	private static Attaques attaqueG4 = Attaques.getAttaque(Attaques.ATTAQUE_GAYLORD, 4);
	private static Attaques attaqueA1 = Attaques.getAttaque(Attaques.ATTAQUE_ADRIEN, 0);
	private static Attaques attaqueA2 = Attaques.getAttaque(Attaques.ATTAQUE_ADRIEN, 1);
	private static Attaques attaqueA3 = Attaques.getAttaque(Attaques.ATTAQUE_ADRIEN, 2);
	private static Attaques attaqueA4 = Attaques.getAttaque(Attaques.ATTAQUE_ADRIEN, 4);
	private static Attaques attaqueM1 = Attaques.getAttaque(Attaques.ATTAQUE_ADIL, 0);
	private static Attaques attaqueM2 = Attaques.getAttaque(Attaques.ATTAQUE_ADIL, 1);
	private static Attaques attaqueM3 = Attaques.getAttaque(Attaques.ATTAQUE_ADIL, 2);
	private static Attaques attaqueM4 = Attaques.getAttaque(Attaques.ATTAQUE_ADIL, 4);
	
	
	
	public static void main(String[] args) {
	/*tring dresseur1 = JOptionPane.showInputDialog("Dresseur1 quel est ton nom");
		JOptionPane.showMessageDialog(null, "Bienvenue dresseur : " + dresseur1 + " bon chance !");
		String dresseur2 = JOptionPane.showInputDialog("Dresseur2 quel est ton nom");
		JOptionPane.showMessageDialog(null, "Bienvenue dresseur : " + dresseur2 + " bon chance !");
	*/	
		Pokemon pokemon1 = new Pokemon("Gaylord", 200, 200, attaqueG1, attaqueG2, attaqueG3, attaqueG4, "J..Jee..m'a m'a m'a... Gayyy,Gayyylooordddzzzz !! Dresseur : 15 que je le dresse comme un pokemon et il hésite encore.. De toute façon avec son faible niveau de point de vie il est destiné à mourir rapidement");
		Pokemon pokemon2 = new Pokemon("Adrien ", 250, 250, attaqueA1, attaqueA2, attaqueA3, attaqueA4, "Beh beh beh Bebbbbeerrrrt!!");
		Pokemon pokemon3 = new Pokemon("Adil", 350, 350, attaqueM1, attaqueM2, attaqueM3, attaqueM4, "Hou hou hou HOUUUU DONKEY KOOOONNN.. Dresseur :  Ho my god que vais je faire de lui..");
		System.out.println(Pokemon.nbrPokemon + " Pokemons ont été généré");
		Dresseurs.simulationCombat(pokemon2, pokemon3);
		
		
		
		
		
	}
}

 /*
  
Dresseurs.simulationCombat(pokemon2, pokemon3);
Dresseurs.envoyerAuCombat(pokemon1);
Dresseurs.envoyerAuCombat(pokemon2);
Dresseurs.envoyerAuCombat(pokemon3);
Dresseurs.soin(pokemon1);
Dresseurs.attaque1(pokemon1, pokemon2);
*/