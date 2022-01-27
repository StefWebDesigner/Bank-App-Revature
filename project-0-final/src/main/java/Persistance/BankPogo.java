package Persistance;

public class BankPogo {
    private static Integer mainBankAccountNumber;
    private static Integer checkingAcctBalance;
    private static Integer savingAcctBalance;

    public BankPogo() {

    }

    public BankPogo(Integer mainBankAccountNumber, Integer checkingAcctBalance, Integer savingAcctBalance) {
        this.mainBankAccountNumber = mainBankAccountNumber;
        this.checkingAcctBalance = checkingAcctBalance;
        this.savingAcctBalance = savingAcctBalance;
    }


    public void setMainBankAccountNumber(Integer mainBankAccountNumber) {
        this.mainBankAccountNumber = mainBankAccountNumber;
    }

    public void setCheckingAcctBalance(Integer checkingAcctBalance) {
        this.checkingAcctBalance = checkingAcctBalance;
    }

    public void setSavingAcctBalance(Integer savingAcctBalance) {
        this.savingAcctBalance = savingAcctBalance;
    }

    public static int getMainBankAccountNumber() {
        return mainBankAccountNumber;
    }

    public static int getCheckingAcctBalance() {
        return checkingAcctBalance;
    }

    public static int getSavingAcctBalance() {
        return savingAcctBalance;
    }
}
