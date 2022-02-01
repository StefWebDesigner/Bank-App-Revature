package Persistance;

import Utils.ConnectionManager;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateMenuRepo implements DataSourceCRUD<CreateMenuPogo> {

    //DON'T INCLIDE THE AUTO GENERATED KEYS IF IT IS CONTROLED BY THE TABLE
    public Integer create(CreateMenuPogo createMenuPogo) throws SQLException, IOException {
        //I believe I need to add all the parameters to the field
        String sql = "INSERT INTO client_information (username, password, firstName, lastName, email, country, addressStreet, addressState, addressZipCode) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//        pstmt.setInt(1, createMenuPogo.getId());
        pstmt.setString(1, createMenuPogo.getUsername());
        pstmt.setString(2, createMenuPogo.getPassword());
        pstmt.setString(3, createMenuPogo.getFirstName());
        pstmt.setString(4, createMenuPogo.getLastName());
        pstmt.setString(5, createMenuPogo.getEmail());
        pstmt.setString(6, createMenuPogo.getCountry());
        pstmt.setString(7, createMenuPogo.getAddressStreet());
        pstmt.setString(8, createMenuPogo.getAddressState());
        pstmt.setInt(9, createMenuPogo.getAddressZipCode());
        pstmt.executeUpdate();
        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {                                ////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
            return rs.getInt(1);                ///this is causing your problems man!!!!!!!!!
        }
        return -1;
    }

    @Override
    public CreateMenuPogo read(Integer id) throws SQLException, IOException {
        String sql = "SELECT * FROM client_information WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        CreateMenuPogo user = new CreateMenuPogo(); //THIS IS MARSHALING THE INFORMATION
        if (rs.next()) {
            user.setId(rs.getInt("client_id")); //I DON'T NEED TO HANDLE THIS...SO SHOULD IT BE HERE?
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
            user.setCountry(rs.getString("email"));
            user.setCountry(rs.getString("country"));
            user.setAddressStreet(rs.getString("addressStreet"));
            user.setAddressState(rs.getString("addressState"));
            user.setAddressZipCode(rs.getInt("addressZipCode"));
        } else {
            return null;
        }
        return null;
    }

    public CreateMenuPogo update(CreateMenuPogo createMenuPogo) throws SQLException, IOException {
        String sql = "UPDATE user SET username = ?, password = ?, firstName = ?, lastName = ?, email = ?, country = ?, addressStreet = ?, addressState = ?, addressZipCode = ?";
//        String sql = "UPDATE user SET client_id = ?, username = ?, password = ?, firstName = ?, lastName = ?, email = ?, country = ?, addressStreet = ?, addressState = ?, addressZipCode = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
//        pstmt.setInt(1, createMenuPogo.getId());
        pstmt.setString(2, createMenuPogo.getUsername());
        pstmt.setString(3, createMenuPogo.getPassword());
        pstmt.setString(4, createMenuPogo.getFirstName());
        pstmt.setString(5, createMenuPogo.getLastName());
        pstmt.setString(6, createMenuPogo.getEmail());
        pstmt.setString(7, createMenuPogo.getCountry());
        pstmt.setString(8, createMenuPogo.getAddressStreet());
        pstmt.setString(9, createMenuPogo.getAddressState());
        pstmt.setInt(10, createMenuPogo.getAddressZipCode());

        pstmt.executeUpdate();

        String verify = "SELECT * FROM user WHERE client_id = ?";
        PreparedStatement vstmt = ConnectionManager.getConnection().prepareStatement(verify);
        pstmt.setInt(1, createMenuPogo.getId());
        ResultSet rs = vstmt.executeQuery();

        if (rs.next()) {
            CreateMenuPogo verifiedUserModel = new CreateMenuPogo();
//            verifiedUserModel.setId(rs.getInt("client_id"));
            verifiedUserModel.setUsername(rs.getString("username"));
            verifiedUserModel.setPassword(rs.getString("password"));
            verifiedUserModel.setFirstName(rs.getString("firstName"));
            verifiedUserModel.setLastName(rs.getString("lastName"));
            verifiedUserModel.setEmail(rs.getString("email"));
            verifiedUserModel.setCountry(rs.getString("country"));
            verifiedUserModel.setAddressStreet(rs.getString("addressStreet"));
            verifiedUserModel.setAddressState(rs.getString("addressState"));
            verifiedUserModel.setAddressZipCode(rs.getInt("addressZipCode"));
            return verifiedUserModel;

        } else {

            return null;
        }
    }

    @Override
    public void delete(Integer client_id) throws SQLException, IOException {

        String sql = "DELETE FROM user WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, client_id);
        pstmt.executeUpdate();

        return;
    }

//ATTEMPT 1
//    public CreateMenuPogo authenticate(String username, String password) throws SQLException, IOException {
//        String sql = "SELECT * FROM client_information WHERE username = ?, password = ?"; // IS THIS UPPOSE TO ALSOE TAKE ALL PRAMTERS IF i ONLY NEED THE USER / PASSWORD
//        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
//        pstmt.setString(1, username);
//        pstmt.setString(2, password); //temp took out        ResultSet rs = pstmt.executeQuery();
//        ResultSet rs = pstmt.executeQuery();
//
//        if (rs.next()) {
//            CreateMenuPogo newUser = new CreateMenuPogo();
//
//            newUser.setUsername(rs.getString("username"));
//            newUser.setPassword(rs.getString("password"));
//            newUser.setFirstName(rs.getString("firstName"));
//            newUser.setLastName(rs.getString("lastName"));
//            newUser.setCountry(rs.getString("email"));
//            newUser.setCountry(rs.getString("country"));
//            newUser.setAddressStreet(rs.getString("addressStreet"));
//            newUser.setAddressState(rs.getString("addressState"));
//            newUser.setAddressZipCode(rs.getInt("addressZipCode"));
//
//            return newUser;
//        }
//
//        return null;
//
//    } if (repo.authenticate(username, password) == null)) { //the original phrase
//        //        //------------------------------------------------------------------------------------------
//                    System.out.println("Not a good login attempt, not logged in");
//                } else {
//                    System.out.println("Good login! This is a valid user! Now we can store the user object in the context store!");
//                }


    public CreateMenuPogo authenticate(String username, String password) throws SQLException, IOException {
        //THIS WILL VALIDATED IF IT IS TRUE
        String sql = "SELECT * FROM client_information WHERE username = ? AND password = ?"; // IS THIS UPPOSE TO ALSOE TAKE ALL PRAMTERS IF i ONLY NEED THE USER / PASSWORD
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password); //temp took out
        ResultSet rs = pstmt.executeQuery();

        //NO TRUE/FALSE === IT BASED ON THE THE AMOUNT OF RETURNED BACK=
        if (rs.next()) {// if this is true, then we have a matching user/pass in our result set, so the user is authenticated //temp took out
            //                             return new CreateMenuPogo(rs.getInt("client_id"), rs.getString(rs.setString("password")));
            CreateMenuPogo user = new CreateMenuPogo();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
            user.setCountry(rs.getString("email"));
            user.setCountry(rs.getString("country"));
            user.setAddressStreet(rs.getString("addressStreet"));
            user.setAddressState(rs.getString("addressState"));
            user.setAddressZipCode(rs.getInt("addressZipCode"));

//            CreateMenuPogo newUser = new CreateMenuPogo();
//            newUser.setUsername(rs.getString("username"));
//            newUser.setPassword(rs.getString("password"));
//            newUser.setFirstName(rs.getString("firstName"));
//            newUser.setLastName(rs.getString("lastName"));
//            newUser.setCountry(rs.getString("email"));
//            newUser.setCountry(rs.getString("country"));
//            newUser.setAddressStreet(rs.getString("addressStreet"));
//            newUser.setAddressState(rs.getString("addressState"));
//            newUser.setAddressZipCode(rs.getInt("addressZipCode"));

            return user;
        }

            return null;


        }
                /*
                this is the end of the method, but not the end of the entire login process. This method will return a user object
                and it will either be null, or be valid. So, check when this method completes to see if the resultant object
                is null or not.
                */
//        if (newUser == null) { //BLOODY BETTER!!!!!!!"!
////        if (CreateMenuRepo.authenticate(username, password) == null) { //BLOODY BETTER!!!!!!!"! --- it jsut CAN'T BE STATIC!!!!!!!!!!!!!!!
////        if (CreateMenuRepo.authenticate(usernameString, passwordString) == null) { //the original phrase
//            System.out.println("Not a good login attempt, not logged in");
//        } else {
//            System.out.println("Good login! This is a valid user! Now we can store the user object in the context store!");
//        }


//    }



}


