package pakiet1;

public class Threads{
    public static void main(String[] args){
        Integer i=0;
        Consumer ob_con=new Consumer(i);
        Producer ob_pro=new Producer(i);
        T c=new T(ob_con);
        X p=new X(ob_pro);
        Thread t1=new Thread(c);
        t1.start();
        Thread t2=new Thread(p);
        t2.start();

    }


}

class T implements Runnable{
    Consumer ob_con;
    public T(Consumer ob_con){
        this.ob_con=ob_con;
    }
    public void run() {
        while(true){
            ob_con.consume();

        }
    }
}

class X implements Runnable{
    Producer ob_pro;
    public X(Producer ob_pro) {
        this.ob_pro=ob_pro;

    }

    @Override
    public void run() {
        while(true){
            ob_pro.produce();
        }
    }
}
