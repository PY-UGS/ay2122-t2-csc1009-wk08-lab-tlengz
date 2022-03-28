import java.util.Scanner;

public class BankDemoTest
{
    public static void main(String[] args)
    {
        Double deposit = 0.0, withdraw = 0.0;
        CheckingAccount dummyAccount = new CheckingAccount(010123456, 500.00); // (accNo,bal)

        try{
            System.out.println("Available Balance: $" + String.format("%.2f",dummyAccount.getBalance()));
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the amount to deposit: $");
            deposit = input.nextDouble();
            dummyAccount.deposit(deposit);
            System.out.print("Available Balance: $" + String.format("%.2f",dummyAccount.getBalance()) + "\n");

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: $");
            withdraw = input2.nextDouble();
            dummyAccount.withdraw(withdraw);

            System.out.print("The balance after withdraw is: $" + String.format("%.2f", dummyAccount.getBalance()));

            input.close();
            input2.close();
        }
        catch(Exception e){

            
            System.out.println(e);
            //System.err.print("Sorry, but your account is short by: $" + String.format("%.2f", withdraw - dummyAccount.getBalance()));
        }
    }
}

