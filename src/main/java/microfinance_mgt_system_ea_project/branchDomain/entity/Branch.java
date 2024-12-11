package microfinance_mgt_system_ea_project.branchDomain.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import microfinance_mgt_system_ea_project.entity.Address;

@Entity
public class Branch {
    @Id@GeneratedValue
    private int id;

    private String branchName;
    private String branchManager;

    @Embedded
    private Address address;

    protected Branch() {}
    public Branch(String branchName, String branchManager, Address address) {
        this.branchName = branchName;
        this.branchManager = branchManager;
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
