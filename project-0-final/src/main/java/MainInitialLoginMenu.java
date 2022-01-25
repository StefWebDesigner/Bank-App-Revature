public class MainInitialLoginMenu extends View {
    public MainInitialLoginMenu() {
        viewName = "MainInitialLoginMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() {
        System.out.println("************* Thanks choosing the login in options ************* ");
        System.out.println("Accessing your account now...");
        System.out.println("________________________________________________________");
        String username = viewManager.getScanner().nextLine();
        System.out.println("Enter your username : ");
        String password = viewManager.getScanner().nextLine();
        System.out.println("Enter your password : ");
        //ADD A VALIDATING CONDITION HERE
        //TEMPORARLY ADDING THIS FOR SAKE PURPOSES
        System.out.println("You have logged in successfully");
        System.out.println("________________________________________________________");

        //STORE THE RESPONSE INTO THE A DATA STORE

        //GET THE CODE WORKIGN THEN ADD THE DATA STORE
            viewManager.navigator("BankAppMenu");
    }
}



