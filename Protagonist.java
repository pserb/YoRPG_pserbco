public class Protagonist extends Character {

    protected String name;


    //CONSTRUCTORS
    public Protagonist() {
        health = 125;
    }

    public Protagonist(String newName) {
        this();
        name = newName;
    }

    public void specialize() {
        attackRating = 1.6*attackRating;
        defense = defense - 15;
        storage1 = 0.625*attackRating;
        storage2 = defense + 15;
    }


    public void normalize() {
        storage1 = attackRating;
        storage2 = defense;
    }


    // ACCESSOR
    public String getName() {
        return name;
    }
}
