package microfinance_mgt_system_ea_project.accountDomain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private int id;

    private String accountOwnerName;
    private double balance;
    private double interestRate;

    protected Account() {}
    public Account(String accountOwnerName, double balance, double interestRate) {
        this.accountOwnerName = accountOwnerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
