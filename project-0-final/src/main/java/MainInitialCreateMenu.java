//import Persistance.CreateMenuPogo;
//import Persistance.CreateMenuRepo;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class MainInitialCreateMenu extends View {
//
//    public MainInitialCreateMenu() {
//        viewName = "MainInitialCreateMenu";
//        viewManager = ViewManager.getViewManager();
//    }
//
//    public void renderView() throws SQLException, IOException {
//
//        //VARIABLES IN SCOPE
//        boolean finalValFirstName;
//        boolean finalValLastName;
//        boolean finalValUserName;
//        boolean finalValPassword;
//        boolean finalValEmail;
//        boolean finalValCountry;
//        boolean finalValaddressStreet;
//        boolean finalValaddressState;
//        boolean finalValaddressZipCode;
//
//        //POGO VARIABLES
//        Integer id;
//        String permFirstName = null;
//        String permLastName = null;
//        String username;
//        String permPassword = null;
//        String permEmail = null;
//        String permCountry = null;
//        String permAddressStreet = null;
//        String permAddressState = null;
//        int permAddressZipCode = 0;
//
//        System.out.println("************* Thanks for your interest in registrating for an account ************* ");
//        System.out.println("Providing information now needed to sign up Today!");
//        System.out.println("Let's get you started today with some quick details");
//        System.out.println("________________________________________________________");
//
//
//        //PART 1 OF THE CREATING AN ACCOUNT
//        System.out.println("***********************************************");
//        System.out.println("Enter your first name : ");
//        String firstName = (viewManager.getScanner().nextLine());
//        if (firstName != null || firstName.chars().allMatch(Character::isLetter)) {   //its not allow me to thpe before
//            //reaching the final condition
//            finalValFirstName = true;
//            System.out.println(" Checked passed");
//        } else {
//            finalValFirstName = false;
//            System.out.println("Please only enter letters in your name");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//
////        viewManager.getScanner().nextLine();
//        System.out.println("\n");
//
//
//        System.out.println("***********************************************");
//        System.out.println("Enter your last name : ");
//        String lastName = viewManager.getScanner().nextLine();
//        System.out.println("\n");
//        if (lastName != null || lastName.chars().allMatch(Character::isLetter)) {   //its not allow me to thpe before
//            //reaching the final condition
//            finalValLastName = true;
//            System.out.println(" Checked passed");
//        } else {
//            finalValLastName = false;
//            System.out.println("Please only enter leters in your name");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//
//        System.out.println("***********************************************");
//        System.out.println("Enter your email: ");
//        String email = viewManager.getScanner().nextLine();
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
//
//
//
//        System.out.println("***********************************************");
//
//
//        //I need to validate all this information given to validate if the program can go futher
//        System.out.println("________________________________________________________");
//        System.out.println("Thanks " + firstName + " " + lastName);
//        System.out.println("We are almost finished. Just a bits of information more....");
//
//        System.out.println("***********************************************");
//        System.out.println("Make up a username :");
//        username = viewManager.getScanner().nextLine();
//        if (username != (null)) {
//            finalValUserName = true;
//            System.out.println(" Checked passed");
//        } else {
//            finalValUserName = false;
//            System.out.println("Please give yourseld a username");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//        System.out.println("Make a password :");
//        String password = viewManager.getScanner().nextLine();
//        if (password != (null)) {
//            finalValPassword = true;
//            System.out.println(" Checked passed");
//        } else {
//            finalValPassword = false;
//            System.out.println("Please give yourseld a username");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//
//        System.out.println("\n");
//        System.out.println("***********************************************");
//        System.out.println("Country : (Example US) ");
//        String country = viewManager.getScanner().nextLine();
//        //if they enter a UK account --- store that in a variable for the zipcode
//        if (country.equals("US")) {
//            finalValCountry = true;
//            System.out.println(" Checked passed");
//        } else {
//            System.out.println("Unfortunately you do not qualify for our backing services");
//            viewManager.navigator("MainInitalMenu");
//            finalValCountry = false;
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//
//        System.out.println("***********************************************");
//        System.out.println("Street Address : ");
//        String addressStreet = viewManager.getScanner().nextLine();
//        if (addressStreet != (null)) {
//            finalValaddressStreet = true;
//            System.out.println(" Checked passed");
//        } else {
//            finalValaddressStreet = false;
//            System.out.println("Please fill in the Street Address Entry form");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
////        ***(no false statements if false)***
//        System.out.println("***********************************************");
//        System.out.println("State( For example : LA) ");
//        String addressState = viewManager.getScanner().nextLine();
//        if (addressState != null || addressState.length() == 1 || addressState.chars().allMatch(Character::isLetter)) {
//            finalValaddressState = true;
//            System.out.println(" Checked passed");
//
//        } else {
//            finalValaddressState = false;
//            System.out.println("Please abbrivate the state.");
//        }
//        System.out.println("***********************************************");
//
//
//        //        ***(no false statements if false)***
//        System.out.println("***********************************************");
//        System.out.println("Zipcode : ");
//        Integer addressZipCode = viewManager.getScanner().nextInt();
//
//        if (addressZipCode != null || Character.isDigit(addressZipCode)) {
//            finalValaddressZipCode = true;
//            System.out.println(" Checked passed");
//
//        } else {
//            finalValaddressZipCode = false;
//            System.out.println("Please only enter number");
//            System.out.println(" Checked failed");
//        }
//        System.out.println("***********************************************");
//
//        viewManager.getScanner().nextLine();
//
//        //THE FINAL VALIDATION -- CHECK INFORMATION IS  PASSING EVERYTHING ALONG
//        if (finalValFirstName == true && finalValLastName == true && finalValUserName == true && finalValPassword == true && finalValEmail == true && finalValCountry == true && finalValaddressStreet == true && finalValaddressState == true && finalValaddressZipCode == true) {
//
//            System.out.println("===============");
//            System.out.println("Thank for filling out the form. Processing the information now");
//            System.out.println("Review the following information: ");
//
//            System.out.println(firstName + " " + lastName);
//            System.out.println(username);
//            System.out.println(password);
//            System.out.println(email);
//            System.out.println(country);
//            System.out.println(addressStreet);
//            System.out.println(addressState);
//            System.out.println(addressZipCode);
//
//            System.out.println("You account has been created! ");
//            System.out.println("________________________________________________________");
//            //TRANSFER THE VALIDAT INFORMATION
//
//             firstName = permFirstName;
//             lastName = permLastName;
//             password = permPassword;
//             email = permEmail;
//             country = permCountry;
//            addressStreet = permAddressStreet;
//            addressState = permAddressState;
//            addressZipCode = permAddressZipCode;
//
////            CreateMenuPogo newUser = new CreateMenuPogo(username, password, firstName, lastName, email, country, addressStreet, addressState, addressZipCode);
////            CreateMenuRepo newRepo = new CreateMenuRepo();
////            newUser.create(newUser);
//
//
//            CreateMenuPogo newUser = new CreateMenuPogo(username, permPassword, permFirstName, permLastName, permEmail, permCountry, permAddressStreet, permAddressState, permAddressZipCode);
//            CreateMenuRepo newRepo = new CreateMenuRepo();
//            newRepo.create(newUser);
//
////            System.out.println(temp);
//            //STORE THE RESPONSE INTO THE A DATA STORE
//            //(LOOK THIS UP TO DATA BASE)
//
//            //GET THE CODE WORKIGN THEN ADD THE DATA STORE
//            viewManager.navigator("BankAppMenu");
//
//        } else {
//
//            System.out.println("**************************************************");
//            System.out.println("Information Entry Failed Please try again ");
//            System.out.println("**************************************************");
//
//            viewManager.navigator("MainInitalMenu");
//        }
//
//
//
//
//
//    }
//}
