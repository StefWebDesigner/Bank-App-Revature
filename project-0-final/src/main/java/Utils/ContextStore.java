package Utils;

import Persistance.CreateMenuPogo;

public class ContextStore {

    private static CreateMenuPogo currentUser;

    public static void setCurrentUser(CreateMenuPogo user) {
        currentUser = user;
    }


    public static CreateMenuPogo getCurrentUser() {
        return currentUser;
    }

}
