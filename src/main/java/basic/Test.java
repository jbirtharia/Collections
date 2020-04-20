package basic;

class A{
    static int i=2;
    int j = 20;

    static void display(){
        System.out.println("Display");
    }
}

public class Test extends A implements Interf,AnotherInterf {

    public static void main(String[] args) {
        new Test().go();
        Test.display();
        System.out.println("i : "+Test.i);
        System.out.println("k : "+Test.k);
        System.out.println("j : "+new Test().j);
        //Test.hello();
    }


    @Override
    public void go() {
        Interf.super.go();
    }
}
