package pakiet1;

public class Abst {
    public static void main(String[] args){
      A ob=new A();

    }



}







class A{
    void fun(Inter i){
        i.method();
    }
}

interface Inter{
    void method();

}


