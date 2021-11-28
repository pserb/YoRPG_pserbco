public class Goblin extends Monster {
  public Goblin() {
    health = 150;
    strength = (int) ((Math.random()*115)+35); //[35,150)
    defense = 20;
    attackRating = 1;
    monsType = "Goblin";
    monstAbout = "Goblins are the weakest monsters in the game. While their attacks can be strong at times, they have very low defense, and often pose only minor challenges to our heroes.";
  }
}
