package br.com.mariojp.solid.lspaccounts;

public class BankService {

    public void processWithdrawal(Account acc, double amount) {
        if (acc instanceof Withdrawable w) {
            w.withdraw(amount);   // só contas que permitem saque
        } else {
            // não faz nada se a conta não for sacável (não tinha instruções no readme.md.
        }
    }
}
