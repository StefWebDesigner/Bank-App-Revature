import Persistance.BankPogo;
import Persistance.BankRepo;
import Persistance.CreateMenuPogo;
import Utils.ContextStore;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class DepositCheckingMenu extends View {

    public DepositCheckingMenu() {
        viewName = "DepositCheckingMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() throws SQLException, IOException {


        System.out.println("*****************************");
        System.out.println("To Deposit Money to the Checking Account Menu");
        System.out.println("*****************************");

        //TO RETIEVE THEIR  INFORMATION

        BankRepo bankRepo = new BankRepo();

        System.out.printf("Your Current Checking Account is: $ %.2 \n",  ContextStore.getCurrentAccount().getCheckingAcctBalance());
        System.out.println("*****************************");

        //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT

        System.out.println("Deposit Amount: ");
        double amount = viewManager.getScanner().nextDouble();
        System.out.printf("Entered Amount: $ %.2", amount);

        // EXECUTE FUNCTION

        if (amount >= 0 ) {

//            ContextStore.getCurrentAccount().getCheckingAcctBalance() = checkingAcctBalance + amount;

           double finalBalance = ContextStore.getCurrentAccount().getCheckingAcctBalance()  + amount;

            //SHOW THEIR OFFICAL TRANACTION & CURRENT BALANCE

//        System.out.println("++++++++++++++++++++++++++++++");
//        System.out.println("Deposit was sucessful");
//        System.out.println("Your current Checking Account is : $ %.2f", finalBalance);
//        System.out.println("*****************************");

            ContextStore.getCurrentAccount().getCheckingAcctBalance(); //I FEEL LIKE i SHOULD BE PUTTING finalBalance
                                                                        // in
            bankRepo.update(ContextStore.getCurrentAccount());

        }

//        BankPogo bankPogo = new BankPogo(checkingAcctBalance);
//        BankRepo bankRepo = new BankRepo();
//        bankRepo.create(bankPogo);
//        bankRepo.update(bankPogo);


        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("BankAppMainMenu");



    }



}
