import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class bankAccountClasses {

    //add vinmo option for withdraw
    //negative conditions for depsite
    //do I include the user input here?????

//    static int balance = 700;
    //        static int depositUserInput;
    Double amount = Double.valueOf(0)*.1;
    static Double checkingAcctBalance = Double.valueOf(0)*.1;
//    static Double checkingAcctBalance = new Double(0 * 100) + 0;
//    static double checkingAcctBalance = new Double(checkingAcctBalance * 100) + 0;
//    for(int i = 1; i <= 2; i++) {
//        checkingAcctBalance = checkingAcctBalance*.1;
//    }


    static double savingAcctBalance = 0;
    static int mainBankAccountNumber = 0;

    static int accountChoosingInput;

    static void deposit(int amount, int i) {
        if(accountChoosingInput == checkingAcctBalance) {
            if (amount <= 5000) {
                checkingAcctBalance = checkingAcctBalance + amount;
                System.out.println("Deposit to Checking Successful");
                System.out.println("**********************************");
                System.out.println("Checking balance of : $" + bankAccountClasses.checkingAcctBalance);
                System.out.println("**********************************");

            } else {
                amount = 0; //it is changed to zero
                System.out.println("You have reached you deposite amount limit!");
            }
        } else if (accountChoosingInput == savingAcctBalance) {
            if(amount <= 5000) {
                savingAcctBalance = savingAcctBalance + amount;
                System.out.println("Deposit to Checking Successful");
                System.out.println("**********************************");
                System.out.println("Saving balance of : $" + bankAccountClasses.savingAcctBalance);
                System.out.println("**********************************");
            } else {
                amount = 0; //it is changed to zero
                System.out.println("You have reached you deposite amount limit!");
            }
        } else {
            System.out.println("Try Again");
        }
    }

//    static void withdraw(int amount, int i) {
//        if (checkingAcctBalance == -1) {
//            checkingAcctBalance = checkingAcctBalance - amount;
//            amount = 0; //it is changed to zero
//            System.out.println("Withdraw attempt denied!");
//        } else if (savingAcctBalance == -1) {
//            savingAcctBalance = checkingAcctBalance - amount;
//            System.out.println("Withdraw attempt denied!");
//        } else {
//            System.out.println("able to withdraw money");
//        }
//    }
     static void withdraw(int amount, int i) {
        if(accountChoosingInput == checkingAcctBalance) {
            if (checkingAcctBalance >= amount) {
                System.out.println(checkingAcctBalance);//testing
                System.out.println(amount); //TESTING
                checkingAcctBalance = checkingAcctBalance - amount;
                System.out.println("Withdraw to Checking Successful");

                System.out.println("**********************************");
                System.out.println("Checking balance of : $" + bankAccountClasses.checkingAcctBalance);
                System.out.println("**********************************");

            } else {
                amount = 0; //it is changed to zero
                System.out.println("You have reached your overdraft. Access denied");
            }
        } else if (accountChoosingInput == savingAcctBalance) {
            if(savingAcctBalance >= amount) {
                System.out.println(savingAcctBalance);//testing
                System.out.println(amount); //TESTING
                savingAcctBalance = savingAcctBalance - amount;
                System.out.println("Withdraw to Savings Successful");
                System.out.println("**********************************");
                System.out.println("Savings balance of : $" + bankAccountClasses.savingAcctBalance);
                System.out.println("**********************************");
            } else {
                amount = 0; //it is changed to zero
                System.out.println("You have reached your overdraft. Access denied");
            }
        } else {
            System.out.println("Try Again");
        }
    }

    static void transactions(int mainBankAccountNumber) {
        System.out.println("Bank Account of " + mainBankAccountNumber);
        System.out.println("Current Checking Account : $" + checkingAcctBalance);
        System.out.println("Current Savings Account : $" + savingAcctBalance);
        }

}
