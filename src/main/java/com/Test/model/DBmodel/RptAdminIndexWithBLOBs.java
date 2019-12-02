package com.Test.model.DBmodel;

public class RptAdminIndexWithBLOBs extends RptAdminIndex {
    private String betUsers;

    private String companyDepositsUsers;

    private String onlineDepositsUsers;

    private String manualDepositsUsers;

    private String manualOutUsers;

    private String memberWithdrawalUsers;

    private String backstagePaymentUsers;

    public String getBetUsers() {
        return betUsers;
    }

    public void setBetUsers(String betUsers) {
        this.betUsers = betUsers == null ? null : betUsers.trim();
    }

    public String getCompanyDepositsUsers() {
        return companyDepositsUsers;
    }

    public void setCompanyDepositsUsers(String companyDepositsUsers) {
        this.companyDepositsUsers = companyDepositsUsers == null ? null : companyDepositsUsers.trim();
    }

    public String getOnlineDepositsUsers() {
        return onlineDepositsUsers;
    }

    public void setOnlineDepositsUsers(String onlineDepositsUsers) {
        this.onlineDepositsUsers = onlineDepositsUsers == null ? null : onlineDepositsUsers.trim();
    }

    public String getManualDepositsUsers() {
        return manualDepositsUsers;
    }

    public void setManualDepositsUsers(String manualDepositsUsers) {
        this.manualDepositsUsers = manualDepositsUsers == null ? null : manualDepositsUsers.trim();
    }

    public String getManualOutUsers() {
        return manualOutUsers;
    }

    public void setManualOutUsers(String manualOutUsers) {
        this.manualOutUsers = manualOutUsers == null ? null : manualOutUsers.trim();
    }

    public String getMemberWithdrawalUsers() {
        return memberWithdrawalUsers;
    }

    public void setMemberWithdrawalUsers(String memberWithdrawalUsers) {
        this.memberWithdrawalUsers = memberWithdrawalUsers == null ? null : memberWithdrawalUsers.trim();
    }

    public String getBackstagePaymentUsers() {
        return backstagePaymentUsers;
    }

    public void setBackstagePaymentUsers(String backstagePaymentUsers) {
        this.backstagePaymentUsers = backstagePaymentUsers == null ? null : backstagePaymentUsers.trim();
    }
}