package aop.cglib;

public class RealSubject {
    public void request() {
        System.out.println("real subject execute request");
    }

    public void hello() {
        System.out.println("hello");
    }
}
