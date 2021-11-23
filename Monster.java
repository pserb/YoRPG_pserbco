public class Monster extends Character {

    public Monster() {
        health = 150;
        strength = 20 + (int)( Math.random() * 45 ); // [20,65)
        defense = 20;
        attackRating = 1;
    }
}
