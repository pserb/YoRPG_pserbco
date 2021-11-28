public class Witch extends Monster {
  public Witch() {
    health = 175;
    strength = (int) ((Math.random()*40)+50); //[50,90)
    defense = 30;
    attackRating = 1;
    monsType = "Witch";
    monstAbout = "The witch is the most balanced monster in the game. Decent health, strength, and defense make the witch a formidable monster.";
  }
}
