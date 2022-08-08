package pakiet1;

public class Producer_Consumer {
    Integer i=0;
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
