
import com.iia.shop.entity.Car;

public class Store {
	static java.io.Console console = System.console();

	public static void main(String args[]) {
		Car car0 = new Car(2, "red", "megan", 2500.99, "renault", 225);
		Car car1 = new Car(5, "blue", "picasso", 8200.99, "citroen", 215);
		Car car2 = new Car(9, "red", "megane", 3500.99, "renault", 200);

		Car tab[] = new Car[100];
		tab[0] = car0;
		tab[1] = car1;
		tab[2] = car2;

		System.out.println("1-Creer un vehicule");
		System.out.println("2-Afficher la liste des vehicules");
		System.out.println("3-Modifier un vehicule");
		System.out.println("4-Supprimer un vehicule");
		int choice = Integer.parseInt(console.readLine("Entrer un chiffre du menu : "));

		switch (choice) {
		case 1:

			int annee = Integer.parseInt(console.readLine("Entrer lage de la voiture : "));
			String modele = console.readLine("Le modele de la voiture : ");
			String couleur = console.readLine("La couleur de la voiture : ");
			Double prix = Double.parseDouble(console.readLine("Entrer lage de la voiture : "));
			String marque = console.readLine("Entrer la marque de la voiture : ");
			int vitesse = Integer.parseInt(console.readLine("Entrer la vitesse actuelle de la voiture : "));

			Car car3 = new Car(annee, modele, couleur, prix, marque, vitesse);

			break;
		case 2: {

		}
			System.out.println(tab);
			break;
		case 3:
			
			int modifier = Integer.parseInt(console.readLine("Quel véhicule voulez-vous modifier? Indiquer son numéro "));
			annee = Integer.parseInt(console.readLine("Entrer lage de la voiture : "));
			modele = console.readLine("Le modele de la voiture : ");
			couleur = console.readLine("La couleur de la voiture : ");
			prix = Double.parseDouble(console.readLine("Entrer lage de la voiture : "));
			marque = console.readLine("Entrer la marque de la voiture : ");
			vitesse = Integer.parseInt(console.readLine("Entrer la vitesse actuelle de la voiture : "));
			
			 Car car4 = new Car  (annee, "couleur", "modele", prix, "marque", vitesse);
			break;

		case 4:
			int Suppression = Integer
					.parseInt(console.readLine("Quel véhicule voulez-vous supprimer? Indiquer son numéro "));
			tab[Suppression] = null;

			break;
		default:
			System.out.println("Aucun choix");
			break;
		}
	}
}
