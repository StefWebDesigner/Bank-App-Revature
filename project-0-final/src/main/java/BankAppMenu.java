import java.util.Scanner;

public class BankAppMenu extends View {

    public BankAppMenu() {
        viewName = "BankAppMenu";
        viewManager = ViewManager.getViewManager();
    }

    //IT'S TIME  MADE THIS AFUCKGIN POGOG!!!!!
//is it nesisary to do the do while loop anymore
    public void renderView() {

        int appBankInput;
        do {
            System.out.println("Welcome to Bank of DodgeCoin");
            //THIS IS WHERE TO ENTER IF TO CREATE AN ACCOUNT OR OR LOGIN WITH
            //I NEED TO LEARN HOW TO DO LIST SO SKIP THIS FOR NOW
            System.out.println("----------------------------------");
            System.out.println(" #1 For Deposite Activities");
            System.out.println(" #2 For Withdraw Activities");
            System.out.println(" #3 View your Current Account");
            System.out.println(" #4 Close application");
            System.out.println("Please choose an option");
            System.out.println("----------------------------------");

            appBankInput = viewManager.getScanner().nextInt();
            ;

            //how to connect the user input to the switch condition

            if (appBankInput == 1) {
                System.out.println("You have selected the deposite option:");
                System.out.println("Your current balance is : " + bankAccountClasses.balance);
                System.out.println("How much do you want to deposit : ");
                bankAccountClasses.amount = viewManager.getScanner().nextInt();
                //I'm trying to make this input equal balance
                //am I better making balance a scope value but then how will that work with class
                System.out.println("**********************************");
                bankAccountClasses.deposit(bankAccountClasses.balance, bankAccountClasses.amount);
                System.out.println("**********************************");
                System.out.println("----------------------------------");
            } else if (appBankInput == 2) {
                System.out.println("You have selected the deposite option:");
                System.out.println("Your current balance is : " + bankAccountClasses.balance);
                System.out.println("How much do you want to withdaw : ");
                bankAccountClasses.amount = viewManager.getScanner().nextInt();
                System.out.println("**********************************");
                bankAccountClasses.withdraw(bankAccountClasses.balance, bankAccountClasses.amount);
                System.out.println("**********************************");
                System.out.println("----------------------------------");
            } else if (appBankInput == 3) {
                System.out.println("You have selected to view your Current balance:");
                System.out.println("**********************************");
                System.out.println("Your current balance is : " + bankAccountClasses.balance);
                System.out.println("**********************************");
                System.out.println("----------------------------------");
            } else {
                System.out.println("You have selected to close the application.");
                System.out.println("Thanks for banking with Dodgecoin.");
                break;
            }
        } while (appBankInput != 4);

        //STORE THE RESPONSE INTO THE A DATA STORE

        //GET THE CODE WORKIGN THEN ADD THE DATA STORE
//        viewManager.navigator("BankAppMenu");
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



}

