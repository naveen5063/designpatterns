package design_patterns.adaptor;

public class phonepe {

    private BankApiAdaptor bankAPI;

    public phonepe(BankApiAdaptor bankApi){
        this.bankAPI = bankApi;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        return currentBalance * 2;
    }

}
