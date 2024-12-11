package microfinance_mgt_system_ea_project.loanDomain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {
    @Id
    private int id;


    private double amount;
    private boolean status;
    private float interestRate;

    protected Loan() {}

    public Loan(double amount, boolean status, float interestRate) {
        this.amount = amount;
        this.status = status;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
