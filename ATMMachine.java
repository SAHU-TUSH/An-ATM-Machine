 import java.util.Scanner;
class ATM{
    private float balance;
    private final int PIN = 1234;
    public void start() {
        checkpin();
    }

    private void checkpin(){
        System.out.println("Enter your PIN");
        Scanner sc= new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if( enteredpin==PIN){
            menue();
        }
        else{
            System.out.println("entered wrong pin");
            
        }
    }
    private void menue(){
        System.out.println("Enter Your Choice :");
        System.out.println("1.Check Account Balanace");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");
          
        Scanner sc= new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            AccountBalance();
        }
        else if(choice==2){
            WithdrawMoney();
        }
        else if(choice==3){
            DepositMoney();
        }
        else if(choice==4){
            return;
        }
        else{
            System.out.println("INVALID CHOICE :ENTER VALID CHOICE");
            menue();
        }

    }
    private void AccountBalance(){
        System.out.println("Balance is:"+balance);
        menue();
    }

    private void WithdrawMoney(){
        System.out.println("Enter the amount to withdraw");
        Scanner sc =new Scanner(System.in);
        int Enteredmoney=sc.nextInt();
        if(Enteredmoney>balance){

            System.out.println("Insufficient Balance:Enter Valid Amount");
        }
        else{
            balance -= Enteredmoney;
            System.out.println("Money withdrawn successfully");
        menue();
        }


    }
    public void DepositMoney(){
        System.out.println("Enter the Amount to depsit");
        Scanner sc= new Scanner(System.in);
        int Amount =sc.nextInt();
        balance+=Amount;
        System.out.println("Money Depsited Successfully");
        menue();
    }
}


    public class ATMMachine {
        public static void main(String[] args) {
            ATM obj = new ATM();
            obj.start();
        }
    }
