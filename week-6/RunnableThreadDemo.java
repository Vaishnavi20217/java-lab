class VJIT implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("no arg Method");
        }
    }

    public void run(int j) {
        for (int i = 0; i < j; i++) {
            System.out.println("Arg Method");
        }
    }
}

class RunnableThreadDemo {
    public static void main(String[] args) {
        VJIT v1 = new VJIT();
        Thread t1 = new Thread(v1);
        t1.start(); // Corrected thread start

        // If you want to call the arg method:
        v1.run(3);
    }
}
