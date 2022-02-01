package Utils;

import Persistance.BankPogo;
import Persistance.CreateMenuPogo;

public class ContextStore {
    //THESE VARIABLES ARE IN SCOPE
    private static CreateMenuPogo currentUser;
    private static BankPogo currentAccount;

    //TO BE SETTING THIS AS THE CURRENT USER

    public static CreateMenuPogo getCurrentUser() {

        return currentUser;
    }

    public static void setCurrentUser(CreateMenuPogo user) { //user is in scope

        currentUser = user;
    }



    public static BankPogo getCurrentAccount() {

        return currentAccount;
    }


    public static void setCurrentAccount(BankPogo currentAccount) {
        ContextStore.currentAccount = currentAccount;
    }



}
