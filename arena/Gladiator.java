package arena;

public class Gladiator {
    private String name;
    private Stat stat;
    private Weapon weapon;

    public Gladiator(String name, Stat stat, Weapon weapon) {
        this.name = name;
        this.stat = stat;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getWeaponPower() {
        return weapon.getSharpness()+weapon.getSize()+weapon.getSolidity();
    }

    public int getStatPower() {
        return stat.getAgility() + stat.getFlexibility()+stat.getSkills()+stat.getStrength()+ stat.getIntelligence() ;
    }
    public int getTotalPower(){
        return this.getStatPower()+this.getWeaponPower();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %d%n",this.name,this.getTotalPower()));
        sb.append(String.format("  Weapon Power: %d%n",this.getWeaponPower()));
        sb.append(String.format("  Stat Power: %d%n",this.getStatPower()));

        return sb.toString().trim();
    }
}
