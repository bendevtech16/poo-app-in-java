package cm.bendevtech.model;

import cm.bendevtech.model.business.BanAccouuntServices;
import cm.bendevtech.model.business.BankAccountImple;

public class Application {

    public static void main(String[] args) {

        BanAccouuntServices banAccouuntServices = new BankAccountImple();   // mieux de declarer un objet de type interface en new classe qui l'implemente.
        banAccouuntServices.addBankAccount(new BankAccount());
        banAccouuntServices.getBankAccountById( "clef1");
        banAccouuntServices.creditInAccount("clef1", 50000);
        banAccouuntServices.addBankAccount(new BankAccount());
        banAccouuntServices.transfert("clef1", "clef3",25000);
        banAccouuntServices.getRandom(5);
        System.out.println("-----------------------------------------------------------------");
        System.out.println(banAccouuntServices.listBankaccount());



    }
}
