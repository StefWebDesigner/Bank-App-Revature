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
        System.out.println("You have logged in successfully");
        System.out.println("________________________________________________________");

        //STORE THE RESPONSE INTO THE A DATA STORE
        CreateMenuPogo repo = new CreateMenuPogo(username, password);
        new ContextStore();
//        new ContextStore(username, password);

        //NOT WORKING!!!!!""£"£"£"
//        if(!user == null){
//            System.out.println("Incorrect Credentials");
//            viewManager.navigator("MainInitialMenu");
//
//        }

        //GET THE CODE WORKIGN THEN ADD THE DATA STORE
            viewManager.navigator("BankAppMenu");
    }
}



