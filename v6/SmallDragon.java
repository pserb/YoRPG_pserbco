public class SmallDragon extends Monster {
  public SmallDragon() {
    health = 175;
    strength = 60 + (int)( Math.random() * 40 ); // [60,100)
    defense = 18;
    attackRating = 1;
  }
  public static String about() {
    return "Dragons are the strongest enemies in the game. They have higher health and strength than others. However, small dragons may suffer from a soft underbelly, making them somewhat prone to attacks.";
  }
}
