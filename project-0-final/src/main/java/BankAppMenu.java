public class BankAppMenu extends View {

    public BankAppMenu() {
        viewName = "BankAppMenu";
        viewManager = ViewManager.getViewManager();
    }

    //IT'S TIME  MADE THIS AFUCKGIN POGOG!!!!!
//is it nesisary to do the do while loop anymore
    public void renderView() {

        System.out.println("Welcome to Bank of DodgeCoin");
        //THIS IS WHERE TO ENTER IF TO CREATE AN ACCOUNT OR OR LOGIN WITH
        //I NEED TO LEARN HOW TO DO LIST SO SKIP THIS FOR NOW
        System.out.println("----------------------------------");
        System.out.println(" #1 For Deposit Activities");
        System.out.println(" #2 For Withdraw Activities");
        System.out.println(" #3 View your Current Account");
        System.out.println(" #4 Close application");
        System.out.println("Please choose an option");
        System.out.println("----------------------------------");

        int appBankInput = viewManager.getScanner().nextInt();
        viewManager.getScanner().nextLine();
        int accountChoosingInput = 0;
        int amount = 0;
        int i = 0;

        if (appBankInput == 1) {

            System.out.println("You have selected the deposite option:");
            System.out.println("Your current checkingAcctBalance is : " + bankAccountClasses.checkingAcctBalance);
            System.out.println("Your current checkingAcctBalance is : " + bankAccountClasses.savingAcctBalance);

            System.out.println("How much do you want to deposit : ");
            amount = viewManager.getScanner().nextInt();
            viewManager.getScanner().nextLine();

            System.out.println("Which account do you want to deposit the money:");
            System.out.println("1# for checking");
            System.out.println("2# for saving");
            accountChoosingInput = viewManager.getScanner().nextInt();
            viewManager.getScanner().nextLine();
            if (accountChoosingInput == 1) {
                bankAccountClasses.deposit(amount, i);
                i = bankAccountClasses.checkingAcctBalance;
//                bankAccountClasses.deposit(bankAccountClasses.checkingAcctBalance, amount);
                System.out.println("**********************************");
                System.out.println("Checking balance of : " + bankAccountClasses.checkingAcctBalance);
                System.out.println("**********************************");
                viewManager.navigator("BankAppMenu");
            } else if (accountChoosingInput == 2) {
                bankAccountClasses.deposit(amount, i);
                //                bankAccountClasses.deposit(bankAccountClasses.checkingAcctBalance, amount);
                i = bankAccountClasses.savingAcctBalance;
                System.out.println("**********************************");
                System.out.println("Savings balance of : " + bankAccountClasses.savingAcctBalance);
                System.out.println("**********************************");
                viewManager.navigator("BankAppMenu");
            }
        } else if (appBankInput == 2) {

            System.out.println("You have selected the withdraw option:");
            System.out.println("Your current checkingAcctBalance is : " + bankAccountClasses.checkingAcctBalance);
            System.out.println("Your current checkingAcctBalance is : " + bankAccountClasses.savingAcctBalance);

            System.out.println("How much do you want to deposit : ");
            amount = viewManager.getScanner().nextInt();
            viewManager.getScanner().nextLine();

            System.out.println("Which account do you want to withdraw the money:");
            System.out.println("1# for checking");
            System.out.println("2# for saving");
            accountChoosingInput = viewManager.getScanner().nextInt();
            viewManager.getScanner().nextLine();
            if (accountChoosingInput == 1) {
                bankAccountClasses.withdraw(amount, i);
                i = bankAccountClasses.checkingAcctBalance;
//                bankAccountClasses.deposit(bankAccountClasses.checkingAcctBalance, amount);
                System.out.println("**********************************");
                System.out.println("Checking balance of : " + bankAccountClasses.checkingAcctBalance);
                System.out.println("**********************************");
                viewManager.navigator("BankAppMenu");
            } else if (accountChoosingInput == 2) {
                bankAccountClasses.deposit(amount, i);
                i = bankAccountClasses.savingAcctBalance;
                System.out.println("**********************************");
                System.out.println("Savings balance of : " + bankAccountClasses.savingAcctBalance);
                System.out.println("**********************************");
                viewManager.navigator("BankAppMenu");
            }
        } else if (appBankInput == 3) {
            bankAccountClasses.transactions(bankAccountClasses.mainBankAccountNumber);
            System.out.println("Bank Account Balances for : " + bankAccountClasses.mainBankAccountNumber);
            System.out.println("**********************************");

            System.out.println("**********************************");
            System.out.println("Checking balance of : " + bankAccountClasses.checkingAcctBalance);
            System.out.println("Saving balance of : " + bankAccountClasses.savingAcctBalance);
            System.out.println("**********************************");

        } else if (appBankInput == 4) {
            System.out.println("Thank for using bank of DodgeCoin");
            viewManager.quit();
        } else {
            System.out.println("Incorrect input try again");
            viewManager.navigator("BankAppMenu");
        }
    }
}



//    public void renderView() {
//        System.out.println("************* Thanks choosing the login in options ************* ");
//        System.out.println("Accessing your account now...");
//        System.out.println("________________________________________________________");
//        String firstName = viewManager.getScanner().nextLine();
//        System.out.println("Enter your first name : " + firstName);
//        String lastName = viewManager.getScanner().nextLine();
//        System.out.println("Enter your last name : " + lastName);
//        int intialMenuInput = viewManager.getScanner().nextInt();
//        System.out.println("Please enter number here: " + intialMenuInput);
//        System.out.println("________________________________________________________");


