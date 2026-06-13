package encapsulatin;
public class Banking {
    private int pin;
    private String accountHolderName;
    private int AccountBalance;
    
    public Banking(int pin , String accountHolderName , int AccountBalance){
        this.pin = pin ; 
        this.accountHolderName = accountHolderName;
        this.AccountBalance = AccountBalance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public int getAccountBalance(){
        return AccountBalance;
    }

    public void setpin(int newpin){
        pin = newpin ;
    }

    public int getpin(){
        return pin;
    }
}
    