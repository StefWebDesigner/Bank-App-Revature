public class MainInitialCreateMenu extends View {

    public MainInitialCreateMenu() {
        viewName = "MainInitialCreateMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() {

        //VARIABLES IN SCOPE
        boolean finalValFirstName;
        boolean finalValLastName;
        boolean finalValCountry;
        boolean finalValaddressStreet;
        boolean finalValaddressState;
        boolean finalValaddressZipCode;

        //POGO VARIABLES
        String permFirstName = null;
        String permLastName = null;
        String permCountry = null;
        String permAddressStreet = null;
        String permAddressState = null;
        int permAddressZipCode = 0;

        System.out.println("************* Thanks for your interest in registrating for an account ************* ");
        System.out.println("Providing information now needed to sign up Today!");
        System.out.println("Let's get you started today with some quick details");
        System.out.println("________________________________________________________");

        //PART 1 OF THE CREATING AN ACCOUNT
        String firstName = (viewManager.getScanner().nextLine());
        System.out.println("Enter your first name : ");
        if (firstName != null || firstName.chars().allMatch(Character::isLetter)) {   //its not allow me to thpe before
            //reaching the final condition
            finalValFirstName = true;
        } else {
            finalValFirstName = false;
            System.out.println("Please only enter leters in your name");
        }

        String lastName = viewManager.getScanner().nextLine();
        System.out.println("Enter your last name : ");

        if (lastName != null || lastName.chars().allMatch(Character::isLetter)) {   //its not allow me to thpe before
            //reaching the final condition
            finalValLastName = true;
        } else {
            finalValLastName = false;
            System.out.println("Please only enter leters in your name");
        }

        String tempEmail = viewManager.getScanner().nextLine();
        System.out.println("Enter your email: ");
        //ADD EMAIL FORMATING / VALIDATING MEA
        //??? IT SKIPS THIS TOGETEHR
//        if (true) {
//
//            System.out.println("Hold the next que back");
//        } else {
//
//            System.out.println("back to the drawling board");
//        }

        //THIS IS THE BETTER APPROACH BUT MATCHES CANT BE A BOOLENA AND MATCH RESULTS DOES WORK LIKE THAT TOO
//            String regex = "^(.+)@(.+)$"; //EMAIL FOR FORMATING
//            Pattern pattern = Pattern.compile(regex); //SERVES TO COMPILE THE EXPRESSION TO THE PATTERN
//            Matcher matcher = pattern.matcher(tempEmail); //CREATED THE INSTANCE FOR THE MATCHER
//            if(Matcher.matcher == true) {
//                  System.out.println("Email Corretctly formated" + matcher);
//              } else {
//                   System.out.println("Email Incorretctly formated");
////                public Matcher reset() //causes it to reset
//            }

        //I need to validate all this information given to validate if the program can go futher
        System.out.println("________________________________________________________");
        System.out.println("Thanks " + firstName + " " + lastName);
        System.out.println("We are almost finished. Just a bits of information more....");

        String country = viewManager.getScanner().nextLine();
        System.out.println("Country (For example : UK or US) : ");
        //if they enter a UK account --- store that in a variable for the zipcode
        if (country.equals("US")) {
            finalValCountry = true;
        } else if (country.equals("UK")) {
            System.out.println("Unfortunately you do not qualify for our backing services");
            finalValCountry = false;

        }
        String addressStreet = viewManager.getScanner().nextLine();
        System.out.println("Street Address : ");
        if (addressStreet != (null)) {
            finalValaddressStreet = true;
        } else {
            finalValaddressStreet = false;
            System.out.println("Please fill in the Street Address Entry form");
        }

        String addressState = viewManager.getScanner().nextLine();
        System.out.println("State( For example : LA) ");
        if (addressState != null || addressState.length() == 1 || addressState.chars().allMatch(Character::isLetter)) {
            finalValaddressState = true;
        } else {
            finalValaddressState = false;
            System.out.println("Please abbrivate the state.");
        }


//            String StatesArray[] = new String[50];
//            StatesArray[0].add(AL);
//        }
        //ADD THIS ONCE i MAKE MY CUSTOM ARRAY LIKE A ARARY LIST SO i CAN STOP THIS BULOCK!
//            { 'AL', 'AK', 'AS', 'AZ', 'AR', 'CA', 'CO', 'CT', 'DE', 'DC', 'FM', 'FL', 'GA', 'GU', 'HI', 'ID', 'IL', 'IN', 'IA', 'KS', 'KY', 'LA', 'ME', 'MH', 'MD', 'MA', 'MI', 'MN', 'MS', 'MO', 'MT', 'NE', 'NV', 'NH', 'NJ', 'NM', 'NY', 'NC', 'ND', 'MP', 'OH', 'OK', 'OR', 'PW', 'PA', 'PR', 'RI', 'SC', 'SD', 'TN', 'TX', 'UT', 'VT', 'VI', 'VA', 'WA', 'WV', 'WI', 'WY' };
        int addressZipCode = viewManager.getScanner().nextInt();
        System.out.println("Zipcode : ");
        if (addressZipCode != null) {
            finalValaddressZipCode = true;
        } else {
            finalValaddressZipCode = false;
            System.out.println("Please only enter leters in your name");
        }


        String gender = viewManager.getScanner().nextLine();
        System.out.println("what is your gender : MALE / FEMALE / TO NO SAY");

        //ADD MATCING VODE HERE...ACTUALLY TEH REGEX IS EASIER WITH THIS then damn matches(value)
        //OR JUST SCRAP THE ENTIRE THING

        System.out.println("Thank for filling out the form. Processing the information now");
        System.out.println("Review the following information: ");

        System.out.println(country);
        System.out.println(addressStreet);
        System.out.println(addressState);
        System.out.println(addressZipCode);
        System.out.println(gender);

        System.out.println("Having review the content, is this information correct");
        StringBuilder finalReviewInfo = new StringBuilder(viewManager.getScanner().nextLine());
        //if yes...progress to the final validation --- collect all the true statements
        //required for passing

        //I can use the matcher find() to maybe find these values??????

        //THE FINAL VALIDATION -- CHECK INFORMATION IS  PASSING EVERYTHING ALONG
        if (finalValFirstName = true || finalValLastName = true || finalValCountry = true || finalValaddressStreet = true || finalValaddressState = true || finalValaddressZipCode = true)  {

            System.out.println("You account has been created! ");
            System.out.println("________________________________________________________");

            //TEMP GOING TO TO LET IS PASS FOR NOW AUTOMATIICLAY
            //<<< *** NEXT BEAST TO TACKLE ****
            //POGO VARIABLES
             firstName = permFirstName;
             lastName = permLastName;
             country = permCountry;
            addressStreet = permAddressStreet;
            addressState = permAddressState;
            addressZipCode = permAddressZipCode;


            //STORE THE RESPONSE INTO THE A DATA STORE

            //GET THE CODE WORKIGN THEN ADD THE DATA STORE
            viewManager.navigator("BankAppMenu");
        } else {
            System.out.println("Account was unable to be created. Try again");
            //have away to single out all the parts with a problem--- but sound like a lot of work
            //and to much bloody dreaming lol

        }
    }
}
