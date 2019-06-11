package difining_classes.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private static final int DEFAULT_BADGE = 0;
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badges = DEFAULT_BADGE;
        this.pokemonList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }
}
