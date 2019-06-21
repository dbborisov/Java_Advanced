package repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repository {

    private Map<Integer, Person> data;

    public Repository() {
        this.data = new LinkedHashMap<>();

    }

    public void add(Person person) {
        if (this.data.isEmpty()) {
            this.data.put(0, person);
        }else{
            this.data.put(this.data.size(),person);
        }
    }
    public Person get(int id){
       return this.data.get(id);
    }
    public boolean update(int id, Person newPerson){
        if(this.data.containsKey(id)) {
            this.data.remove(id);
            this.data.put(id, newPerson);
            return true;
        }else{
            return  false;
        }
    }
    public  boolean delete(int id){
        if (this.data.containsKey(id)){
            this.data.remove(id);
            return true;
        }else{
            return  false;
        }
    }
    public int getCount(){
        return this.data.size();
    }
}
