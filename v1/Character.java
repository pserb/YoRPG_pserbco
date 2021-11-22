public class Character {
  int health;
  int strength;
  int defense;
  double attackRating;

  public boolean isAlive() {
    return true;
  }

  public int getDefense() {
    return defense;
  }

  public void lowerHP(int damage) {
    health -= damage;
  }

  public void attack(Character c) {
    int damage = (int)((strength * attackRating) - c.defense);
  }
}
