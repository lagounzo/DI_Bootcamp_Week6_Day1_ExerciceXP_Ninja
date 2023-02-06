/**
 * @author N'ZO LAGOU
 * 
 * Créez un programme qui déclare et initialise des variables de différents types de données :

une variable entière nommée "age" et initialisez-la avec votre âge
une variable double nommée "poids" et initialisez-la avec votre poids
une variable booléenne nommée "isStudent" et initialisez-la avec vrai ou faux selon que vous êtes actuellement étudiant ou non
une variable char nommée "gender" et l'initialiser avec 'M' ou 'F' selon votre sexe
une variable String nommée "name" et initialisez-la avec votre nom
Créez une méthode appelée " displayInfo" qui ne prend aucun argument et imprime les valeurs de toutes les variables au format suivant : " Name: <name>, Age: <age>, Gender: <gender>, Weight: <weight>, IsStudent: <isStudent>"

Dans la méthode principale, appelez la displayInfométhode " " pour afficher les valeurs des variables.
 * 
 * 
 */



package Exercice1;

public class Student {

	 private int age = 30 ;
	    private double poids = 56.5 ;
	    private boolean isStudent = true ;
	    private char gender = 'M' ;
	    private String name = "N'ZO ";


	    public String displayInfo() {
	        return "{" +
	            " age='" + age + "'" +
	            ", poids='" + poids + "'" +
	            ", isStudent='" + isStudent+ "'" +
	            ", gender='" + gender + "'" +
	            ", name='" + name + "'" +
	            "}";
	    }

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		System.out.println("The information Student is"+student.displayInfo());

	}

}
