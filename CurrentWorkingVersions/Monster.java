public class Monster extends Character {

    public Monster() {
        health = 150;
        strength = 40 + (int)( Math.random() * 45 ); // [40,85)
        defense = 20;
        attackRating = 1;
    }
}
