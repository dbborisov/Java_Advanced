package arena;

import java.util.ArrayList;
import java.util.List;

public class FightingArena {
    private List<Gladiator> gladiators;
    private String name;

    public FightingArena(String name) {
        this.gladiators = new ArrayList<>();
        this.name = name;
    }

    public void add(Gladiator gladiator){
        this.gladiators.add(gladiator);
    }

    public void remove(String name){
        int index  = -1;
        for (int i = 0; i < gladiators.size(); i++) {
            String tempName = gladiators.get(i).getName();

            if(tempName.equals(name)){
                index = i;
                break;
            }
        }
        if(index != -1){
            this.gladiators.remove(index);
        }
    }

    public Gladiator getGladiatorWithHighestStatPower() {

        return this.gladiators.stream().max((e1, e2) -> e1.getStatPower() - e2.getStatPower()).get();
    }
    public  Gladiator getGladiatorWithHighestWeaponPower(){
        return this.gladiators.stream().max((e1, e2) -> e1.getWeaponPower() - e2.getWeaponPower()).get();
    }
    public  Gladiator getGladiatorWithHighestTotalPower(){

        return this.gladiators.stream().max((e1, e2) -> e1.getTotalPower() - e2.getTotalPower()).get();
    }

    public int getCount(){
        return this.gladiators.size();
    }

    @Override
    public String toString() {
        return String.format("%s – %d gladiators are participating.",this.name,this.getCount());
    }
}
