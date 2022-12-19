package design_patterns.adaptor;

public interface BankApiAdaptor {

    double getBalance(String AccountNo);

    boolean sendMoney(String fromAccount,
                      String toAccount,
                      double amount);
}
