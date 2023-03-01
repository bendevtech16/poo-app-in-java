package cm.bendevtech;

import cm.bendevtech.model.AccountStatus;
import cm.bendevtech.model.BankAccount;

public class App {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
        account.getStatus();
        affiche(account);
        System.out.println("--------------------------------------------");
        account2.setStatus(AccountStatus.activated);
        affiche(account2);

        if (account.hashCode() == account2.hashCode()){
            System.out.println("les objets sont identiques");

        }
        else {
            System.out.println("les objets ne sont pas identiques");
        }
        System.out.println("--------------------------------------------------");
        }
        
        public  static  void affiche( BankAccount account1){
            System.out.println("**********************************************");
            System.out.println("votre balance est de " + account1.getBalance() + " " + "fcfa");
            System.out.println("votre accountID est  " + account1.getAccountID());
            System.out.println("votre Status est  " + account1.getStatus());
            System.out.println("votre currency est  " + account1.getCurrency());
            System.out.println("**********************************************");
        }
    }




