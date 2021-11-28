public class Monster extends Character {

    protected String monsType;
    protected String monstAbout;

    public Monster() {
        health = 175;
        strength = 40 + (int)( Math.random() * 45 ); // [40,85)
        defense = 20;
        attackRating = 1;
        storage1 = attackRating;
        storage2 = defense;
    }

    public String typeMonst() {
        return monsType;
    }

    public String about() {
        return monstAbout;
    }
}
