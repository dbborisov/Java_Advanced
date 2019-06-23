package spaceStationRecruitment;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {
    private List<Astronaut> data;
    private String name;
    private int capacity;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public void add(Astronaut astronaut) {
        if (this.capacity > this.data.size()) {
            this.data.add(astronaut);
        }
    }

    public boolean remove(String name) {
        int index = -1;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                index = i;
                break;
            }


        }
        if (index == -1) {
            return false;
        }
        this.data.remove(index);
        return true;
    }

    public Astronaut getOldestAstronaut() {
        int index = -1;
        int age = 0;

        for (int i = 0; i < this.data.size(); i++) {
            if (age < this.data.get(i).getAge()) {
                index = i;
                age = this.data.get(i).getAge();
            }

        }
        return this.data.get(index);
    }

    public Astronaut getAstronaut(String name) {
        int index = -1;

        for (int i = 0; i < this.data.size(); i++) {
            if(this.data.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }
        return this.data.get(index);
    }

    public  String report(){
        //Astronauts working at Space Station {spaceStationName}:
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Astronauts working at Space Station %s:%n",getName()));
        for (int i = 0; i <this.data.size() ; i++) {
            sb.append(String.format("%s%n",this.data.get(i).toString()));
        }
        return sb.toString().trim();
    }
}
