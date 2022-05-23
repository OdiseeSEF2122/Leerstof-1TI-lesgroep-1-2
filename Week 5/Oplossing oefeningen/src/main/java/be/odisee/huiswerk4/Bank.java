package be.odisee.huiswerk4;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void openAccount(Account account){
        if(!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public boolean accountExists(Account account){
        return accounts.contains(account);
    }

    public int numAccounts(){
        return accounts.size();
    }

    public void closeAccount(Account account){
        accounts.remove(account);
    }

    public void update(){
        for(Account account : accounts){
            /*if( account instanceof SpaarRekening){
                SpaarRekening account1 = (SpaarRekening) account;
                account1.addInterest();
            }*/
            account.update();
        }
    }

    public static void main(String[] args) {
        // Spaarrekeningen
        SpaarRekening spRekening = new SpaarRekening(0.0011);
        SpaarRekening spRekening2 = new SpaarRekening(1);
        SpaarRekening spRekening3 = new SpaarRekening(0.10);

        // ZichtRekening
        ZichtRekening ziRekening = new ZichtRekening(10);
        ZichtRekening ziRekening2 = new ZichtRekening(100);

        Bank bank = new Bank();
        bank.openAccount(spRekening);
        bank.openAccount(spRekening2);
        bank.openAccount(spRekening3);
        bank.openAccount(ziRekening);
        bank.openAccount(ziRekening2);

        spRekening.deposit(100);
        spRekening2.deposit(0);
        spRekening3.deposit(100);
        ziRekening.withdraw(50);
        ziRekening2.withdraw(50);

        bank.update();
    }
}
