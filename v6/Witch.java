public class Witch extends Monster {
  public Witch() {
    health = 120;
    strength = 50 + (int)( Math.random() * 30 ); // [50,80)
    defense = 27;
    attackRating = 1;
  }
  public static String about() {
    return "The witch is the most balanced monster in the game. Decent health, strength, and defense make the witch a formidable monster.";
  }
}
