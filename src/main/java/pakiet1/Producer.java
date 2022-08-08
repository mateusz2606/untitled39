package pakiet1;

import java.util.ArrayList;
import java.util.HashSet;

public class Producer {
    Integer i;
    public Producer(Integer i){
        this.i=i;
    }

    synchronized public void produce() {
        try {
            if(i<5){
                i++;
                System.out.println(" producer licznik: "+i);
                notifyAll();
            }
            else {
                System.out.println("wait procuder");
                wait();
            }

            Thread.sleep(500);

        }catch (InterruptedException e){
            System.out.println("bład jakis");
        }
    }
}
