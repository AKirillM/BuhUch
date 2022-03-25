package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        Balance Ubalance = null;
        if(new File("Account.txt").exists()){
            System.out.println("Файл обнаружен");
            Reader readerAccounts = new FileReader("Accounts.txt");
            BufferedReader bufferedReader = new BufferedReader(readerAccounts);
            List<Account> accounts = new ArrayList<>();
            while(true){
                String line = bufferedReader.readLine();
                if(line == null)
                    break;
                String[] splitedLine = line.split(";");
                Account account = new Account(splitedLine[0], splitedLine[1], Double.parseDouble(splitedLine[2]), Double.parseDouble(splitedLine[3]));
                accounts.add(account);
            }
            Ubalance = new Balance(accounts);
        }
        else {
            Ubalance = new Balance();
        }

        Ubalance.createOperation(Ubalance.getAccounts().get(2), 10, Ubalance.getAccounts().get(1), 0, 1000);
        Ubalance.createOperation(Ubalance.getAccounts().get(0), 10, Ubalance.getAccounts().get(2), 10, 1000);
        Ubalance.createOperation(Ubalance.getAccounts().get(0), 5, Ubalance.getAccounts().get(2), 5, 500);

        watchOperations(Ubalance);
        for (Account account : Ubalance.getAccounts()) {
            System.out.println(account);
        }
    }

    public static void watchOperations(Balance Ubalance) {
        System.out.println("\nОперации:");
        for (Operation operation : Ubalance.getOperations()) {
            System.out.println(operation);
        }
        System.out.println("\n");
    }
}
