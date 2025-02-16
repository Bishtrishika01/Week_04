package com.reflection.advancedlevel;

import java.lang.reflect.*;
import java.util.*;

interface Greeting {
    void sayHello();
}

class Hello implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method: " + method.getName());
        return method.invoke(target, args);
    }
}

public class LoggingProxyExample {
    public static void main(String[] args) {
        Greeting original = new Hello();

        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(original)
        );

        proxyInstance.sayHello();
    }
}
