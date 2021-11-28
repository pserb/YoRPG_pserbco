public class SmallDragon extends Monster {
  public SmallDragon() {
    health = 200;
    strength = (int) ((Math.random()*40)+60); //[60,100)
    defense = 20;
    attackRating = 1;
    monsType = "Small Dragon";
    monstAbout = "Dragons are the strongest enemies in the game. They have higher health and strength than others. However, small dragons may suffer from a soft underbelly, making them somewhat prone to attacks.";
  }
}
