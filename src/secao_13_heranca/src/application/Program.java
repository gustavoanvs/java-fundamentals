package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args){

        Account acc = new Account(01, "Gustavo", 0.0);
        BusinessAccount bacc = new BusinessAccount(02, "Gabriel", 0.0, 1000.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(03, "Guilherme", 0.0, 0.0);

    }

}
