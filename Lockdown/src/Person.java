
public class Person implements Lockdown {
	public int hour;
	public boolean a;

	@Override
	public void showFreeHours() {
	}
	

	protected double probability;
	protected int age;
	public String[] time = { "am.", "pm." };
	String t1 = time[(int) Math.round(Math.random())];

	public Person(int age, double probability, int h) {
		this.age = age;
		this.probability = probability;
			this.hour=h;
		
	}
	
	public String toString() {
		return "The Person’s age is " + getAge() + ".";
	}

	public int getHour() {
		return this.hour;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public double getProbability() {
		return this.probability;
	}

	public void getProbability(double p) {
		this.probability = p;
	}

	public String doesWant(int t, double e) {
		if (e <= t) {
			return " wants to ";
		} else {
			return " does not want to ";
		}
	}

}
