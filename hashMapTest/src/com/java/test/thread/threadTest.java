package com.java.test.thread;



public class threadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("主线程结束"+Thread.currentThread().getName());
        /**
         * 实现Runnable接口
         */
        Runnable r1 = ()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println("线程实现Runnable接口"+i);
            }
        };
        new Thread(r1).start();
    }

}
/**
 * 继承Thread类
 */
class  MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程==="+currentThread().getName()+i);
        }
    }
}