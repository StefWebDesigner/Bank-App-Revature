package View;

import Persistance.BankAccountModel;
import Persistance.ClientInformationModel;
import Utils.ContextStore;
import Repo.BankAccountRepo;
import Repo.ClientInformationRepo;

import java.io.IOException;
import java.sql.SQLException;

public class MainInitialLoginMenu extends View {
    public MainInitialLoginMenu() {
        viewName = "menu.MainInitialLoginMenu";
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


        ClientInformationRepo repo = new ClientInformationRepo();
        ClientInformationModel newUser = repo.authenticate(username, password);
        if (newUser == null) {
            System.out.println("Incorrect information --- please try again");
            viewManager.navigator("menu.MainInitialMenu");
            return;
        }

        ContextStore.setCurrentUser(newUser);
        BankAccountRepo bankAccountRepo = new BankAccountRepo();
        BankAccountModel bankAccount = bankAccountRepo.read(newUser.getId());
        ContextStore.setCurrentAccount(bankAccount);
        viewManager.navigator("menu.BankAppMainMenu");

//        ContextStore.setCurrentUser(currentUser);


    }
}



