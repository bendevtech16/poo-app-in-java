package cm.bendevtech.model.business;

import cm.bendevtech.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountImple  implements  BanAccouuntServices{

    private List<BankAccount> bankAccountList = new ArrayList<>();
    @Override
    public BankAccount addBankAccount(BankAccount account) {
        bankAccountList.add(account);
        return account;
    }

    @Override
    public List<BankAccount> listBankaccount() {
        return bankAccountList;
    }

    @Override
    public void getRandom(int size) {

    }

    @Override
    public void getBankAccountById(String id) {
        for (BankAccount bankAccount:bankAccountList
             ) {
            if (bankAccount.getAccountID().equals(id))
            {
                System.out.println(bankAccount.getAccountID());
            }
        }

    }

    @Override
    public void creditInAccount(String accountId, double montant) {

    }

    @Override
    public void debitInAccount(String accountId, double montant) {

    }

    @Override
    public void transfert(String accountSource, String accountDestination, double montantSend) {

    }
}
