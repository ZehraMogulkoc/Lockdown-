import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Person p1 = new Person(0, 0, 0);
		
		Scanner input = new Scanner(System.in);
		Policeman police = new Policeman();
		Elderly elder = new Elderly(0, 0, 0);
		Kid mykid = new Kid(0, 0, 0);
		Parent myparent = new Parent(0, 0, 0);
		System.out.println("Choose One option");

		System.out.println("(1) Go out");
		System.out.println("(2) Terminate");
		int enter = input.nextInt();
		while (enter != 2) {
			p1.age = (int) (Math.random() * 100);
			p1.hour = (int) ((Math.random() * 12) + 1);

			police.addPeople(p1);
			int random = (int) (Math.random() * 100);
			
			if (enter == 1) {
				System.out.println("Enter the probability of going out");
				double prob = input.nextDouble();
				System.out.print(p1);
				if (p1.age <= 20) {
					mykid.hour = p1.hour;
					String request = mykid.doesWant(random, prob);

					System.out.println(" And Kid" + request + "go out at " + mykid.hour + " " + p1.t1);
					if (request.equals(" wants to ")) {
						police.fines(p1, mykid, elder, myparent);}

				}
				if (p1.age > 20 && p1.age < 65) {
					myparent.hour = p1.hour;
					String request = myparent.doesWant(random, prob);

					System.out.println(" And Parent" + request + "go out at " + myparent.hour + " " + p1.t1);
					if (request.equals(" wants to ")) {
						police.fines(p1, mykid, elder, myparent);}

				}
				if (p1.age >= 65) {
					elder.hour = p1.hour;
					String request = elder.doesWant(random, prob);

					System.out.println(" And elderly" + request + "go out at " + elder.hour + " " +p1.t1);
					if (request.equals(" wants to ")) {
						police.fines(p1, mykid, elder, myparent);}

				}
			}
			System.out.println("(1) Go out");
			System.out.println("(2) Terminate");
			enter = input.nextInt();
		}
		if (enter == 2) {
			System.out.println("The treasury cash: " + police.sum + " Turkish Lira");
		}

	}
}
