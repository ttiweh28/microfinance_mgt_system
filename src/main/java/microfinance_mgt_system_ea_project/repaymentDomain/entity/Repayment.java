package microfinance_mgt_system_ea_project.repaymentDomain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Repayment {

    @Id
    private int id;

    private int repaymentId;
    private double amountPaid;
    private Date paymentDate;

    protected Repayment() {}

    public Repayment(int repaymentId, double amountPaid, Date repaymentDate) {
        this.repaymentId = repaymentId;
        this.amountPaid = amountPaid;
        this.paymentDate = repaymentDate;
    }

    public int getId() {
        return id;
    }

    public int getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(int repaymentId) {
        this.repaymentId = repaymentId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getRepaymentDate() {
        return paymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.paymentDate = repaymentDate;
    }
}
