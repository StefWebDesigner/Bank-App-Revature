package View;

import Persistance.BankAccountModel;
import Repo.BankAccountRepo;
import Utils.ContextStore;

import java.io.IOException;
import java.sql.SQLException;

public class DepositSavingMenu extends View {

    public DepositSavingMenu() {
        viewName = "menu.DepositSavingMenu";
        viewManager = ViewManager.getViewManager();

    }

    public void renderView() throws SQLException, IOException {

        System.out.println("*****************************");
        System.out.println("To Deposit Money to the Saving Account Menu");
        System.out.println("*****************************");

        //TO RETIEVE THEIR  INFORMATION

        BankAccountRepo bankAccountRepo = new BankAccountRepo();

        System.out.printf("Your Current Saving Account is: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
        System.out.println("*****************************");

        //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT

        System.out.println("Deposit Amount: ");
        double amount = viewManager.getScanner().nextDouble();
        System.out.printf("Entered Amount: $ %.2f", amount);


        if (amount >= 0) {

            BankAccountModel bankAccount = ContextStore.getCurrentAccount();
            bankAccount.setSavingAcctBalance(bankAccount.getSavingAcctBalance() + amount);
            bankAccountRepo.update(ContextStore.getCurrentAccount()); // once the value is update in db

            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Deposit was sucessful");
            System.out.printf("Your Current Saving Account is: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
            System.out.println("*****************************");

        }

        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("menu.BankAppMainMenu");

    }

}