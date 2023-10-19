package Lesson_6;

public class СardTransactions {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(1111, 1000);
        CreditCard wifeCard = new CreditCard(2222, 10000);
        CreditCard mySecretCard = new CreditCard(7777, 9000);

        myCard.accrue(1000);
        wifeCard.accrue(5000);
        mySecretCard.withdraw(10);

        myCard.displayInfo();
        wifeCard.displayInfo();
        mySecretCard.displayInfo();
    }
}
