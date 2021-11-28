public class Knight extends Protagonist {

	public Knight() {
		health = 150;
		defense = 50;
		strength = (int) ((Math.random()*50)+75); // [75,125)
		attackRating = 0.35;
	}
	public Knight(String newName) {
		this();
		health = 150;
		defense = 50;
		strength = (int) ((Math.random()*50)+75); // [75,125)
		attackRating = 0.35;
		name = newName;
		System.out.println("ATTK RATING in knigth:" + attackRating);
	}

	public static String about() {
		return "the knight has the highest defense rating and average base attack stats.";
	}
}
