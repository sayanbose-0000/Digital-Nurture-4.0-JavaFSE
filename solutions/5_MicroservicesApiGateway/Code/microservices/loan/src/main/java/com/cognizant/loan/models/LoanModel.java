package com.cognizant.loan.models;

public class LoanModel {

    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;

    public LoanModel(
        String number,
        String type,
        int loan,
        int emi,
        int tenure
    ) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int getLoan() {
        return loan;
    }

    public int getEmi() {
        return emi;
    }

    public int getTenure() {
        return tenure;
    }
}
