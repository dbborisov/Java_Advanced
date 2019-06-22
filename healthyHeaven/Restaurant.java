package healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Salad> data;

    public Restaurant(String name) {
        this.name = name;
        this.data= new ArrayList<>();
    }
    public void add(Salad salad){
        this.data.add(salad);
    }
    public boolean buy(String name){
        int index = this.data.indexOf(name);
        if(index==-1){
            return false;
        }
        this.data.remove(index);
        return true;
    }
    public Salad getHealthiestSalad(){
        return this.data.stream().min((e1,e2)->e1.getTotalCalories()-e2.getTotalCalories()).get();
    }
    public String generateMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append( String.format("%s have %d salads:%n",this.name,this.data.size()));
        for (int i = 0; i < this.data.size(); i++) {
            sb.append(this.data.get(i).toString());
        }
        return sb.toString().trim();
    }
}
