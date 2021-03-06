package com.EPAM.StudLub;

public class Credit {
    private String nameOfBank, nameOfOffer;
    private int requiredDeposit;
    private byte interestRate;
    private boolean earlyRepayment;

    public void setEarlyRepayment(boolean earlyRepayment) {
        this.earlyRepayment = earlyRepayment;
    }

    public byte getInterestRate() {
        return interestRate;
    }

    public int getRequiredDeposit() {
        return requiredDeposit;
    }

    public void isEarlyRepayment() {
        if (earlyRepayment == true)
            System.out.println("В данном кредите есть возможность раннего погашения");
        else
            System.out.println("В данном кредите нет возможности раннего погашения");
    }

    public String getNameOfOffer() {
        return nameOfOffer;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setInterestRate(byte interestRate) {
        this.interestRate = interestRate;
    }

    public void setRequiredDeposit(int requiredDeposit) {
        this.requiredDeposit = requiredDeposit;
    }

    public void setNameOfOffer(String nameOfOffer) {
        this.nameOfOffer = nameOfOffer;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void repayTheLoan() {
        System.out.println("В данном кредите нет возможности раннего погашения");
    }

    public void leaveARequest() {
        System.out.println("Ваша заявка принята на обработку!");
    }

}

