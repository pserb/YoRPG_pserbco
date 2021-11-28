public class Jester extends Protagonist {
  
  public Jester() {
    health = 125;
    defense = 30;
    strength = (int) ((Math.random()*50)+75); //[75,125)
    attackRating = 0.7;
  }
  public Jester(String newName) {
    this();
		name = newName;
	}
  public static String about() {
    return "The Jester protagonist role has relatively average health and defense, but lower base strength than the other heroes. The jester makes up for this with its high attack rating, making it the best choice for specialized attacks.";
  }
}
