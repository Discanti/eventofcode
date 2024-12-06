package aof2023d1e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
	protected String cheminFichier;
	protected int numEnigme;

	public Day1() {

	}

	public void Enigme(String cheminFichier, int numEnigme) {
		this.cheminFichier = cheminFichier;
		this.numEnigme = numEnigme;
		int nombreResultat = 0;

		try {
			File fichier = new File(cheminFichier);
			Scanner lecteur = new Scanner(fichier);
			String ligne = "";
			Calcul traitement = new Calcul();

			while (lecteur.hasNextLine()) {
				ligne = lecteur.nextLine();
				if (numEnigme == 1) {
					nombreResultat = nombreResultat + traitement.ChiffreCache1(ligne);
				} else {
					// nombreResultat = nombreResultat + traitement.ChiffreCache(ligne);
				}

			}
			System.out.println("le code est :" + nombreResultat);
			lecteur.close();

		} catch (FileNotFoundException e) {

		}

	}

}
