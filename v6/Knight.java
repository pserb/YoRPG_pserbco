public class Knight extends Protagonist {
	public Knight() {
		health = 90;
		// defense = 50;
		defense = 0;
		strength = (int) ((Math.random()*50)+70); // [90,140)
		attackRating = 0.35;
	}
	public Knight(String newName) {
		this();
		name = newName;
	}
	public static String about() {
		return "the knight has the highest defense rating and average base attack stats.";
	}
}
