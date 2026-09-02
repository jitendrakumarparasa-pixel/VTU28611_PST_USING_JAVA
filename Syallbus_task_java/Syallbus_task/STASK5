import java.util.Scanner;

class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}

public class STASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();

            if (operation.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }

        if (account.balance == (long) account.balance) {
            System.out.println((long) account.balance);
        } else {
            System.out.println(account.balance);
        }

        sc.close();
    }
}
