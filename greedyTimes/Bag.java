package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private long gold ;
    private long gem ;
    private long money ;
    LinkedHashMap<String,Long> bag;

    public Bag(long gold, long gem, long money) {
        this.gold = gold;
        this.gem = gem;
        this.money = money;
        bag = new LinkedHashMap<>();
    }

    public long getGold() {
        return gold;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

    public long getGem() {
        return gem;
    }

    public void setGem(long gem) {
        this.gem = gem;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public LinkedHashMap<String, Long> getBag() {
        return bag;
    }

    public void setBag(LinkedHashMap<String, Long> bag) {
        this.bag = bag;
    }

    public long getSumFromBag(Long count){

       return  this.bag.values().stream().map(Long::longValue).mapToLong(e->e).sum() + count;

    }
}
