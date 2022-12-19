package design_patterns.adaptor;

import design_patterns.adaptor.thirdparty.IciciBankAPI;

public class IciciBankAdaptor implements BankApiAdaptor{

    private IciciBankAPI iciciBankAPI = new IciciBankAPI();
    @Override
    public double getBalance(String AccountNo) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
