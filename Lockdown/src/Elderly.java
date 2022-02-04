
public class Elderly extends Person {

	public Elderly(int age, double probability, int h) {
		super(age, probability, h);
	}

	@Override
	public void showFreeHours() {
		if (getHour() == 12 && t1.equals("am")) {
			a = true;
		} else if (getHour() == 12 && t1.equals("pm")) {
			a = false;
		} else if (getHour() >= 10 && t1.equals("am") || getHour() <= 2 && t1.equals("pm")) {
			a = false;
		} else {
			a = true;
		}

	}
}
