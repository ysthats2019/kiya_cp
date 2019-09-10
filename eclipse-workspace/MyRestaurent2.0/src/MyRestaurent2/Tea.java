package MyRestaurent2;

public class Tea {
    private String teaName;
    private double teaPrice;
    
    public Tea(String teaName,double teaPrice){
        this.teaName=teaName;
        this.teaPrice=teaPrice;
    }
    
    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public double getTeaPrice() {
        return teaPrice;
    }

    public void setTeaPrice(double teaPrice) {
        this.teaPrice = teaPrice;
    }
}

