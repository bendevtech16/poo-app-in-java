package cm.bendevtech.model;

import java.util.Objects;
import java.util.UUID;

public class BankAccount extends Object {
    private String accountID;
    private double balance;
   private String currency;
   private AccountStatus status;

    public BankAccount( ){
    this.accountID = UUID.randomUUID().toString();
    this.balance = 50000;
    this.status = AccountStatus.created;
    this.currency = "USD";

    }
    public double getBalance() {
        return balance;
    }
    public String getAccountID() {
        return accountID;
    }
    public String getCurrency() {
        return currency;
    }
    public AccountStatus getStatus() {
        return status;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountID='" + accountID + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

}
