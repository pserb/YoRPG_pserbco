public class Protagonist extends Character {

    protected String name;


    // CONSTRUCTORS
    public Protagonist() { // since the normal attributes are not the same for each protagonist, we don't need anything here.
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
