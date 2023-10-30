import java.util.Scanner;


class checking extends ATM{

    public void withdraw(int amount){

        if(amount>totalAmount){
            System.out.println("Insufficient account balance");
        }
        else{
            totalAmount=totalAmount-amount;
            System.out.println("Money withdrawn successfully");
        }
    }

    public void deposit(int amount){
        totalAmount=totalAmount+amount;
        System.out.println("Amount deposited successfully");
    }

    public void checkBalance(){
        System.out.println("Total Balance: "+totalAmount);
    }
}

class ATM{
    int totalAmount=0;

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        checking obj=new checking();
        char answer='y';

        while(answer=='y') {

            System.out.println("Enter '1' to Withdraw Money");
            System.out.println("Enter '2' to Deposit Money");
            System.out.println("Enter '3' to Check Balance");
            int ch=sc.nextInt();

            switch (ch) {

                case 1: {
                    System.out.println("Enter the amount of money you want to withdraw");
                    int amount = sc.nextInt();
                    obj.withdraw(amount);
                    break;
                }

                case 2: {
                    System.out.println("Enter the amount of money you want to deposit");
                    int amount = sc.nextInt();
                    obj.deposit(amount);
                    break;
                }

                case 3: {
                    obj.checkBalance();
                    break;
                }

                default: {
                    System.out.println("Wrong input, please select again");
                    break;
                }
            }

            System.out.println("Enter 'y' to continue inside the ATM machine and 'n' to exit");
            answer=sc.next().charAt(0);
        }

        System.out.println("Thank you!!, Visit again");
    }
}