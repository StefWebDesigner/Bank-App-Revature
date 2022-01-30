import Persistance.BankRepo;
import Utils.ContextStore;

public class DepositCheckingMenu extends View {

    public DepositCheckingMenu() {
        viewName = "DepositCheckingMenu";
        viewManager = ViewManager.getViewManager();

    }

    public void renderView() {
        System.out.println("*****************************");
        System.out.println("To Deposit Money to the Checking Account Menu");
        System.out.println("*****************************");
//
//        //TO RETIEVE THEIR  INFORMATION
//
//        BankRepo bankDepoCheckRepo = new BankRepo();
//        //get the checkingAcctBalance
//        ContextStore.getCurrentAccount().getCheckingAcctBalance();
//
//
//        //SHOW THEIR CURRENT BALANCE BY GETTER METHODS
////        ContextStore.getCurrentAccount(); //THIS NEEDS TO GET THE CHECKING ACCOUNT??
//        System.out.printf("Your Current Checking Account is: $ %.2 \n", checkingAcctBalance);
//        System.out.println("*****************************");
//
//        //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT
//
//        System.out.println("Deposite Amount: ");
//        double amount = viewManager.getScanner().nextDouble();
//        System.out.printf("Entered Amount: $ %.2", amount);
//
//        // EXECUTE FUNCTION
//
//        //get the checkingAcctBalance
////        ContextStore.getCurrentAccount().checkingAcctBalance();
//        //then need it to execute
//        checkingAcctBalance = checkingAcctBalance + amount;
//
//        //SHOW THEIR OFFICAL TRANACTION & CURRENT BALANCE
//
//        System.out.println("++++++++++++++++++++++++++++++");
//        System.out.println("Deposit was sucessful");
//        System.out.println("Your current Checking Account is : $ %.2f", checkingAcctBalance);
//        System.out.println("*****************************");
//
//
//        ContextStore.getCurrentAccount().setCheckingAcctBalance();
//        BankRepo.update(ContextStore.getCurrentAccount());


        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("BankAppMainMenu");



    }



}
