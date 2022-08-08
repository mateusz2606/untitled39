package pakiet1;

import java.util.ArrayList;

public class Apka {
    public int r=345;
    public static void main(String[] args){
        System.out.println("hhhhh");
        pipka ob=new pipka();
        ob.fff();
        Moja vb=new Moja();


    }

   static void dfun(pipka  kkkk){
        System.out.println("jjhjh");
    }
}

class pipka{

    void fff() {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(34);
        tab.add(0,45);
        for(Integer i:tab){
            System.out.println(i);
        }

    }

}

class Moja{
    int r=34;
   static Moja ob=new Moja();
}


