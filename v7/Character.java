

public class Character {

	protected int health;
	protected int strength;
	protected int defense;
	protected double attackRating;
	protected double storage1;
	protected int storage2; // I need these 2 variables in order to make a generalized specialize method.

	// ACCESSORS
	public boolean isAlive() {
		return (health > 0);
	}


	// SHARED ATTACK METHODS
	public void lowerHP(int damage) {
		health = health - damage;
	}

	public int attack(Character c) {

		// I had to use a workaround like this because cannot rerun subclass constructors from
		// the superclass. Need to fix, but don't know how.
		if (c.attackRating == 1) {
			c.strength = 40 + (int)( Math.random() * 45 ); // [40,85)
		}
		else {
			c.strength = (int) ((Math.random()*50)+75); // [75,125)
		}

		int damage = (int) ((strength*attackRating) - c.defense);

		if ( damage < 0) {
			damage = 0;
		}

		attackRating = storage1;
		defense = storage2;

		c.lowerHP(damage);

		return damage;
	}
}
