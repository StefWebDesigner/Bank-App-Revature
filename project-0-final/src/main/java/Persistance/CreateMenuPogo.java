package Persistance;

public class CreateMenuPogo {
    //CREATE MENU VARIABLES
    CreateMenuPogo createMenuPogo = new CreateMenuPogo();
    private Integer client_id;
    private String username;
    private String permFirstName;
    private String permLastName;
    private String permCountry;
    private String permAddressStreet;
    private String permAddressState;
    private Integer permAddressZipCode;

    public CreateMenuPogo() {
    }

    public CreateMenuPogo(Integer client_id, String username, String permFirstName, String permLastName, String permCountry, String permAddressStreet, String permAddressState, Integer permAddressZipCode) {
        this.client_id = client_id;
        this.username = username;
        this.permFirstName = permFirstName;
        this.permLastName = permLastName;
        this.permCountry = permCountry;
        this.permAddressStreet = permAddressStreet;
        this.permAddressState = permAddressState;
        this.permAddressZipCode = permAddressZipCode;
    }

        //SETTERS
        //WILL I NEED ALL OF THESE GETTER & TO BE CONTINUED


        public Integer getId() {
            return client_id;
        }

        public String getUsername() {
            return username;
        }


        public String getFirstName() {
            return permFirstName;
        }

        public String getLastName() {
            return permLastName;
        }

        public String getCountry() {
            return permCountry;
        }

        public String getAddressStreet() {
            return permAddressStreet;
        }

        public String getAddressState() {
            return permAddressState;
        }

        public Integer getAddressZipCode() {
            return permAddressZipCode;
        }

        //SETTERS

        public void setId() {
            this.client_id = client_id;
        }

        public void setUsername() {
            this.username = username;
        }

        public void setFirstName() {
            this.permFirstName = permFirstName;
        }

        public void setLastName() {
            this.permLastName = permLastName;
        }

        public void setCountry() {
            this.permCountry = permCountry;
        }

        public void setAddressStreet() {
            this.permAddressStreet = permAddressStreet;
        }

        public void setAddressState () {
            this.permAddressState = permAddressState;
        }

        public void setAddressZipCode () {
            this.permAddressZipCode = permAddressZipCode;

        }


    }


