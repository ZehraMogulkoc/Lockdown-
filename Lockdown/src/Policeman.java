import java.util.ArrayList;
import java.util.*;

public class Policeman {
	ArrayList<Person> myPerson;
	int sum = 0;

	public Policeman() {
		myPerson = new ArrayList<Person>();
	}

	public void addPeople(Person p) {
		myPerson.add(p);
	}

	public void fines(Person p, Kid k, Elderly e, Parent per) {

		if (p.age <= 20) {
			k.showFreeHours();
			if (k.a) {
				sum += 1000;
			}
		}
		if (p.age >= 65) {
			e.showFreeHours();
			if (e.a) {
				sum += 3000;
			}
		}
		if (p.age > 20 && p.age < 65) {
			per.showFreeHours();
			if (per.a) {
				sum += 2000;
			}
		}
	}
}
