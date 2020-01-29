package com.java8.lambda;

public class RunnableLambda {

    public static void main(String[] args) {
        // Old way
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Thread");
            }
        };
        new Thread(r).start();
        //In java8
        Runnable r1 = () -> System.out.println("Runnable Thread in java8");
        new Thread(r1).start();


        //ANother way in java8
        new Thread(() -> System.out.println("In java8 Runnable Thread another way")).start();
    }

}
