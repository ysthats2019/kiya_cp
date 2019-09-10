package MyRestaurent2;

public class Food {
    protected String foodName;
    protected double foodPrice;
    protected int numberOfFood=0;
    protected boolean available=true;
    
    public Food(){
        
    }
    public Food(String foodName,double foodPrice){
        this.foodName=foodName;
        this.foodPrice=foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getNumberOfFood() {
        return numberOfFood;
    }

    public void setNumberOfFood(int numberOfFood) {
        this.numberOfFood = numberOfFood;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void clearFood(){
        setNumberOfFood(0);
    }
}

