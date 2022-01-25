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
        String sql = "INSERT INTO client_information ( id, username, permFirstName, permLastName, permCountry, permAddressStreet, permAddressState, permAddressZipCode) VALUES (?, ?)";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstmt = setString(1, CreateMenuPogo.getId());
        pstmt = setString(2, CreateMenuPogo.getUsername());
        pstmt = setString(3, CreateMenuPogo.getFirstName());
        pstmt = setString(4, CreateMenuPogo.getLastName());
        pstmt = setString(5, CreateMenuPogo.getCountry());
        pstmt = setString(6, CreateMenuPogo.getAddressStreet());
        pstmt = setString(7, CreateMenuPogo.getAddressState());
        pstmt = setString(8, CreateMenuPogo.getAddressZipCode());

        pstmt.executeUpdate();
        ResultSet rs = pstmt.getResultSet();
        if(rs.next()) {
           return rs.getInt(1);

        }
            return -1;

//        DO i NEED TO CREATE THE SETTERS TO, RIGHT????

    }

    public CreateMenuPogo read (Integer id) throws SQLException, IOException {
        String sql = "SELECT * FROM client_information WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, client_id);
        ResultSet rs = pstmt.executeQuery();

        CreateMenuPogo user = new CreateMenuPogo(); //THIS IS MARSHALING THE INFORMATION
        if(rs.next()) {
            user.setId(rs.getInt("client_id"));
            user.setUsername(rs.getString("username"));
            user.setFirstName(rs.getString("permFirstName"));
            user.setLastName(rs.getString("permLastName"));
            user.setCountry(rs.getString("permCountry"));
            user.setAddressStreet(rs.getString("permAddressStreet"));
            user.setAddressState(rs.getString("permAddressState"));
            user.setAddressZipCode(rs.getInt("permAddressZipCode"));
        } else {
            return null;

            }
    }

    public CreateMenuPogo update (CreateMenuPogo createMenuPogo) throws SQLException, IOException {
        String sql = "UPDATE user SET client_id = ?, username = ?, permFirstName = ?, permLastName = ?, permCountry = ?, permAddressStreet = ?, permAddressState = ?, permAddressZipCode = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.getInt(1, createMenuPogo.getId());
        pstmt.getString(2, createMenuPogo.getUsername());
        pstmt.getString(3, createMenuPogo.getFirstName());
        pstmt.getString(4, createMenuPogo.getLastName());
        pstmt.getString(5, createMenuPogo.getCountry());
        pstmt.getString(6, createMenuPogo.getAddressStreet());
        pstmt.getString(7, createMenuPogo.getAddressState());
        pstmt.getInt(8, createMenuPogo.getAddressZipCode());

        pstmt. executeUpdate();

        String verify = "SELECT * FROM user WHERE client_id = ?";
        PreparedStatement vstmt = ConnectionManager.getConnection().prepareStatement(verify);
        pstmt.getInt(1, createMenuPogo.getId());
        ResultSet rs = vstmt.executeQuery();


        if(rs.next()) {
            CreateMenuPogo verifiedUserModel = new CreateMenuPogo();
            verifiedUserModel.setId(rs.getInt("client_id"));
            verifiedUserModel.setUsername(rs.getString("username"));
            verifiedUserModel.setFirstName(rs.getString("permFirstName"));
            verifiedUserModel.setLastName(rs.getString("permLastName"));
            verifiedUserModel.setCountry(rs.getString("permCountry"));
            verifiedUserModel.setAddressStreet(rs.getString("permAddressStreet"));
            verifiedUserModel.setAddressState(rs.getString("permAddressState"));
            verifiedUserModel.setAddressZipCode(rs.getInt("permAddressZipCode"));
            return verifiedUserModel;

        } else {

            return null;
        }


    }

    public CreateMenuPogo delete (Integer client_id) throws SQLException, IOException {

        String sql = "DELETE FROM user WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, client_id);
        pstmt.executeUpdate();

        return null;
    }

public boolean authenticate(String username, String password) throws SQLException, IOException {
        String sql = "SELECT * FROM user WHERE username = :?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next() && rs.getString("password").equals(password)) {
            return true;

        } else {
            return false;
        }
}

