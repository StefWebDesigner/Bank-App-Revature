package View;

public class BankAppMainMenu extends View {

    public BankAppMainMenu() {
        viewName = "menu.BankAppMainMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() {

        System.out.println("Welcome to Bank of DodgeCoin");
//        System.out.println("Accessing back account " + mainBankAccountNumber );
        System.out.println("----------------------------------");
        System.out.println(" #1 For Deposit Checking Account Activities");
        System.out.println(" #2 For Deposit Saving Account Activities");
        System.out.println(" #3 For Withdraw Checking Account Activities");
        System.out.println(" #4 For Withdraw Saving Account Activities");
        System.out.println(" #5 menu.View your Current Account");
        System.out.println(" #6 Close application");
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

            viewManager.navigator("menu.DepositCheckingMenu");

        } else if (appBankInput == 2) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To Deposit to you Savings account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("menu.DepositSavingMenu");

        } else if (appBankInput == 3) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To withdraw to you Checking account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("menu.WithdrawCheckingMenu");


        } else if (appBankInput == 4) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("To withdraw to you Saving account...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("menu.WithdrawSavingMenu");

        } else if (appBankInput == 5) {

            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("You have selected the deposit option...");
            System.out.println("Accessing your information now...");
            System.out.println("++++++++++++++++++++++++++++++++++");

            viewManager.navigator("menu.CheckBalanceMenu");


        } else if (appBankInput == 6) {
            System.out.println("Thank for using bank of DodgeCoin");
            viewManager.quit();

        } else {
            System.out.println("Incorrect input try again");
            viewManager.navigator("BankAppMenu");
        }
    }
}