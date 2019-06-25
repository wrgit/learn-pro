package aop.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//代理对象
public class DemoInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = null;

        try {
            methodProxy.invokeSuper(o, objects);
        } catch (Exception e) {

        } finally {
            System.out.println("after in cglib");
        }

        return result;
    }
}
