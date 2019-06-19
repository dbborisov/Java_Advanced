package heroRepository;

public class Hero {
    private  String name;
    private int level;
    private Item item;

    public Hero(String name, int level, Item item) {
        this.name = name;
        this.level = level;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append(String.format("Hero: %s – %d%n",this.name,this.level));
        sb.append(String.format("  *  Strength: %s%n",this.getItem().getStrength()));
        sb.append(String.format("  *  Agility: %d%n",this.getItem().getAgility()));
        sb.append(String.format("  *  Intelligence: %d%n",this.item.getIntelligence()));

        return sb.toString().trim();
    }
}
