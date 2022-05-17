package day3Task3and4;

public class bankAccountInfo {
    public static class bankAccount {
        private double balance;

        public bankAccount() {
        }

        public bankAccount(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0 && amount <= 5000) {
                balance = balance + amount;
                System.out.println("Balance increased an amount " + amount);
            } else if (amount > 5000) {
                System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
            } else {
                System.out.println("the amount should be more than 0");
            }
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                amount = balance - amount;
                System.out.println("Successfully withdrawed, amount is " + amount + ". Your balance is " + balance);
            } else {
                System.out.println("There is not enough funds");
            }
        }

        public void printBalance(double balance) {
            this.balance = balance;
            return;
        }

        public void transferBalance(bankAccount anotherBalance, double amount) {
            if (this.balance < amount) {
                System.out.println("Transfer cancelled. You are trying to transfer " + amount + "units, but only " + balance + " are available.");
                return;
            } else {
                this.balance = balance - amount;
                anotherBalance.balance = anotherBalance.balance + amount;
                System.out.println("Successfully transfered " + amount + " to " + anotherBalance + ". Your balance is " + balance);
                System.out.println(anotherBalance + "`s balance icreased from " + (anotherBalance.balance - amount) + "to " + anotherBalance.balance);
            }
        }

        public double getBalanceofUser() {
            return balance;
        }
    }
}
