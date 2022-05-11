package day3Task3and4;

public class runMainpart {

    public static void main(String[] args) {
        bankAccountInfo.bankAccount firstUserAccount = new bankAccountInfo.bankAccount(1000);
        bankAccountInfo.bankAccount secondUserAccount = new bankAccountInfo.bankAccount(300);
        System.out.println("firstUserAccount`s balance is " + firstUserAccount.getBalanceofUser());
        System.out.println("secondUserAccount`s balance is " + secondUserAccount.getBalanceofUser());
        double amount = 54.4;
        System.out.println("firstUserAccount adding deposit");
        firstUserAccount.deposit(amount);
        System.out.println("try to deposit more than 5000");
        firstUserAccount.deposit(9545);
        System.out.println("withdraw");
        firstUserAccount.withdraw(645);
        System.out.println("withdraw more than has");
        firstUserAccount.withdraw(2043);
        System.out.println("transfer to user" + secondUserAccount);
        firstUserAccount.transferBalance(secondUserAccount, 329);
        System.out.println("transfer more than has");
        firstUserAccount.transferBalance(secondUserAccount, 32423);


    }
}
