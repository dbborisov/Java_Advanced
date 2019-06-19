package heroRepository;

public class Item {
    private  int strength;
    private int agility;
    private int intelligence;

    public Item(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        //"Item:"
        //"  *  Strength: {Strength Value}"
        //"  *  Agility: {Agility Value}"
        //"  *  Intelligence: {Intelligence Value}"

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Item:%n"));
        sb.append(String.format("  *  Strength: %d%n",this.strength));
        sb.append(String.format("  *  Agility: %d%n",this.agility));
        sb.append(String.format("  *  Intelligence: %d%n",this.intelligence));
        return sb.toString().trim();
    }
}
