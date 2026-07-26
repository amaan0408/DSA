package com.algorithmsPractice.Multithreading;

class BankAccount {
    int balance = 100;

    public void withdraw(int amount){
     balance = balance - amount;

    }

}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(() -> bankAccount.withdraw(20));
        Thread t2 = new Thread(() -> bankAccount.withdraw(10));

        t1.start();
        t2.start();

        t1.join();
t2.join();
        System.out.println(bankAccount.balance);

    }
}