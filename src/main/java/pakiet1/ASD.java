package pakiet1;

public class ASD {
    public static void main(String[] args){
      //  D cv=new D();

        AA cv=new AA(new AA());


    }
}

class D{
    static int i=0;
    D ob=new D();
    D(){
        System.out.println("ffff: "+i++);
    }
}

class AA{
    AA ob;
    AA(AA ob){
        this.ob=ob;
        System.out.println("agrumentowy klasa AA");
    }
    AA(){
        System.out.println("bezagrumentowy klasa AA");
    }

}



