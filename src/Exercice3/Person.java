/**
 * @author N'ZO LAGOU
 * 
 *  Exercice 3 : Constructeurs De Niveau Intermédiaire
Instructions
Créez une classe appelée "Person" qui contient les champs suivants : name (String), age (int) et gender (char).

Créez un constructeur par défaut qui initialise le nom à "Inconnu", l'âge à 0 et le sexe à "U".

Créez un deuxième constructeur qui prend en compte trois paramètres : nom, âge et sexe. Ce constructeur doit initialiser les champs de la classe Person avec les valeurs passées en paramètres.

Créez un troisième constructeur qui accepte deux paramètres : name et age. Ce constructeur doit initialiser les champs name et age avec les valeurs transmises en tant que paramètres, et doit définir le champ gender sur 'U'.

Créez une méthode appelée "displayInfo" qui affiche le nom, l'âge et le sexe de la personne.

Dans la méthode main, créez trois objets Person à l'aide des trois constructeurs que vous avez créés.

Appelez la méthode displayInfo pour chacun des trois objets Person afin d'afficher leurs informations.
 * 
 */

package Exercice3;

public class Person {

	private String name;
    private int age;
    private char gender;

    public Person() {

        this.name = "inconnu";
        this.age = 0;
        this.gender = 'U';

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }

    public String displayInfo() {
        return "{" +
                " name='" + name + "'" +
                ", age='" + age + "'" +
                ", gender='" + gender + "'" +
                "}";
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("GNAMIEN", 30, 'M');
        Person person3 = new Person("N'DRI CLAVER", 29);

        System.out.println("Information de la personne 1 : " + person1.displayInfo());
        System.out.println("Information de la personne 2 : " + person2.displayInfo());
        System.out.println("Information de la personne 3 : " + person3.displayInfo());

    }
}
