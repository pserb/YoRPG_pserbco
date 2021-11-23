

public class Character {

	int health;
	int strength;
	int defense;
	double attackRating;

	// ACCESSORS
	public boolean isAlive() {
		return (health > 0);
	}

	public int getDefense() {
		return defense;
	}


	// SHARED ATTACK METHODS
	public void lowerHP(int damage) {
		health = health - damage;
	}

	public int attack(Character c) {
		int damage = (int) ((strength*attackRating) - c.defense);

		if ( damage < 0) {
			damage = 0;
		}

		c.lowerHP(damage);
		return damage;
	}
}