package aof2023d1e1;

public class Calcul {
	protected String ligne;
	protected StringBuilder ligneBuilder;

	public Calcul() {
		// TODO Auto-generated constructor stub
	}

	public int ChiffreCache1(final String ligne) {
		this.ligne = ligne;
		int chiffre1 = 999;
		int chiffre2 = 999;
		int chiffre3 = 0;
//		récupération du premier et dernier chiffre
		for (int i = 0; i < ligne.length(); i++) {
			String caractere = String.valueOf(ligne.charAt(i));
			if (caractere.matches("\\d")) {
				if (chiffre1 == 999) {
					chiffre1 = Integer.parseInt(caractere);
				} else {
					chiffre2 = Integer.parseInt(caractere);
				}
			}

		}

// 		calcul du nombre de la ligne		
		if (chiffre1 != 999) {
			chiffre3 = chiffre1 * 10;
			if (chiffre2 != 999) {
				chiffre3 = chiffre3 + chiffre2;
			} else {
				chiffre3 = chiffre3 + chiffre1;
			}
			return chiffre3;
		} else {
			return 0;
		}
	}

	public int ChiffreCache2(final String ligne) {
		this.ligne = ligne;
		int chiffre1 = 999;
		int chiffre2 = 999;
		int chiffre3 = 0;
		StringBuilder ligneBuilder = new StringBuilder(ligne);

//		récupération du premier et dernier chiffre
		for (int i = 0; i < ligne.length(); i++) {
			String caractere = String.valueOf(ligne.charAt(i));
			if (caractere.matches("\\d")) {
				if (chiffre1 == 999) {
					chiffre1 = Integer.parseInt(caractere);
				} else {
					chiffre2 = Integer.parseInt(caractere);
				}
			}

		}

// 		calcul du nombre de la ligne		
		if (chiffre1 != 999) {
			chiffre3 = chiffre1 * 10;
			if (chiffre2 != 999) {
				chiffre3 = chiffre3 + chiffre2;
			} else {
				chiffre3 = chiffre3 + chiffre1;
			}
			return chiffre3;
		} else {
			return 0;
		}
	}

	protected void lettreCachee(String ligne) {
		this.ligne = ligne;
		String[] chiffreLettres = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		// variable pour trouver le plus petit
		int w_i = 999;
		String chiffrePetit;
		// variable pour trouver le plus grand
		int w_j = -1;
		String chiffreGrand;

		for (String chiffreLettre : chiffreLettres) {
			if (ligne.indexOf(chiffreLettre) < w_i) {
				w_i = ligne.indexOf(chiffreLettre);
				chiffrePetit = chiffreLettre;
			}
		}

		for (String chiffreLettre : chiffreLettres) {
			if (ligne.lastIndexOf(chiffreLettre) > w_j) {
				w_j = ligne.lastIndexOf(chiffreLettre);
				chiffrePetit = chiffreLettre;
			}
		}

		if (w_i != 999) {
			;
		}

	}

}
