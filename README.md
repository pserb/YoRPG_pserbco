# YoRPG_pserbco

### TNPG - Pserb &amp; Co
Paul Serbanescu, Joseph Othman, Andrew Piatetsky

## Explanation of classes
  **Driver class**
  * We did not change the core functionality of the the driver class (except for adding some artwork and adding a regen system)
  * However we did add in the mods that were required:
    * Our first mod was choosing a character type (in our case either a Wizard, Knight or Jester)
      * We did this by assigning pat (our protagonist object) to a protagonist subclass (one of the above)
    * Our second mod was randomly assigning a monster subclass to smaug (our monster object)
      * Either it became a Goblin, a Witch or a Dragon
    
   **Character class**
   ( *The super super class* )
   
   * This class is the class with the most happening.
   * The character class defines almost all of the necessary attributes and it has all of the methods shared by its' subclasses such as:
     * ```isAlive()```, ```lowerHP()```, and ```attack()```

   **Monster class**
   ( *The not so super class* )
   
   * This class has almost nothing, it only defines a few more attributes necessary and only has two methods (both of which are accessors)
   * The constructor is not even necessary, but we placed it there just for safety 

  **Protagonist class**
  ( *The also not so super class* )
  
  * This class also has very little, but it does have some special methods to allow for full functionality 
  * Like the Monster class it does have an acessor and a constructor, but unlike the monster class it has two special methods: ```specialize()``` and ```normalize()```
    * These methods allow for the special attacks which the player has the choice for in the driver class
   
  **The Subclasses**
  
  * The subclasses are all almost exactly the same. Except for having different stats that change how strong they are, they all are formatted the same and function in the same way
  * Each has a static about method/attribute which stores a little blurb about the different characters/entities

## Evolution
  **v0**
  
  * Original version, only 3 classes
    * ```YoRPG.java``` is almost exactly the same as the current version
    * ```Monster.java``` and ```Protagonist.java``` repeat code, but have very similar functionality to current ```Character``` class

**v1**

* Just added ```Character.java``` to see if it would compile/work. 
* Works exactly like **v0**

**v2**

* Filled ```Character.java``` with the bare minimum to see if it would compile and did not remove repeating code. 
* Compiled and worked exactly the same as **v0** and **v1**

**v3**

* Removed repeating code from ```Protagonist.java``` and ```Monster.java``` and added it to ```Character.java```
* Compiled and ran, but the damage values were not random anymore because removed random number generator 

**v4**

* Added random number generator to **v3** and it worked 

**v5**

* Created 3 Protagonist subclasses: ```Knight.java```, ```Jester.java```, and ```Wizard.java```
* Filled constructors with stat modifiers (changed health, strength, attack rating, and defense for each one)

**v6**

* Added the 3 Monster subclasses required: ```Goblin.java```, ```Witch.java```, and ```SmallDragon.java```
* Also added a static about method which describes the character and its capabilities briefly

**v7**

* Final version
* Added a random monster chooser in ```YoRPG.java``` for each turn
* Fixed some small bugs and also changed stats a little bit

## Future plans
  
  * The game is complete and fully functional, but to make it a better experience the multipliers and stats need to be tweaked some more. 
  * The addition of more characters, both monsters and protagonists, would also make it more diverse and more interesting
    
