import Persistance.CreateMenuPogo;
import Persistance.CreateMenuRepo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainInitialCreateMenu extends View {

    public MainInitialCreateMenu() {
        viewName = "MainInitialCreateMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() throws SQLException, IOException {

        System.out.println("************* Thanks for your interest in registrating for an account ************* ");
        System.out.println("Providing information now needed to sign up Today!");
        System.out.println("Let's get you started today with some quick details");
        System.out.println("________________________________________________________");


        //PART 1 OF THE CREATING AN ACCOUNT
        System.out.println("***********************************************");
        System.out.println("Enter your first name : ");
        String firstName = (viewManager.getScanner().nextLine());
        System.out.println(firstName);

        System.out.println("***********************************************");
        System.out.println("Enter your last name : ");
        String lastName = viewManager.getScanner().nextLine();
        System.out.println(lastName);

        System.out.println("***********************************************");
        System.out.println("Enter your email: ");
        String email = viewManager.getScanner().nextLine();
        System.out.println(email);

//
//        //THIS IS THE BETTER APPROACH BUT MATCHES CANT BE A BOOLENA AND MATCH RESULTS DOES WORK LIKE THAT TOO
//            String regex = "^([0-9a-zA-Z.]+@[0-9a-zA-Z]+[.][a-zA-Z]+){1,40}$"; //EMAIL FOR FORMATING
//        //            String regex = "^([0-9a-zA-Z.]+@[0-9a-zA-Z]+[.][a-zA-Z]+){1,40}$"; //EMAIL FOR FORMATING
////            String regex = ""; //TEMPOARTY
//            Pattern pattern = Pattern.compile(regex); //SERVES TO COMPILE THE EXPRESSION TO THE PATTERN
//            Matcher matcher = pattern.matcher(email); //CREATED THE INSTANCE FOR THE MATCHER
//            if(matcher.matches() == true) {
//                  System.out.println("Email Corretctly formated" + matcher);
//                finalValEmail = true;
//                System.out.println(" Checked passed");
//            } else {
//                   System.out.println("Email Incorretctly formated");
//                finalValEmail = false;
//                System.out.println(" Checked failed");
//            }

        System.out.println("***********************************************");


        System.out.println("________________________________________________________");
        System.out.println("Thanks " + firstName + " " + lastName);
        System.out.println("We are almost finished. Just a bits of information more....");

        System.out.println("***********************************************");
        System.out.println("Make up a username :");
        String username = viewManager.getScanner().nextLine();
        System.out.println(username);
        System.out.println("***********************************************");

        System.out.println("Make a password :");
        String password = viewManager.getScanner().nextLine();
        System.out.println(password);

        System.out.println("***********************************************");
        System.out.println("Country : (Example US) ");
        String country = viewManager.getScanner().nextLine();
        System.out.println(country);

        System.out.println("***********************************************");
        System.out.println("Street Address : ");
        String addressStreet = viewManager.getScanner().nextLine();
        System.out.println(addressStreet);

        System.out.println("***********************************************");

        System.out.println("***********************************************");
        System.out.println("State( For example : LA) ");
        String addressState = viewManager.getScanner().nextLine();
        System.out.println(addressState);

        System.out.println("***********************************************");

        System.out.println("***********************************************");
        System.out.println("Zipcode : ");
        Integer addressZipCode = viewManager.getScanner().nextInt();
        viewManager.getScanner().nextLine();
        System.out.println(addressZipCode);

        System.out.println("***********************************************");

        System.out.println("===============");
        System.out.println("Thank for filling out the form. Processing the information now");
        System.out.println("Review the following information: ");

        System.out.println(firstName + " " + lastName);
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        System.out.println(country);
        System.out.println(addressStreet);
        System.out.println(addressState);
        System.out.println(addressZipCode);

        System.out.println("You account has been created! ");
        System.out.println("________________________________________________________");


        CreateMenuPogo user = new CreateMenuPogo(username, password, firstName, lastName, email, country, addressStreet, addressState, addressZipCode);
        CreateMenuRepo repo = new CreateMenuRepo();
        repo.create(user);



        viewManager.navigator("BankAppMainMenu");

        }

    }

