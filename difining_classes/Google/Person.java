package difining_classes.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    // all classes


    private Company company;
    private List<Pokemon> pokemon;
    private List<Parents >parents;
    private List<Children> children;
    private Car car;


    public Person() {

        this.pokemon= new ArrayList<>();
        this.parents= new ArrayList<>();
        this.children= new ArrayList<>();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents.add(parents);
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children.add(children);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
