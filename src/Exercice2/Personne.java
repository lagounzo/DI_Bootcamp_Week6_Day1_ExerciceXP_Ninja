/**
 * @author N'ZO LAGOU
 * 
 *  Exercice 2 : Type De Données Intermédiaire
Instructions
Créez un programme qui déclare plusieurs variables de différents types de données, y compris au moins une variable de chacun des types suivants : int, double, char et boolean.

Attribuez des valeurs à chacune des variables.

Imprimez la valeur de chaque variable sur la console en utilisant la méthode appropriée (par exemple System.out.println()pour imprimer des nombres, et System.out.print()pour imprimer des caractères et des booléens).

Modifiez les valeurs des variables et imprimez les nouvelles valeurs sur la console.

Utilisez au moins une opération de conversion de type dans le programme, telle que la conversion d'un double en int.

Utilisez au moins une opération mathématique, comme l'addition ou la multiplication, avec les variables.

Utilisez au moins un opérateur de comparaison, tel que > ou ==, pour comparer les valeurs de deux variables ou plus.

Utilisez au moins une instruction de flux de contrôle, telle qu'une instruction if-else ou une instruction switch, pour prendre une décision basée sur les valeurs des variables.

Ajoutez des commentaires à votre code pour expliquer ce qu'il fait à chaque étape.

Testez votre programme avec différentes entrées et déboguez les erreurs que vous rencontrez
 */

package Exercice2;

public class Personne {

	public static void main(String[] args) {

		// Declaration des variable

		String nom = "N'GUESSAN";
		int phone = 0101010101;
		double poids = 50.5;
		char sexe = 'M';
		boolean etat = true;

		// Affichage de tous les variables

		System.out.println("nom : " + nom);
		System.out.println("phone : " + phone);
		System.out.println("poids : " + poids);
		System.out.println("sexe : " + sexe);
		System.out.println("etat : " + etat);

		// Modification des valeurs des variables
		nom = "ASSAMOI";
		phone = 02020202;
		poids = 60.5;
		sexe = 'F';
		etat = false;

		// Affichage des valeur modifier
		System.out.println("nom : " + nom);
		System.out.println("phone : " + phone);
		System.out.println("poids : " + poids);
		System.out.println("sexe : " + sexe);
		System.out.println("etat : " + etat);

		// Convertion d'un double en int
		int phone_1 = (int) poids;

		System.out.println("convertion : " + phone_1);

		// Somme de deux variable
		double somme = phone + poids;

		// Affichage du resultat
		System.out.println("somme : " + somme);

		// La condition qui verifie si somme des deux variable est superieur a
		// 1000.execute l'instruction

		if (somme > 1000) {

			System.out.println("somme : " + somme + " est superieur a 1000");
		}
	}
}
