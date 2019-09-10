package MyRestaurent2;


public class NOTVIP extends Consumer{
    private static int numberOfNonVip = 0;
    public NOTVIP (){
        numberOfNonVip++;
    }

    public static int getNumberOfNonVip() {
        return numberOfNonVip;
    }
}
