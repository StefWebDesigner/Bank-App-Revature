package View;

import Persistance.BankAccountModel;
import Utils.ContextStore;
import Repo.BankAccountRepo;

import java.io.IOException;
import java.sql.SQLException;

public class DepositCheckingMenu extends View {

    public DepositCheckingMenu() {
        viewName = "menu.DepositCheckingMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() throws SQLException, IOException {

        System.out.println("*****************************");
        System.out.println("To Deposit Money to the Checking Account Menu");
        System.out.println("*****************************");

        //TO RETIEVE THEIR  INFORMATION

        BankAccountRepo bankAccountRepo = new BankAccountRepo();

        System.out.printf("Your Current Checking Account is: $ %.2f \n", ContextStore.getCurrentAccount().getCheckingAcctBalance());
        System.out.println("*****************************");

        //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT

        System.out.println("Deposit Amount: ");
        double amount = viewManager.getScanner().nextDouble();
        System.out.printf("Entered Amount: $ %.2f", amount);


        if (amount >= 0) {

            BankAccountModel bankAccount = ContextStore.getCurrentAccount();
            bankAccount.setCheckingAcctBalance(bankAccount.getCheckingAcctBalance() + amount);
            bankAccountRepo.update(ContextStore.getCurrentAccount()); // once the value is update in db

            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Deposit was sucessful");
            System.out.printf("Your Current Checking Account is: $ %.2f \n", ContextStore.getCurrentAccount().getCheckingAcctBalance());
            System.out.println("*****************************");

        }

        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("menu.BankAppMainMenu");

    }

}
