import Persistance.CreateMenuPogo;
import Persistance.CreateMenuRepo;
import Utils.ContextStore;

import java.io.IOException;
import java.sql.SQLException;

public class MainInitialLoginMenu extends View {
    public MainInitialLoginMenu() {
        viewName = "MainInitialLoginMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() throws SQLException, IOException {
        System.out.println("************* Thanks choosing the login in options ************* ");
        System.out.println("Accessing your account now...");
        System.out.println("________________________________________________________");
        System.out.println("Enter your username : ");
        String username = viewManager.getScanner().nextLine();

        System.out.println("Enter your password : ");
        String password = viewManager.getScanner().nextLine();
        System.out.println("________________________________________________________");


        CreateMenuRepo repo = new CreateMenuRepo();
        CreateMenuPogo newUser = repo.authenticate(username, password);
        if(newUser == null){
            System.out.println("Incorect information --- please try again");
            viewManager.navigator("MainInitialMenu");
            return;
        }

        ContextStore.setCurrentUser(newUser);
        viewManager.navigator("BankAppMainMenu");

//        ContextStore.setCurrentUser(currentUser);


    }
}



