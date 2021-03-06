public class Jester extends Protagonist {
  public Jester() {
    health = 80;
    // defense = 30;
    defense = 0;
    strength = (int) ((Math.random()*50)+60);
    attackRating = 0.61;
  }
  public Jester(String newName) {
    this();
		name = newName;
	}
  public static String about() {
    return "The Jester protagonist role has relatively average health and defense, but lower base strength than the other heroes. The jester makes up for this with its high attack rating, making it the best choice for specialized attacks.";
  }
}
