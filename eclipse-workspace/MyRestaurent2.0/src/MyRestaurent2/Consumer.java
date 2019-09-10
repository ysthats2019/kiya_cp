package MyRestaurent2;

import java.util.*;
public class Consumer {
    protected double totalsum=0;
    protected int numberOfpeople=0;
    protected ArrayList<Food> foodlist = new ArrayList<Food>();
    protected Tea teatype;
    public Consumer(){
        
    }
    
    
    public double getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(double totalsum) {
        this.totalsum = totalsum;
    }

    public int getNumberOfpeople() {
        return numberOfpeople;
    }

    public void setNumberOfpeople(int numberOfpeople) {
        this.numberOfpeople = numberOfpeople;
    }

    public ArrayList<Food> getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }

    public Tea getTeatype() {
        return teatype;
    }

    public void setTeatype(Tea teatype) {
        this.teatype = teatype;
    }
    public void AddFood(Food f){
        foodlist.add(f);
    }
}
