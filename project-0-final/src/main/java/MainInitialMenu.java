import Persistance.CreateMenuPogo;
import Persistance.CreateMenuRepo;
import Utils.ContextStore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainInitialMenu extends View { //WHY IS A CLASS NAME BEING A METHOD OR COULD IT BE IT NAMED ANTYING ELSE

//    String permFirstName = null;
//    String permLastName = null;
//    String username;
//    String permPassword = null;
//    String permEmail = null;
//    String permCountry = null;
//    String permAddressStreet = null;
//    String permAddressState = null;
//    int permAddressZipCode = 0;

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
//
//        System.out.println(intialMenuInput);
//
////        switch (intialMenuInput) {    ///THIS CASE STATEMENT DOESN'T WORK BUT THE IF
////                                        WORKS IN THE BOTTOM WORKS WHEN COMPLETED THE REGRESTRATION OF TEH
//                                            //THE STUFF
////            case 1:
////                viewManager.navigator("MainInitialLoginMenu");
////                break;
////            case 2:
////                viewManager.navigator("MainInitialCreateMenu");
////                break;
////            case 3:
////                viewManager.navigator("BankAppMenu");
////
////        }
//
        if (intialMenuInput == 1) {
            viewManager.navigator("MainInitialLoginMenu");
        } else if  (intialMenuInput == 2) {
            viewManager.navigator("MainInitialCreateMenu");
            System.out.println("________________________________________________________");
        } else if  (intialMenuInput == 0) { ////FOR TESTING PURPOSES ONLY
            viewManager.navigator("BankAppMenu");
            System.out.println("________________________________________________________");
        } else {
            System.out.println("Wrong input, try again");
        }
//            System.out.println("________________________________________________________");
//
//            //PART 1 OF THE CREATING AN ACCOUNT
//            System.out.println("***********************************************");
//            System.out.println("Enter your first name : ");
//            String firstName = viewManager.getScanner().nextLine();
//            System.out.println(firstName);
//            System.out.println("\n");
//            System.out.println("***********************************************");
//
//            System.out.println("***********************************************");
//            System.out.println("Enter your last name : ");
//            String lastName = viewManager.getScanner().nextLine();
//            System.out.println("\n");
//            System.out.println("***********************************************");
//
//            System.out.println("***********************************************");
//            System.out.println("Enter your email: ");
//            String email = viewManager.getScanner().nextLine();
//            //THIS IS THE BETTER APPROACH BUT MATCHES CANT BE A BOOLENA AND MATCH RESULTS DOES WORK LIKE THAT TOO
////        String regex = "^([0-9a-zA-Z.]+@[0-9a-zA-Z]+[.][a-zA-Z]+){1,40}$"; //EMAIL FOR FORMATING
//            //            String regex = "^([0-9a-zA-Z.]+@[0-9a-zA-Z]+[.][a-zA-Z]+){1,40}$"; //EMAIL FOR FORMATING
//            String regex = ""; //TEMPOARTY
//            System.out.println("***********************************************");
//
//            //I need to validate all this information given to validate if the program can go futher
//            System.out.println("________________________________________________________");
//            System.out.println("Thanks " + firstName + " " + lastName);
//            System.out.println("We are almost finished. Just a bits of information more....");
//
//            System.out.println("***********************************************");
//            System.out.println("Make up a username :");
//            String username = viewManager.getScanner().nextLine();
//            System.out.println("***********************************************");
//
//            System.out.println("Make a password :");
//            String password = viewManager.getScanner().nextLine();
//            System.out.println(password);
//            System.out.println("***********************************************");
//
//            System.out.println("\n");
//            System.out.println("***********************************************");
//            System.out.println("Country : (Example US) ");
//            String country = viewManager.getScanner().nextLine();
//            System.out.println("***********************************************");
//
//
//            System.out.println("***********************************************");
//            System.out.println("Street Address : ");
//            String addressStreet = viewManager.getScanner().nextLine();
//            System.out.println("***********************************************");
//
//            System.out.println("***********************************************");
//            System.out.println("State( For example : LA) ");
//            String addressState = viewManager.getScanner().nextLine();
//            System.out.println("***********************************************");
//
//            System.out.println("***********************************************");
//            System.out.println("Zipcode : ");
//            int addressZipCode = viewManager.getScanner().nextInt();
//            viewManager.getScanner().nextLine();
//            System.out.println("***********************************************");
//
////            the order of the parameter in this make the differenece >>> %$%copy this over
//            CreateMenuPogo newUser = new CreateMenuPogo(username, password, firstName, lastName, email, country, addressStreet, addressState, addressZipCode);
//            CreateMenuRepo repo = new CreateMenuRepo();
//            repo.create(newUser);
//
//            firstName = permFirstName;
//            lastName = permLastName;
//            password = permPassword;
//            email = permEmail;
//            country = permCountry;
//            addressStreet = permAddressStreet;
//            addressState = permAddressState;
//            addressZipCode = permAddressZipCode;
//
//
////            CreateMenuPogo newUser = new CreateMenuPogo(username, permPassword, permFirstName, permLastName, permEmail, permCountry, permAddressStreet, permAddressState, permAddressZipCode);
////            CreateMenuRepo repo = new CreateMenuRepo();
////            repo.create(newUser);
//
//            ContextStore.setCurrentUser(newUser);
//
//            viewManager.navigator("MainIntialLoginMenu");
//
////            CreateMenuPogo testObject = new CreateMenuPogo(username, permPassword, permFirstName, permLastName, permEmail, permCountry, permAddressStreet, permAddressState, permAddressZipCode);
////            CreateMenuRepo testRepo = new CreateMenuRepo();
////           testRepo.create(testObject);
//
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        } else {
//            viewManager.quit();
//        }
//                //STORE THE RESPONSE INTO THE A DATA STORE
//
//                //GET THE CODE WORKIGN THEN ADD THE DATA STORE
////        if (intialMenuInput == 1) {
////            viewManager.navigator("MainInitialLoginMenu");
////        } else if (intialMenuInput == 2) {
////            viewManager.navigator("MainInitialCreateMenu");
////        }
//
//
//
        }
//
    }