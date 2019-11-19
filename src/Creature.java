// Generic creatures class used by {@link Player} and {@link Enemy}
public class Creature {
    // Equipped weapon for use in combat
    public Item equip;

    // Name of Creature
    public String name;

    // Creatures HP
    private int hp;

    public void hp(int more){
        hp += more;
    }
    // creature constructor
    public Creature(String name, int hp, Item equip){
        this.name = name;
        this.hp = hp;
        this.equip = equip;
    }

    // Returns the health for the creature
    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    /* Damage player
       @param amount the amount of health point to remove from the player*/
    public void damage(int amount){
        this.hp -= amount;
    }
}
