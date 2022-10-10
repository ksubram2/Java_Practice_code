import java.beans.SimpleBeanInfo;

public class PractiseCode3 {

    private double balance = 500;
    public double getbalance (int accountId){
        return balance;
    }

    private String name = "Karthikeyan";
    public String getaccountinfo (int accountid){
        return name;

    }
    public static void main (String[] args){
        PractiseCode3 accnt =new PractiseCode3();
        double value = accnt.getbalance(123456);
        System.out.println("The Balance is: " + value);
        String accountinfo = accnt.getaccountinfo(123456);
        System.out.println("The Account Balance is: " + accountinfo);
    }
}
