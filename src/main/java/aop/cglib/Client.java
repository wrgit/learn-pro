package aop.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoInterceptor());
        //此刻，realSubject不是单纯的目标类，而是增强过的目标类
        RealSubject realSubject = (RealSubject) enhancer.create();

        realSubject.request();
        realSubject.hello();
    }
}
