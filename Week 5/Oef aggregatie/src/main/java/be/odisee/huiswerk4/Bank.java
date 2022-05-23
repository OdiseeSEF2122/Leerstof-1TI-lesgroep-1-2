package be.odisee.huiswerk4;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public double openAccount(boolean isSpaarrekening){
        Account newAccount;
        if(isSpaarrekening) {
            newAccount = new SpaarRekening(0.0011);
        } else {
            newAccount = new ZichtRekening(200);
        }

        accounts.add(newAccount);
        return newAccount.getAccountNumber();
    }

    private Account findAccount(double id){
        for (Account acc: accounts ) {
            if(acc.getAccountNumber() == id){
                return acc;
            }
        }
        return null;
    }

    public boolean accountExists(double rekeningnummer){
        return findAccount(rekeningnummer) != null;
    }

    public int numAccounts(){
        return accounts.size();
    }

    public void closeAccount(double rekeningnummer){
        Account acc = findAccount(rekeningnummer);
        accounts.remove(acc);
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

    public boolean deposit(double rekeningnummer, double amount){
        return false;
        //TODO: continue
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Spaarrekeningen
        double sp1 = bank.openAccount(true);
        double sp2 = bank.openAccount(true);
        double sp3 = bank.openAccount(true);

        spRekening.deposit(100);
        spRekening2.deposit(0);
        spRekening3.deposit(100);
        ziRekening.withdraw(50);
        ziRekening2.withdraw(50);

        bank.update();
    }
}
