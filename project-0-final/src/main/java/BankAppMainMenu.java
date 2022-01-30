import java.sql.SQLOutput;

public class BankAppMainMenu extends View{

        public BankAppMainMenu() {
            viewName = "BankAppMainMenu";
            viewManager = ViewManager.getViewManager();
        }

    public void renderView()  {
//
        System.out.println("Welcome to Bank of DodgeCoin");
//        System.out.println("Accessing back account " + mainBankAccountNumber );
        System.out.println("----------------------------------");
        System.out.println(" #1 For Deposit Activities");
        System.out.println(" #2 For Withdraw Activities");
        System.out.println(" #3 View your Current Account");
        System.out.println(" #4 Close application");
        System.out.println("Please choose an option");
        System.out.println("----------------------------------");
//
        int appBankInput = viewManager.getScanner().nextInt();
        viewManager.getScanner().nextLine();

//        int accountChoosingInput = 0;
//        double amount = 0;
//        int i = 0;
////
        if (appBankInput == 1) {
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To Deposit to you checking account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("DepositCheckingMenu");

        } else if (appBankInput == 2) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To Deposit to you Savings account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("DepositSavingMenu");

        } else if (appBankInput == 3) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To withdraw to you Checking account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("WithdrawCheckingMenu");


        } else if (appBankInput == 4) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To withdraw to you Saving account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("WithdrawSavingMenu");

        } else if (appBankInput == 5) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("You have selected the deposit option...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("CheckBalanceMenu");


        } else if (appBankInput == 6) {
            System.out.println("Thank for using bank of DodgeCoin");
            viewManager.quit();

        } else {
            System.out.println("Incorrect input try again");
            viewManager.navigator("BankAppMenu");
        }


    }


}



//    public void renderView() {
//
//        System.out.println("Welcome to Bank of DodgeCoin");
//        System.out.println("----------------------------------");
//        System.out.println(" #1 For Deposit Activities");
//        System.out.println(" #2 For Withdraw Activities");
//        System.out.println(" #3 View your Current Account");
//        System.out.println(" #4 Close application");
//        System.out.println("Please choose an option");
//        System.out.println("----------------------------------");
//
//        int appBankInput = viewManager.getScanner().nextInt();
//        viewManager.getScanner().nextLine();
//
//        int accountChoosingInput = 0;
//        double amount = 0;
//        int i = 0;
//
//        if (appBankInput == 1) {
//
//            System.out.println("You have selected the deposite option:");
//            System.out.printf("Your current checkingAcctBalance is : $ %.2f \n", checkingAcctBalance);
//            System.out.printf("Your current SavingAcctBalance is : $ %.2f \n", savingAcctBalance);
//
//
//            System.out.println("How much do you want to deposit : ");
//            amount = viewManager.getScanner().nextDouble();
//            viewManager.getScanner().nextLine();
//
//            System.out.println("Which account do you want to deposit the money:");
//            System.out.println("1# for checking");
//            System.out.println("2# for saving");
//            accountChoosingInput = viewManager.getScanner().nextInt();
//            viewManager.getScanner().nextLine();
//            System.out.println(accountChoosingInput); //TESTING
//
//            System.out.println("Pulling up information now");
//            bankAccountClassesExtViewExp.deposit(amount, i);
//            viewManager.navigator("BankAppMenu");
//
//        } else if (appBankInput == 2) {
//
//            System.out.println("You have selected the withdraw option:");
//            System.out.printf("Your current checkingAcctBalance is : $ %.2f \n", checkingAcctBalance);
//            System.out.printf("Your current SavingAcctBalance is : $ %.2f \n", savingAcctBalance);
//
//            System.out.println("How much do you want to withdraw : ");
//            amount = viewManager.getScanner().nextDouble();
//            viewManager.getScanner().nextLine();
//
//            System.out.println("Which account do you want to withdraw the money:");
//            System.out.println("1# for checking");
//            System.out.println("2# for saving");
//            accountChoosingInput = viewManager.getScanner().nextInt();
//            viewManager.getScanner().nextLine();
//            System.out.println(accountChoosingInput); //TESTING
//
//
//            bankAccountClassesExtViewExp.withdraw(amount, i);
//            System.out.println(checkingAcctBalance);//testing
//            System.out.println(amount); //TESTING
//            viewManager.navigator("BankAppMenu");
////            }
//        } else if (appBankInput == 3) {
//            bankAccountClassesExtViewExp.transactions(mainBankAccountNumber);
//            System.out.println("Bank Account Balances for : " + mainBankAccountNumber);
//            System.out.println("**********************************");
//
//            System.out.println("**********************************");
//            System.out.println("Checking balance of : " + checkingAcctBalance);
//            System.out.println("Saving balance of : " + savingAcctBalance);
//            System.out.println("**********************************");
//
//        } else if (appBankInput == 4) {
//            System.out.println("Thank for using bank of DodgeCoin");
//            viewManager.quit();
//        } else {
//            System.out.println("Incorrect input try again");
//            viewManager.navigator("BankAppMenu");
//        }
//    }
//}
