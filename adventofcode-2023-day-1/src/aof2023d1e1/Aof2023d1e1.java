package aof2023d1e1;

public class Aof2023d1e1 {

	public static void main(String[] args) {

		// But : prendre les premiers et derniers chiffres de chaque ligne; les accoler,
		// et sommer toutes les lignes
		// si on a qu'un chiffre, alors il est à la fois le premier et le dernier
		String cheminFichier = "C:\\Users\\PC\\Desktop\\Jeu\\adventofcode\\2023\\1\\fichier.txt";

		Day1 Day1 = new Day1();
		Day1.Enigme(cheminFichier, 1);
		Day1.Enigme(cheminFichier, 2);

	}

}

/*
 * int position = 0; while ((position = stringMain.indexOf(substringToFind,
 * position)) != -1) { System.out.println("Position : " + position); position +=
 * substringToFind.length(); }
 */