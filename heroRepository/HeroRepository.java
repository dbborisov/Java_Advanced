package heroRepository;

import java.util.ArrayList;
import java.util.List;

public class HeroRepository {
    public List<Hero> data;

    public HeroRepository() {
        this.data = new ArrayList<>();
    }

    public void add(Hero hero) {
        this.data.add(hero);
    }

    public void remove(String name) {
        int index = -1;
        for (int i = 0; i < this.data.size(); i++) {

            if (data.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            this.data.remove(index);
        }
    }

    public Hero getHeroWithHighestStrength() {

        Hero hero = this.data.stream().max((e1, e2) -> e1.getItem().getStrength() - e2.getItem().getStrength()).get();
        return hero;
    }

    public Hero getHeroWithHighestAgility() {

        Hero hero = this.data.stream().max((e1, e2) -> e1.getItem().getAgility() - e2.getItem().getAgility()).get();
        return hero;

    }

    public Hero getHeroWithHighestIntelligence() {
        Hero hero = this.data.stream().max((e1, e2) -> e1.getItem().getIntelligence() - e2.getItem().getIntelligence()).get();
        return hero;
    }

    public int getCount() {
        return this.data.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.data.forEach(e -> sb.append(e.toString() + System.lineSeparator()));
        return sb.toString().trim();

    }
}
