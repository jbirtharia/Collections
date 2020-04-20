package basic;

public interface Interf {

    public int k=9;
    default void go() {
        System.out.println("Interf");
    }

    static void hello()
    {
        System.out.println("Interf");
    }
}
