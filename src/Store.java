

import com.iia.shop.entity.Car;

public class Store {

	public static void main (String args[]){
	Car car0 = new Car(2, "red", "megan", 2500.99, "renault", 225);
	Car car1 = new Car(5, "blue", "picasso", 8200.99, "citroen", 215);
	Car car2 = new Car(9, "red", "megane", 3500.99, "renault", 200);

	Car tab [] = new Car[100];
	tab[0]= car0;
	tab[1]= car1;
	tab[2]= car2;
	

	}
}
