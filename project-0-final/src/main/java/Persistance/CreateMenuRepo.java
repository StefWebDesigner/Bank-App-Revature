package Persistance;

import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateMenuRepo implements DataSourceCRUD<CreateMenuPogo> {

    public Integer create(CreateMenuPogo createMenuPogo) throws SQLException, IOException {
        //I believe I need to add all the parameters to the field
        String sql = "INSERT INTO client_information ( username, permPassword, permFirstName, permLastName, permEmail, permCountry, permAddressStreet, permAddressState, permAdressZipCode) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//        pstmt.setInt(1, createMenuPogo.getId());
        pstmt.setString(1, createMenuPogo.getUsername());
        pstmt.setString(2, createMenuPogo.getPermPassword());
        pstmt.setString(3, createMenuPogo.getPermFirstName());
        pstmt.setString(4, createMenuPogo.getPermLastName());
        pstmt.setString(5, createMenuPogo.getPermEmail());
        pstmt.setString(6, createMenuPogo.getPermCountry());
        pstmt.setString(7, createMenuPogo.getPermAddressStreet());
        pstmt.setString(8, createMenuPogo.getPermAddressState());
        pstmt.setInt(9, createMenuPogo.getPermAddressZipCode());

        pstmt.executeUpdate();
        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {                                ////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
            return rs.getInt(1);                ///this is causing your problems man!!!!!!!!!
        }
        return -1;
    }

//        pstmt.executeUpdate();
//    ResultSet rs = pstmt.getGeneratedKeys();
//        if (rs.next()) {                                ////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//        return rs.getInt(1);                ///this is causing your problems man!!!!!!!!!
//
//
//    }
//        return -1;
//
////        DO i NEED TO CREATE THE SETTERS TO, RIGHT????
//
//}

    @Override
    public CreateMenuPogo read(Integer id) throws SQLException, IOException {
        String sql = "SELECT * FROM client_information WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        CreateMenuPogo user = new CreateMenuPogo(); //THIS IS MARSHALING THE INFORMATION
        if (rs.next()) {
            user.setId(rs.getInt("client_id"));
            user.setUsername(rs.getString("username"));
            user.setUsername(rs.getString("permPassword"));
            user.setPermFirstName(rs.getString("permFirstName"));
            user.setPermLastName(rs.getString("permLastName"));
            user.setPermCountry(rs.getString("permEmail"));
            user.setPermCountry(rs.getString("permCountry"));
            user.setPermAddressStreet(rs.getString("permAddressStreet"));
            user.setPermAddressState(rs.getString("permAddressState"));
            user.setPermAddressZipCode(rs.getInt("permAddressZipCode"));
        } else {
            return null;

        }
        return null;
    }

    public CreateMenuPogo update(CreateMenuPogo createMenuPogo) throws SQLException, IOException {
        String sql = "UPDATE user SET client_id = ?, username = ?, permPassword = ?, permFirstName = ?, permLastName = ?, permEmail = ?, permCountry = ?, permAddressStreet = ?, permAddressState = ?, permAddressZipCode = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, createMenuPogo.getId());
        pstmt.setString(2, createMenuPogo.getUsername());
        pstmt.setString(3, createMenuPogo.getPermPassword());
        pstmt.setString(4, createMenuPogo.getPermFirstName());
        pstmt.setString(5, createMenuPogo.getPermLastName());
        pstmt.setString(6, createMenuPogo.getPermEmail());
        pstmt.setString(7, createMenuPogo.getPermCountry());
        pstmt.setString(8, createMenuPogo.getPermAddressStreet());
        pstmt.setString(9, createMenuPogo.getPermAddressState());
        pstmt.setInt(10, createMenuPogo.getPermAddressZipCode());

        pstmt.executeUpdate();

        String verify = "SELECT * FROM user WHERE client_id = ?";
        PreparedStatement vstmt = ConnectionManager.getConnection().prepareStatement(verify);
        pstmt.setInt(1, createMenuPogo.getId());
        ResultSet rs = vstmt.executeQuery();


        if (rs.next()) {
            CreateMenuPogo verifiedUserModel = new CreateMenuPogo();
            verifiedUserModel.setId(rs.getInt("client_id"));
            verifiedUserModel.setUsername(rs.getString("username"));
            verifiedUserModel.setUsername(rs.getString("permPassword"));
            verifiedUserModel.setPermFirstName(rs.getString("permFirstName"));
            verifiedUserModel.setPermLastName(rs.getString("permLastName"));
            verifiedUserModel.setPermCountry(rs.getString("permEmail"));
            verifiedUserModel.setPermCountry(rs.getString("permCountry"));
            verifiedUserModel.setPermAddressStreet(rs.getString("permAddressStreet"));
            verifiedUserModel.setPermAddressState(rs.getString("permAddressState"));
            verifiedUserModel.setPermAddressZipCode(rs.getInt("permAddressZipCode"));
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

    //NOTE WORKING!!!
//    public CreateMenuPogo authenticate(String username, String password) throws SQLException, IOException {
//        String sql = "SELECT * FROM user WHERE username = :?";
//        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
//        pstmt.setString(1, username);
//        ResultSet rs = pstmt.executeQuery();
//        if (rs.next() && rs.getString("password").equals(password)) {
//            return new CreateMenuPogo(rs.getInt("client_id"), rs.getString("rs.setString("password")));
//
//        } else {
//            return false;
//        }
//    }
}

