package Persistance;

public class BankAccountModel {
    private Integer mainBankAccountNumber;
    //    private  Integer checkingAcctBalance;
//    private  Integer savingAcctBalance;
    private double checkingAcctBalance;
    private double savingAcctBalance;
    private Integer clientId;

    public BankAccountModel() {

    }

    //    public BankPogo(Integer mainBankAccountNumber, Integer checkingAcctBalance, Integer savingAcctBalance) {
    public BankAccountModel(double checkingAcctBalance, double savingAcctBalance, Integer clientId) {
        this.checkingAcctBalance = checkingAcctBalance;
        this.savingAcctBalance = savingAcctBalance;
        this.clientId = clientId;
    }

    public BankAccountModel(double checkingAcctBalance) {
        this.checkingAcctBalance = checkingAcctBalance;
    }

    public int getMainBankAccountNumber() {
        return mainBankAccountNumber;
    }

//    public BankPogo(double savingAcctBalance) {
//        this.savingAcctBalance = savingAcctBalance;
//    }

//    public void setCheckingAcctBalance(Integer checkingAcctBalance) {
//        this.checkingAcctBalance = checkingAcctBalance;
//    }
//
//    public void setSavingAcctBalance(Integer savingAcctBalance) {
//        this.savingAcctBalance = savingAcctBalance;
//    }

//    public void setMainBankAccountNumber(Integer mainBankAccountNumber) {
//        this.mainBankAccountNumber = mainBankAccountNumber;
//    }

    public void setMainBankAccountNumber(Integer mainBankAccountNumber) {
        this.mainBankAccountNumber = mainBankAccountNumber;
    }

    public double getCheckingAcctBalance() {
        return checkingAcctBalance;
    }

    public void setCheckingAcctBalance(double checkingAcctBalance) {
        this.checkingAcctBalance = checkingAcctBalance;
    }

//    public  int getCheckingAcctBalance() {
//        return checkingAcctBalance;
//    }
//
//    public  int getSavingAcctBalance() {
//        return savingAcctBalance;
//    }

    public double getSavingAcctBalance() {
        return savingAcctBalance;
    }

    public void setSavingAcctBalance(double savingAcctBalance) {
        this.savingAcctBalance = savingAcctBalance;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}