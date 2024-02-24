import java.util.*;

class ATM {
    ATM() {
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Get MiniStatement");
        System.out.println("5.Exit");
    }
}

public class AutomatedTellerMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12345;
        int b = 1234;
        double balance = 0, withdraw, deposit;
        LinkedHashMap<Double, String> mini = new LinkedHashMap<>();
        System.out.print("Enter your Id : ");
        int Id = sc.nextInt();
        System.out.print("Enter your Pin : ");
        int Pin = sc.nextInt();
        while (a == Id && b == Pin) {
            ATM atm = new ATM();
            System.out.print("Enter a Number : ");
            int Num = sc.nextInt();
            switch (Num) {
                case 1:
                    System.out.println(balance + " Available Balance");
                    break;
                case 2:
                    System.out.print("Enter Money You Want Withdraw : ");
                    withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        mini.put(withdraw, "Withdraw Amount");
                        System.out.println(" Withdraw Money Sucessfully");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.print("Enter Money to be Deposit : ");
                    deposit = sc.nextDouble();
                    balance += deposit;
                    mini.put(deposit, "Deposited Amount");
                    System.out.println("Your Money has Sucessfully deposited");
                    break;
                case 4:
                    System.out.println("Mini Statement ");
                    Set e = mini.keySet();
                    Collection c = mini.values();
                    Iterator itr1 = e.iterator();
                    Iterator itr2 = c.iterator();
                    while (itr1.hasNext() == true) {
                        System.out.println(itr1.next() + " " + itr2.next());
                    }
                    System.out.println(balance + " Available Balance");
                    break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter Worng key");
            }
        }
        {
            System.out.println("Enter Wrong Id or Pin");
        }
    }
}
