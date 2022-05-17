package day3Task3and4;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class runMainpart {
    private static final Logger logger = LogManager.getLogger(runMainpart.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        int a = 50;
        int b = 60;
        int c = a + b;
        logger.info("sum a + b");



        bankAccountInfo.bankAccount firstUserAccount = new bankAccountInfo.bankAccount(1000);
        logger.info("The first user`s account balance is: " + firstUserAccount.getBalanceofUser());
        bankAccountInfo.bankAccount secondUserAccount = new bankAccountInfo.bankAccount(300);
        logger.info("The second user`s account balance is: " + secondUserAccount.getBalanceofUser());
        double amount = 54.4;
        firstUserAccount.deposit(amount);
        logger.info("first user deposited amount: " + amount);
        firstUserAccount.deposit(9545);
        logger.info("first user tried to make a deposit in amount more than 5000");
        firstUserAccount.withdraw(645);
        logger.info("first user tried to withdraw funds");
        firstUserAccount.withdraw(2043);
        logger.info("first user tried to withdraw in amount more than has");
        firstUserAccount.transferBalance(secondUserAccount, 329);
        logger.info("first user transfered to second user funds");
        firstUserAccount.transferBalance(secondUserAccount, 32423);
        logger.info("first user transfered to second user amount more than has");
    }
}
