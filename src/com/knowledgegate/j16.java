package com.knowledgegate;

class Test implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<=5; i++){
            System.out.println("Test Thread");
        }
    }
}
public class j16 {
    public static void main(String[] args) {
        Test t = new Test();
        Thread obj = new Thread(t);
        obj.start();
        for (int i=0; i<=5; i++){
            System.out.println("Main Thread");
        }
    }
}
