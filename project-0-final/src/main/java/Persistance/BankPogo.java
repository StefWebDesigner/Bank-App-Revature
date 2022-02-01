package Persistance;

public class BankPogo {
    private  Integer mainBankAccountNumber;
//    private  Integer checkingAcctBalance;
//    private  Integer savingAcctBalance;
    private  double checkingAcctBalance;
    private  double savingAcctBalance;

    public BankPogo() {

    }
//    public BankPogo(Integer mainBankAccountNumber, Integer checkingAcctBalance, Integer savingAcctBalance) {
    public BankPogo(Integer mainBankAccountNumber, double checkingAcctBalance, double savingAcctBalance) {
        this.mainBankAccountNumber = mainBankAccountNumber;
        this.checkingAcctBalance = checkingAcctBalance;
        this.savingAcctBalance = savingAcctBalance;
    }

    public void setMainBankAccountNumber(Integer mainBankAccountNumber) {
        this.mainBankAccountNumber = mainBankAccountNumber;
    }

    public BankPogo(double checkingAcctBalance) {
        this.checkingAcctBalance = checkingAcctBalance;
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

    public void setCheckingAcctBalance(double checkingAcctBalance) {
        this.checkingAcctBalance = checkingAcctBalance;
    }

    public void setSavingAcctBalance(double savingAcctBalance) {
        this.savingAcctBalance = savingAcctBalance;
    }

    public int getMainBankAccountNumber() {
        return mainBankAccountNumber;
    }

//    public  int getCheckingAcctBalance() {
//        return checkingAcctBalance;
//    }
//
//    public  int getSavingAcctBalance() {
//        return savingAcctBalance;
//    }

    public double getCheckingAcctBalance() {
        return checkingAcctBalance;
    }

    public  double getSavingAcctBalance() {
        return savingAcctBalance;
    }

}