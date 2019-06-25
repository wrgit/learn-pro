package aop.jdk;

//subject接口，这是jdk动态代理必须前提
public interface Subject {

    void request();

    void hello();
}
