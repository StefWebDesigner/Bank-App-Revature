public class bankAccountClasses {

    //add vinmo option for withdraw
    //negative conditions for depsite
    //do I include the user input here?????

    static int balance = 700;
    //        static int depositUserInput;
    static int amount;
    String clientName;

    static void deposit(int balance, int amount) {
        balance = balance + amount;
        System.out.println("Deposite Complete. Current Balance : " + balance);
    }

    static void withdraw(int balance, int amount) {
        balance = balance - amount;
        System.out.println("Withdraw Complete. Current Balance : " + balance);
    }

    void transactions() {
        System.out.println("Bank Account of " + clientName);
        System.out.println("Current Account : " + balance);
    }

}
