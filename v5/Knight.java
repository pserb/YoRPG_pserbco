public class Knight extends Protagonist {
	public Knight() {
		health = 90;
		defense = 50;
		strength = (int) ((Math.random()*50)+70); // [70,120)
		attackRating = 0.35;
	}
}
