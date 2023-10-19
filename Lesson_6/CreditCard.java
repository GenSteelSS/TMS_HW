package Lesson_6;

public class CreditCard {
    int accountNumber;
    int balance;

    CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    int accrue(int summ) {
        balance = balance + summ;
        return balance;
    }

    int withdraw(int summ) {
        balance = balance - summ;
        return balance;
    }

    void displayInfo() {
        System.out.println("Account number " + accountNumber + "Balance " + balance);
    }
}
