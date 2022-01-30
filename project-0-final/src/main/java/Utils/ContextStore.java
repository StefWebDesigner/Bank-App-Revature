package Utils;

import Persistance.BankPogo;
import Persistance.CreateMenuPogo;

public class ContextStore {

    private static CreateMenuPogo currentUser;
    private static BankPogo currentAccount;

    /*

    This is a pretend call from elsewhere to this method:
    ContextStore.setCurrentUser(anything_the_identifier_here_doesn't_matter);
     */

    //USER IS IN SCOPE AND CAN BE ANYTING --- FIGURE OUT A BETTER OF
    //NAMING STUFF
    public static void setCurrentUser(CreateMenuPogo user) {
        currentUser = user;
    }

    public static CreateMenuPogo getCurrentUser() {

        return currentUser;
    }

    public static void getCurrentAccount(BankPogo bank) {
        currentAccount = bank;
    }

    public static BankPogo getCurrentAccount() {
        return currentAccount;
    }


}
