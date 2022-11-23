package Entities;

public class Account {

    private int account_number;
    private String name;
    private double balance;

    public Account(int number, String name){
        this.account_number = number;
        this.name = name;
    }
    public Account(int number, String name, double initialDeposite){
        this.account_number = number;
        this.name = name;
        deposit(initialDeposite);
    }
    public void deposit(double amount){
        balance+= amount;
    }
    public void withdraw(double amount){
        balance-= amount + 5.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_number() {
        return account_number;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Datos: " +
                "Account Number: " + account_number +
                ", Name: " + name +
                ", Balance: $" + String.format("%.2f", balance);
    }
}
