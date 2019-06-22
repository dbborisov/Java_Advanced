package healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetable> products;
    private String name;

    public Salad(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getTotalCalories(){
        int sum=0;
        for (int i = 0; i <products.size(); i++) {
            sum += products.get(i).getCalories();
        }
        return sum;
    }
    public int getProductCount(){
        return products.size();
    }
    public void add(Vegetable product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        //"* Salad {name} is {calories} calories and have {product count} products:
        //{Vegetable 1}
        //{Vegetable 2}
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("* Salad %s is %s calories and have %d products:%n",this.name,this.getTotalCalories(),this.getProductCount()));
        int size = this.getProductCount();
        for (int i = 0; i < size; i++) {
            sb.append(products.get(i).toString());
        }
        return sb.toString().trim();
    }


}
