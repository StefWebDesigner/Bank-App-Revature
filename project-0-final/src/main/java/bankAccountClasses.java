public class bankAccountClasses {

    //add vinmo option for withdraw
    //negative conditions for depsite
    //do I include the user input here?????

    static int balance = 700;
    //        static int depositUserInput;
    int amount = 0;
    static int checkingAcctBalance = 900;
    static int savingAcctBalance = 300;
    static int mainBankAccountNumber = 12345;


    static void deposit(int amount, int i) {
        checkingAcctBalance = checkingAcctBalance + amount;
        savingAcctBalance = checkingAcctBalance + amount;
        if(amount >= 5000) {
            amount = 0; //it is changed to zero
            System.out.println("You have reached you deposite amount limit!");
        } else {
            System.out.println("Elihable to depoist money");
        }
    }

    static void withdraw(int amount, int i) {
        checkingAcctBalance = checkingAcctBalance - amount;
        savingAcctBalance = checkingAcctBalance - amount;
        if (checkingAcctBalance == -1) {
            amount = 0; //it is changed to zero
            System.out.println("Withdraw attempt denied!");
        } else if (savingAcctBalance == -1) {
            System.out.println("Withdraw attempt denied!");
        } else {
            System.out.println("able to withdraw money");
        }
    }

    static void transactions(int mainBankAccountNumber) {
        System.out.println("Bank Account of " + mainBankAccountNumber);
        System.out.println("Current Checking Account : " + checkingAcctBalance);
        System.out.println("Current Savings Account : " + savingAcctBalance);
        }

}
