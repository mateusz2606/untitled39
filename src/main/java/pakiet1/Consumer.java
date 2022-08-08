package pakiet1;

import java.util.ArrayList;
import java.util.HashSet;

public class Consumer {

    Integer i;
    public Consumer(Integer i){
        this.i=i;
    }

    synchronized public void consume(){
        try {
            if(i>0){
                i--;
                System.out.println("consumer licznik: "+i);
                notifyAll();
            }
            else {
                System.out.println("wait consumer");
                wait();
            }

            Thread.sleep(500);


        }catch (InterruptedException e){
            System.out.println("bład jakis");
        }
    }
}
