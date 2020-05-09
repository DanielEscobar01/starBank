/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Accounts.Account;
import Office.BranchOffice;
import java.util.Date;

/**
 * This class will let us record an operation
 *
 * @author danielescobar
 */
public class Operation {

    private Date date;
    private String account;
    private String type;
    private BranchOffice branchOffice;

    /**
     * This constructor will set up the values of the operation
     *
     * @param account The account of the operation
     * @param type 0:Operation==deposit, 1:Operation==withdraw,
     * 2:Operation==Deactivate, 3:Operation==Activate
     */
    public Operation(Account account, int type) {
        switch (type) {
            case 0:
                setType("Deposit");
                break;
            case 1:
                setType("Withdraw");
                break;
            case 2:
                setType("Deactivate");
                break;
            case 3:
                setType("Activate");
                break;
        }
        setAccount(account);
        Date date = new Date();
        setDate(date);
    }

    /**
     * This method let us get the date of the operation
     *
     * @return The date of the operation
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method let us set the date of the operation
     *
     * @param date The date of the operation
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method let us get the account of the operation
     *
     * @return The account of the operation
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method let us set the account of the operation
     *
     * @param account The account of the operation
     */
    public void setAccount(Account account) {
        this.account = account.getId();
    }

    /**
     * This method let us get the type of operation
     *
     * @return The type of operation
     */
    public String getType() {
        return type;
    }

    /**
     * This method let us set the type of the operation
     *
     * @param type The type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method let us get the branch office of the operation
     *
     * @return The branchOffice of the operation
     */
    public BranchOffice getBranchOffice() {
        return branchOffice;
    }

    /**
     * This method let us set the branch office of the operation
     *
     * @param branchOffice The branchOffice of the operation
     */
    public void setBranchOffice(BranchOffice branchOffice) {
        this.branchOffice = branchOffice;
    }

    @Override
    public String toString() {
        return "Operation{" + "Date=" + date + ", Account=" + account + ", Type=" + type + '}';
    }

}
