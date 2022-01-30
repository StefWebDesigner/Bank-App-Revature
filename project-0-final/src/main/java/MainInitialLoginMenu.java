import Persistance.CreateMenuPogo;
import Utils.ContextStore;

public class MainInitialLoginMenu extends View {
    public MainInitialLoginMenu() {
        viewName = "MainInitialLoginMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() {
        System.out.println("************* Thanks choosing the login in options ************* ");
        System.out.println("Accessing your account now...");
        System.out.println("________________________________________________________");
        System.out.println("Enter your username : ");
        String username = viewManager.getScanner().nextLine();

        System.out.println("Enter your password : ");
        String password = viewManager.getScanner().nextLine();
        //ADD A VALIDATING CONDITION HERE
        //TEMPORARLY ADDING THIS FOR SAKE PURPOSES
        System.out.println("________________________________________________________");

        //STORE THE RESPONSE INTO THE A DATA STORE
        /*
        Write an auth script (SQL) in the user creation repo. This script should query the database for client_information
        You want to say something like "SELECT * FROM client_information WHERE username = ?" <- parameterize it and execute...
        Then you will receive a resultset with either 0 or 1 user in it. Now check that the returned user (if any) matches the given password.

        Then finish marhsalling the other database data from the table into a POJO, and store that pojo as the current user
        in he context store.

        You will also need to complete the context store. Simply create static fields for things
        to store (like a user POJO) and getters/setters for it
         */
        CreateMenuPogo user = new CreateMenuPogo(username, password);
        new ContextStore();

//        System.out.println("________________________________________________________");
//        System.out.println(firstName + lastName + " have logged in successfully");
//        System.out.println("________________________________________________________");

        if(user == null){
            System.out.println("Incorect information --- please try again");
            viewManager.navigator("MainInitialMenu");
            return;

        }

            ContextStore.setCurrentUser(user);
            viewManager.navigator("BankAppMainMenu");
    }
}



