package Persistance;

import Utils.ConnectionManager;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankRepo implements DataSourceCRUD<BankPogo> {

    public Integer create(BankPogo bankPogo) throws SQLException, IOException {
        String sql = "INSERT INTO bank_account (mainBankAccountNumber, checkingAcctBalance, savingAcctBalance) VALUES ( ?, ?, ?)";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pstmt.setInt(1, bankPogo.getMainBankAccountNumber());
//        pstmt.setInt(2, bankPogo.getCheckingAcctBalance());
//        pstmt.setInt(3, bankPogo.getSavingAcctBalance());
        pstmt.setDouble(2, bankPogo.getCheckingAcctBalance());
        pstmt.setDouble(3, bankPogo.getSavingAcctBalance());

        pstmt.executeUpdate();
        ResultSet rs = pstmt.getGeneratedKeys();
        if(rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }

    @Override
    public BankPogo read(Integer id) throws SQLException, IOException {

        String sql = "SELECT * FROM bank_account WHERE id = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, id); //it has id instead here
        ResultSet rs = pstmt.executeQuery();

        BankPogo user = new BankPogo(); //IS THIS MISSING GETTER AND CHNGE THIS BE ADDED?????`
        if (rs.next()) {
            user.setMainBankAccountNumber(rs.getInt("mainBankAccountNumber"));
//            user.setCheckingAcctBalance(rs.getInt("checkingAcctBalance"));
//            user.setSavingAcctBalance(rs.getInt("savingAcctBalance"));
            user.setCheckingAcctBalance(rs.getDouble("checkingAcctBalance"));
            user.setSavingAcctBalance(rs.getDouble("savingAcctBalance"));

            //============ TEMP  STUFF  ===================
//            user.getSavingAcctBalance(rs.getInt("savingAcctBalance"));

        } else {
            return null;
        }

        return null;

    }


    public BankPogo update(BankPogo bankPogo) throws SQLException, IOException {
        String sql = "UPDATE user SET mainBankAccountNumber = ?, checkingAcctBalance = ?, savingAcctBalance = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, bankPogo.getMainBankAccountNumber());
//        pstmt.setInt(2, bankPogo.getCheckingAcctBalance());
//        pstmt.setInt(3, bankPogo.getSavingAcctBalance());
        pstmt.setDouble(2, bankPogo.getCheckingAcctBalance());
        pstmt.setDouble(3, bankPogo.getSavingAcctBalance());

        pstmt.executeUpdate();
        String verify = "SELECT * FROM user WHERE mainBankAccountNumber = ?";
        PreparedStatement vstmt = ConnectionManager.getConnection().prepareStatement(verify);
        pstmt.setInt(1, bankPogo.getMainBankAccountNumber());
        ResultSet rs = vstmt.executeQuery();

        if(rs.next()) {
            BankPogo verifyUserPogo = new BankPogo();
            verifyUserPogo.setMainBankAccountNumber(rs.getInt("mainBankAccountNumber"));
//            verifyUserPogo.setCheckingAcctBalance(rs.getInt("checkingAcctBalance"));
//            verifyUserPogo.setSavingAcctBalance(rs.getInt("savingAcctBalance"));
            verifyUserPogo.setCheckingAcctBalance(rs.getDouble("checkingAcctBalance"));
            verifyUserPogo.setSavingAcctBalance(rs.getDouble("savingAcctBalance"));
            return verifyUserPogo;


        } else {
            return null;
        }

    }


    public void delete(Integer mainBankAccountNumber) throws SQLException, IOException {
        String sql = "DELETE FROM user where mainBankAccountNumber = ?";
        PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        pstmt.setInt(1, mainBankAccountNumber);
        pstmt.executeUpdate();

        return;
    }






}
