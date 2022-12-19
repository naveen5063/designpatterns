package design_patterns.adaptor;

import design_patterns.adaptor.thirdparty.YesBankAPI;

public class YesBankAdaptor implements BankApiAdaptor{

    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String AccountNo) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
