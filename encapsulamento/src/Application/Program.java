package Application;

import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.printf("Enter account name: ");
        String name = sc.nextLine();
        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        System.out.printf("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y'){
         System.out.printf("Enter initial deposit value: ");
         double initialDeposit = sc.nextDouble();
         account = new Account(number, name, initialDeposit);
        }
        else {
            account = new Account(number, name);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        sc.close();
    }
}
