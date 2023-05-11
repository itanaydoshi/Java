package com.knowledgegate;

class A extends Thread {
    public void run() {
        for (int i =0; i<= 5; i++) {
            System.out.println("A se aaya hu " + i);
        }
        System.out.println("A se nikal gaya");
    }
}
class B extends Thread {
    public void run() {
        for (int i =0; i<= 5; i++) {
            System.out.println("B se aaya hu " + i);
        }
    }
}
