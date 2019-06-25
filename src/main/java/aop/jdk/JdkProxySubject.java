package aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理类JdkProxySubject
public class JdkProxySubject implements InvocationHandler {

    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     * @param proxy 被代理对象
     * @param method 需要调用的方法
     * @param args 方法调用时所需参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");

        Object result = null;

        try {
            result = method.invoke(realSubject, args);
        } catch (Exception e) {
            System.out.println("ex:" + e.getMessage());
        } finally {
            System.out.println("after");
        }

        return result;
    }
}
