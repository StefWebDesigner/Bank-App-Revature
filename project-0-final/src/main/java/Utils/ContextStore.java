package Utils;

import Persistance.BankAccountModel;
import Persistance.ClientInformationModel;

public class ContextStore {
    //THESE VARIABLES ARE IN SCOPE
    private static ClientInformationModel currentUser;
    private static BankAccountModel currentAccount;

    //TO BE SETTING THIS AS THE CURRENT USER

    public static ClientInformationModel getCurrentUser() {

        return currentUser;
    }

    public static void setCurrentUser(ClientInformationModel user) { //user is in scope

        currentUser = user;
    }


    public static BankAccountModel getCurrentAccount() {

        return currentAccount;
    }


    public static void setCurrentAccount(BankAccountModel currentAccount) {
        ContextStore.currentAccount = currentAccount;
    }


}
