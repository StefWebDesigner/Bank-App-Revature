import Persistance.BankRepo;
import Utils.ContextStore;

public class DepositSavingMenu extends View {

        public DepositSavingMenu() {
            viewName = "DepositSavingMenu";
            viewManager = ViewManager.getViewManager();

        }

        public void renderView() {
            System.out.println("*****************************");
            System.out.println("To Deposit Money to the Saving Account Menu");
            System.out.println("*****************************");

            //TO RETIEVE THEIR  INFORMATION
//
//            BankRepo bankDepoRepo = new BankRepo();
//
//            //SHOW THEIR CURRENT BALANCE BY GETTER METHODS
//            ContextStore.getCurrentAccount(); //THIS NEEDS TO GET THE CHECKING ACCOUNT??
//            System.out.printf("Your Current Checking Account is: $ %.2 \n", savingAcctBalance);
//            System.out.println("*****************************");
//
//            //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT
//
//            System.out.println("Saving Amount: ");
//            double amount = viewManager.getScanner().nextDouble();
//            System.out.printf("Entered Amount: $ %.2", amount);
//
//            // EXECUTE FUNCTION
//
//            //get the checkingAcctBalance
//            ContextStore.getCurrentAccount().savingAcctBalance();
//            //then need it to execute
//            savingAcctBalance = savingAcctBalance + amount;
//
//            //SHOW THEIR OFFICAL TRANACTION & CURRENT BALANCE
//
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Deposit was sucessful");
//            System.out.println("Your current Checking Account is : $ %.2f", savingAcctBalance);
//            System.out.println("*****************************");
//
//
//            ContextStore.getCurrentAccount().setSavingAcctBalance();
//            BankRepo.update(ContextStore.getCurrentAccount());


            //GO ABOUT TO THE MAIN MENU
            viewManager.navigator("BankAppMainMenu");



        }



}
