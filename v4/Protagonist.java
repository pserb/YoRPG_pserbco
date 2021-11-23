public class Protagonist extends Character {

    protected String name;

    
    // CONSTRUCTORS
    public Protagonist() {
        health = 125;
        strength = (int) ((Math.random()*50)+75); // [75,125)
        defense = 40;
        attackRating = 0.4;
    }

    public Protagonist(String newName) {
        this();
        name = newName;
    }

    public void specialize() {
        attackRating = 0.75;
        defense = 20;
    }


    public void normalize() {
        attackRating = .4;
        defense = 40;
    }


    // ACCESSOR
    public String getName() {
        return name;
    }
}
