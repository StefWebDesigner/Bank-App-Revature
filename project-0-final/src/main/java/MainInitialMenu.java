import Persistance.CreateMenuPogo;
import Persistance.CreateMenuRepo;
import Utils.ContextStore;
import java.io.IOException;
import java.sql.SQLException;


public class MainInitialMenu extends View {

    public MainInitialMenu() {
        viewName = "MainInitialMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() throws SQLException, IOException {
        System.out.println("************* WELCOME TO BANK OF AMERICA ************* ");
        System.out.println("How may we help you today?");
        System.out.println("________________________________________________________");
        System.out.println("1 - Login into an account");
        System.out.println("2 - Create an account");

        System.out.println("Please enter number here: ");
        int intialMenuInput = viewManager.getScanner().nextInt();
        viewManager.getScanner().nextLine();

        if (intialMenuInput == 1) {
            viewManager.navigator("MainInitialLoginMenu");
        } else if  (intialMenuInput == 2) {
            viewManager.navigator("MainInitialCreateMenu");
            System.out.println("________________________________________________________");
        } else if  (intialMenuInput == 0) { ////FOR TESTING PURPOSES ONLY
            viewManager.navigator("BankAppMainMenu");
            System.out.println("________________________________________________________");
        } else {
            System.out.println("Wrong input, try again");
        }

        }
    }