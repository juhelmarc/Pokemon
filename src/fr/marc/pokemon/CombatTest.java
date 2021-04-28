package fr.marc.pokemon;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class CombatTest {
	
	
	
	public static void main(String[] args) {
		String dresseur1 = JOptionPane.showInputDialog("Dresseur1 quel est ton nom");
		JOptionPane.showMessageDialog(null, "Bienvenue dresseur : " + dresseur1 + " bon chance !");
		String dresseur2 = JOptionPane.showInputDialog("Dresseur2 quel est ton nom");
		JOptionPane.showMessageDialog(null, "Bienvenue dresseur : " + dresseur2 + " bon chance !");
		
		Pokemon pokemon1 = new Pokemon("Gaylord", 200, "AA", 5, "BB", 8, "CC", 10, "DD", 15, "J..Jee..m'a m'a m'a... Gayyy,Gayyylooordddzzzz !!");
		Pokemon pokemon2 = new Pokemon("Adrien ", 250, "A1", 4, "A2", 7, "A3", 8, "A4", 13, "Beh beh beh Bebbbbeerrrrt!!");
		Pokemon pokemon3 = new Pokemon("Adil", 350, "A1", 3, "A2", 6, "A3", 6, "A4", 12, "MouMouuu... MOUUUUUUHAAAABBBBZZZZZZZZ !!!!!!!!!!!");
		
		public static ArrayList<Attaques> listeAttaqueGaylord = new ArrayList<Attaques>(
		Attaques giflette =	new Attaques("Giflette", 5),
		Attaques coupDeTete = new Attaques("Coup de tête", 10),					
					);
		
		Dresseurs.envoyerAuCombat(pokemon1);
		Dresseurs.envoyerAuCombat(pokemon2);
		Dresseurs.envoyerAuCombat(pokemon3);
		Dresseurs.soin(pokemon1);
		Dresseurs.attaque1(pokemon1, pokemon2);
		
	}
}
