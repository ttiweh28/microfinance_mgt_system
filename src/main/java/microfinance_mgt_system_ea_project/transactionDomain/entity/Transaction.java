package microfinance_mgt_system_ea_project.transactionDomain.entity;

import jakarta.persistence.*;
import microfinance_mgt_system_ea_project.accountDomain.entity.Account;
import microfinance_mgt_system_ea_project.transactionDomain.TransactionStatus;

import java.util.Date;

@Entity
public class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String transactionType;

        private double amount;

        private Date transactionDate;

        @Enumerated(EnumType.STRING)
        private TransactionStatus status;

        @ManyToOne
        private microfinance_mgt_system_ea_project.accountDomain.entity.Account Account;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public Date getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(Date transactionDate) {
            this.transactionDate = transactionDate;
        }

        public TransactionStatus getStatus() {
            return status;
        }

        public void setStatus(TransactionStatus status) {
            this.status = status;
        }

        public Account getSavingsAccount() {
            return Account;
        }

        public void setSavingsAccount(Account savingsAccount) {
            this.Account = savingsAccount;
        }
    }


