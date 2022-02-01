package Repo;

import Persistance.BankAccountModel;
import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankAccountRepo implements DataSourceCRUD<BankAccountModel> {

    public Integer create(BankAccountModel bankAccountModel) throws SQLException, IOException {
        String sql = "INSERT INTO bank_account (checkingAcctBalance, savingAcctBalance, client_id) VALUES ( ?, ?, ?)";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        //pstmt.setInt(1, bankPogo.getMainBankAccountNumber());
//        pstmt.setInt(2, bankPogo.getCheckingAcctBalance());
//        pstmt.setInt(3, bankPogo.getSavingAcctBalance());
        pstmt.setDouble(1, bankAccountModel.getCheckingAcctBalance());
        pstmt.setDouble(2, bankAccountModel.getSavingAcctBalance());
        pstmt.setInt(3, bankAccountModel.getClientId());

        pstmt.executeUpdate();
        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }

    @Override
    public BankAccountModel read(Integer client_id) throws SQLException, IOException {

        String sql = "SELECT * FROM bank_account WHERE client_id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, client_id); //it has id instead here
        ResultSet rs = pstmt.executeQuery();

        BankAccountModel user = new BankAccountModel(); //IS THIS MISSING GETTER AND CHNGE THIS BE ADDED?????`
        if (rs.next()) {
            user.setMainBankAccountNumber(rs.getInt("mainBankAccountNumber"));
//            user.setCheckingAcctBalance(rs.getInt("checkingAcctBalance"));
//            user.setSavingAcctBalance(rs.getInt("savingAcctBalance"));
            user.setCheckingAcctBalance(rs.getDouble("checkingAcctBalance"));
            user.setSavingAcctBalance(rs.getDouble("savingAcctBalance"));
            user.setClientId(rs.getInt("client_id"));

            //============ TEMP  STUFF  ===================
//            user.getSavingAcctBalance(rs.getInt("savingAcctBalance"));

        } else {
            return null;
        }

        return user;

    }


    public BankAccountModel update(BankAccountModel bankAccountModel) throws SQLException, IOException {
        String sql = "UPDATE bank_account SET  checkingAcctBalance = ? where mainBankAccountNumber= ?"; // where client id = 1 // where main mainBankAccountNumber = ?,
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
//        pstmt.setInt(2, bankPogo.getCheckingAcctBalance());
//        pstmt.setInt(3, bankPogo.getSavingAcctBalance());
        pstmt.setDouble(1, bankAccountModel.getCheckingAcctBalance());
        pstmt.setInt(2, bankAccountModel.getMainBankAccountNumber());
        //pstmt.setDouble(3, bankAccountModel.getSavingAcctBalance());

        pstmt.executeUpdate();

        return bankAccountModel;
//        String verify = "SELECT * FROM user WHERE mainBankAccountNumber = ?";
//        PreparedStatement vstmt = ConnectionManager.getConnection().prepareStatement(verify);
//        pstmt.setInt(1, bankAccountModel.getMainBankAccountNumber());
//        ResultSet rs = vstmt.executeQuery();
//
//        if (rs.next()) {
//            BankAccountModel verifyUserPogo = new BankAccountModel();
//            verifyUserPogo.setMainBankAccountNumber(rs.getInt("mainBankAccountNumber"));
////            verifyUserPogo.setCheckingAcctBalance(rs.getInt("checkingAcctBalance"));
////            verifyUserPogo.setSavingAcctBalance(rs.getInt("savingAcctBalance"));
//            verifyUserPogo.setCheckingAcctBalance(rs.getDouble("checkingAcctBalance"));
//            verifyUserPogo.setSavingAcctBalance(rs.getDouble("savingAcctBalance"));
//            return verifyUserPogo;
//
//
//        } else {
//            return null;
//        }

    }


    public void delete(Integer mainBankAccountNumber) throws SQLException, IOException {
        String sql = "DELETE FROM user where mainBankAccountNumber = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, mainBankAccountNumber);
        pstmt.executeUpdate();

        return;
    }


}
