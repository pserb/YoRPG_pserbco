public class Wizard extends Protagonist {
	public Wizard() {
		health = 75;
		defense = 30;
		strength = (int) ((Math.random()*50)+90); // [90,140)
		attackRating = 0.5;
	}
}
