package difining_classes.Google;

public class Pokemon {
    //•	"<Name> pokemon <pokemonName> <pokemonType>"
    private  static final String DEFAULT_EMPTY_FIELD = "";
    private  String pokemonName ;
    private  String pokemonType ;

    public Pokemon() {
        this.pokemonName = DEFAULT_EMPTY_FIELD;
        this.pokemonType = DEFAULT_EMPTY_FIELD;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }
}
