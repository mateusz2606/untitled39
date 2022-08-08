package pakiet2;

public class Moja {
    static Suma ob=new Suma();
    static public void main(String[] args){

        Pizda x1=new Pizda("fuck1",ob);
        Pizda x2=new Pizda("fuck_you",ob);


    }



}

class Suma{
    private int sum;



        void suma ( int[] tab){
            synchronized (this) {
                try {
                    for (int i = 0; i < tab.length; i++) {
                        sum += i;
                        System.out.println("suma wynosi: " + sum);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("bład");
                }
            }

    }


}

class Pizda implements Runnable{

    Thread th1;
    int[] tab={1,2,3,4,5,6};

    Suma ob;
    Pizda(String nazwa,Suma ob){
        this.ob=ob;

        th1=new Thread(this,nazwa);
        th1.start();
        System.out.println("uruchomiony watek: "+nazwa);
    }
    @Override
    public void run() {

            ob.suma(tab);

    }
}
