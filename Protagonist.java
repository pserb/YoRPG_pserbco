public class Protagonist extends Character {

    String name;

    
    // CONSTRUCTORS
    public Protagonist() {
        health = 125;
        strength = 100;
        defense = 40;
        attackRating = 0.4;

        //Only in protag class
        boolean doubleDmg = false;
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

    public String getName() {
        return name;
    }
}
