public class Jester extends Protagonist {
  public Jester() {
    health = 80;
    defense = 30;
    strength = (int) ((Math.random()*50)+60);
    attackRating = 0.61;
  }
  public static String about() {
    return "The Jester protagonist role has relatively average health and defense, but lower base strength than the other heroes. The jester makes up for this with its high attack rating, making it the best choice for specialized attacks.";
    // please someone fix that so it's not all on one line.
}
