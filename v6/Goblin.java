public class Goblin extends Monster {
  public Goblin() {
    health = 75;
    strength = 40 + (int)( Math.random() * 45 ); // [40,85)
    defense = 15;
    attackRating = 1;
  }
  public static String about() {
    return "Goblins are the weakest monsters in the game. While their attacks can be strong at times, they have very low defense, and often pose only minor challenges to our heroes.";
  }
}
