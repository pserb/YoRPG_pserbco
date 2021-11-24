public class Wizard extends Protagonist {
	public Wizard() {
		health = 75;
		defense = 30;
		strength = (int) ((Math.random()*50)+90); // [90,140)
		attackRating = 0.5;
	}
	public Wizard(String newName) {
		this();
		name = newName;
	}
	public static String about() {
		return "the Wizard has the lowest defense stats, but has the strongest attacks of the three heroes.";
	}
}
