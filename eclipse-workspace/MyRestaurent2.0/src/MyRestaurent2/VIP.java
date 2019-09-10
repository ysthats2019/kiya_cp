package MyRestaurent2;


public class VIP extends Consumer{
    
    private String Account;
    private String Keyword;
    private static int numberOfVip = 0;
    
    public VIP(String Account,String Keyword){
        this.Account=Account;
        this.Keyword=Keyword;
        numberOfVip ++;
    }
    
    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public static int getNumberOfVip() {
        return numberOfVip;
    }
    
}
