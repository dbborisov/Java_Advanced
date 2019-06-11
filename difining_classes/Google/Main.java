package difining_classes.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//•	"<Name> company <companyName> <department> <salary>"
//•	"<Name> pokemon <pokemonName> <pokemonType>"
//•	"<Name> parents <parentName> <parentBirthday>"
//•	"<Name> children <childName> <childBirthday>"
//•	"<Name> car <carModel> <carSpeed>"

        Scanner scanner = new Scanner(System.in);

        Map<String , Person>  person = new LinkedHashMap<>();

        String in = "";

        while (!"End".equals(in=scanner.nextLine())){

            String[] tokens = in.split("\\s+");
                if(!person.containsKey(tokens[0])){
                    person.put(tokens[0],new Person());
                }

            switch (tokens[1]){
                case "company":
                    Company company = new Company();
                    company.setCompanyName(tokens[2]);
                    company.setDepartment(tokens[3]);
                    company.setSalary(Double.parseDouble(tokens[4]));
                    person.get(tokens[0]).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon();
                    pokemon.setPokemonName(tokens[2]);
                    pokemon.setPokemonType(tokens[3]);
                    person.get(tokens[0]).setPokemon(pokemon);
                    break;
                case "parents":
                    Parents parents = new Parents();
                    parents.setParentName(tokens[2]);
                    parents.setParentBirthday(tokens[3]);
                    person.get(tokens[0]).setParents(parents);
                    break;
                case "children":
                    Children children = new Children();
                    children.setChildName(tokens[2]);
                    children.setChildBirthday(tokens[3]);
                    person.get(tokens[0]).setChildren(children);
                    break;
                case "car":
                    Car car = new Car();
                    car.setCarModel(tokens[2]);
                    car.setCarSpeed(tokens[3]);
                    person.get(tokens[0]).setCar(car);
                    break;
            }


        }
        String nameToSearch = scanner.nextLine();

        person.entrySet().stream().filter(e->e.getKey().equals(nameToSearch)).forEach(e->{

            System.out.println(nameToSearch);

            System.out.println("Company:");
            if(e.getValue().getCompany()!=null) {
                System.out.println(String.format("%s %s %.2f", e.getValue().getCompany().getCompanyName(), e.getValue().getCompany().getDepartment(), e.getValue().getCompany().getSalary()));
            }
            System.out.println("Car:");
            if(e.getValue().getCar()!=null){
                System.out.println(String.format("%s %s", e.getValue().getCar().getCarModel(), e.getValue().getCar().getCarSpeed()));
            }
            System.out.println("Pokemon:");
            if(e.getValue().getPokemon()!=null){
                e.getValue().getPokemon().stream().forEach(s->{
                    System.out.println(s.getPokemonName() + " " + s.getPokemonType());
                });
            }
            System.out.println("Parents:");
            if(e.getValue().getParents()!=null){
                e.getValue().getParents().stream().forEach(s->{
                    System.out.println(s.getParentName() + " " + s.getParentBirthday());
                });
            }


            System.out.println("Children:");
            if(e.getValue().getChildren()!=null){
                e.getValue().getChildren().stream().forEach(s->{
                    System.out.println(s.getChildName() + " " + s.getChildBirthday());
                });
            }


        });


    }
}
