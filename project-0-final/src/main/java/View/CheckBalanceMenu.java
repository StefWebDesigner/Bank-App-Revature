package View;

import Repo.BankAccountRepo;
import Utils.ContextStore;

public class CheckBalanceMenu extends View {

    public CheckBalanceMenu() {
        viewName = "menu.CheckBalanceMenu";
        viewManager = ViewManager.getViewManager();

    }

    public void renderView() {

        System.out.println("*****************************");
        System.out.println("The Check Overall Balance Menu");
        System.out.printf("You Current Checking Account: $ %.2f \n", ContextStore.getCurrentAccount().getCheckingAcctBalance());
        System.out.printf("You Current Saving Account: $ %.2f \n", ContextStore.getCurrentAccount().getSavingAcctBalance());
        System.out.println("*****************************");

        //GO ABOUT TO THE MAIN MENU
        viewManager.navigator("menu.BankAppMainMenu");

    }

}
