import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Account A001 = new Account(1000);
        Account A002 = new Account(2500);

        int userInput = 10;
        double amount = 0;
        Account account = null;

        while (userInput != 0){

            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            userInput = sc1.nextInt();

            if(userInput==0){
                break;
            }

            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter amount: ");
            amount = sc2.nextDouble();

            switch (userInput){
                case 1:
                    A001.deposit(amount);
                    A001.printBalance();
                    A002.printBalance();
                    break;
                case 2:
                    A001.withdraw(amount);
                    A001.printBalance();
                    A002.printBalance();
                    break;
                case 3:
                    A001.transfer(A002, amount);
                    A001.printBalance();
                    A002.printBalance();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
