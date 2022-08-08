package pakiet1;

public class Threads2 {
    public static void main(String[] args){
        Producer_Consumer ob=new Producer_Consumer();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    ob.produce();

                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    ob.consume();
                }
            }

        });

        t1.start();
        t2.start();
    }
}
