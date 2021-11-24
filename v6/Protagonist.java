public class Protagonist extends Character {

    protected String name;


    // CONSTRUCTORS
    public Protagonist() {
        health = 100;
    }

    public Protagonist(String newName) {
        this();
        name = newName;
    }

    public void specialize() {
        System.out.println("SPECAIL ATTK RATING:" + attackRating);
        attackRating = 1.6*attackRating;
        defense = defense - 15;
        storage1 = 0.625*attackRating;
        storage2 = defense + 15;
    }


    public void normalize() {
        System.out.println("NORML ATTK RATING:" + attackRating);
        storage1 = attackRating;
        storage2 = defense;
    }


    // ACCESSOR
    public String getName() {
        return name;
    }
}
