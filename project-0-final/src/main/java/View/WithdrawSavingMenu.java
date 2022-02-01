package View;

import Persistance.BankAccountModel;
import Repo.BankAccountRepo;
import Utils.ContextStore;

import java.io.IOException;
import java.sql.SQLException;

public class WithdrawSavingMenu extends View {

    public WithdrawSavingMenu() {
        viewName = "menu.WithdrawSavingMenu";
        viewManager = ViewManager.getViewManager();

    }

    public void renderView() throws SQLException, IOException {
        System.out.println("*****************************");
        System.out.println("To withdraw Money to the Saving Account Menu");
        System.out.println("*****************************");

        BankAccountRepo bankAccountRepo = new BankAccountRepo();

        //SHOW THEIR CURRENT BALANCE BY GETTER METHODS
//        ContextStore.getCurrentAccount(); //THIS NEEDS TO GET THE CHECKING ACCOUNT??
        System.out.printf("Your Current Saving Account is: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
        System.out.println("*****************************");

        //TO TAKE THEIR INPUT AMOUNT THEY WANT TO DEPOSIT

        System.out.println("Withdraw Amount: ");
        double amount = viewManager.getScanner().nextDouble();
        System.out.printf("Entered Amount: $ %.2f", amount);

        if(amount > ContextStore.getCurrentAccount().getSavingAcctBalance()) {

            System.out.println("You have reached your overdraw");
            System.out.printf("Your Current Saving Account is: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
            System.out.println("*****************************");


        } else {

            BankAccountModel bankAccount = ContextStore.getCurrentAccount();
            bankAccount.setSavingAcctBalance((bankAccount.getSavingAcctBalance() - amount));
            bankAccountRepo.update(ContextStore.getCurrentAccount());

            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Withdraw was sucessful");
            System.out.printf("Your Current Saving Account is: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
            System.out.println("*****************************");

        }

        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("menu.BankAppMainMenu");


    }
}



