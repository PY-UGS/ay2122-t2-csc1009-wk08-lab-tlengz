public class InsufficientFundsException extends Exception{
    private Double amount;
    private String exceed;
    public InsufficientFundsException(Double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    
    public InsufficientFundsException(String exceed){
        this.exceed = exceed;
    }

    @Override
    public String toString(){
        return this.exceed;
    }
}
