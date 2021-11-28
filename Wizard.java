public class Wizard extends Protagonist {

	public Wizard() {
		health = 100;
		defense = 15;
		strength = (int) ((Math.random()*100)+100); // [100,200)
		attackRating = 0.4;
	}
	public Wizard(String newName) {
		this();
		name = newName;
	}
	public static String about() {
		return "the Wizard has the lowest defense stats, but has the strongest attacks of the three heroes.";
	}
}
