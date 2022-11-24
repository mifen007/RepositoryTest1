package demo01;

class Thread1 extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 3) {
            System.out.println("线程1：" + i);
        }
    }
}

class Runner1 implements Runnable {
    @Override
    public void run() {
        for (int i = 3; i <= 100; i += 3) {
            System.out.println("线程2：" + i);
        }
    }
}

class TestThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Runner1 r1 = new Runner1();
        Thread t2 = new Thread(r1);
        t2.start();
        for (int i = 1; i <= 100; i += 3) {
            System.out.println("主线程：" + i);
        }
    }
}