package cm.bendevtech.model.business;

import  cm.bendevtech.model.BankAccount;

import java.util.List;

public interface BanAccouuntServices {

    BankAccount addBankAccount( BankAccount account );
    List<BankAccount> listBankaccount();

    void  getRandom( int size);

     void getBankAccountById( String id);

    void creditInAccount( String accountId, double montant);

    void debitInAccount( String accountId, double montant);

    void transfert(String accountSource, String accountDestination, double montantSend);

}
