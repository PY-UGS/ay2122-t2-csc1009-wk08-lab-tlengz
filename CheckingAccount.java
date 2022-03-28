public class CheckingAccount {
    private Integer accountNumber;
    private Double balance;

    public CheckingAccount(Integer accNo, Double bal){
        this.accountNumber = accNo;
        this.balance = bal;
    }

    public void deposit(Double deposit){
        if(deposit>=0){
            this.balance += deposit;
        }
    }
    public void withdraw(Double withdraw)throws InsufficientFundsException{
        if(withdraw>this.balance){
            throw new InsufficientFundsException("Withdraw amount is higher than balance!");
        }
        else{
            this.balance -= withdraw;
        }
    }
    public Double getBalance(){
        return this.balance;
    }
    public Integer getNumber(){
        return this.accountNumber;
    }
}
