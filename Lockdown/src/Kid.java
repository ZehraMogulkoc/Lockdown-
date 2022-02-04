
public class Kid extends Person {

	public Kid(int age, double probability, int h) {
		super(age, probability, h);
	}

	@Override
	public void showFreeHours() {
		if (getHour() >= 2 && t1.equals("pm") || getHour() <= 6 && t1.equals("pm")) {
			a = false;
		} else {
			a = true;
		}
	}

}
