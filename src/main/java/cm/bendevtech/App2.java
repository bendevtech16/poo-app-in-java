package cm.bendevtech;

import cm.bendevtech.model.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {

    public static void main(String[] args) {
        BankAccount accounts[] = new BankAccount[4];
        accounts[0] = new BankAccount();
        accounts[1] = new BankAccount();
        accounts[2] = new BankAccount();
        accounts[3] = new BankAccount();
        for (BankAccount acc: accounts) {
            System.out.println(acc.getAccountID());
        }
        List<BankAccount>bankAccountList= new ArrayList<BankAccount>();
        bankAccountList.add(new BankAccount());

        System.out.println("-------------------------------------------");
        for (BankAccount acc: bankAccountList) {
            System.out.println(acc);
        }
        System.out.println("**************************************************");
        Map<String,BankAccount> bankAccountMap = new HashMap<>( );
        bankAccountMap.put("key1",new BankAccount());
        bankAccountMap.put("key2",new BankAccount());
        bankAccountMap.put("key3",new BankAccount());
        bankAccountMap.put("key4",new BankAccount());

        BankAccount cc = bankAccountMap.get("keys3");

        System.out.println( "**********************************");

        System.out.println(cc.toString());
        for (String key: bankAccountMap.keySet()
             ) {
            System.out.println(bankAccountMap.get(key));
            
        }
        System.out.println("**********************************");
        for (BankAccount ba: bankAccountMap.values()
             ) {
            System.out.println(ba);
        }

    }
}
