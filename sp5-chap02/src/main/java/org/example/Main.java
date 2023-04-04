package org.example;

import chap02.AppContext;
import chap02.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx =
                    new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);
        //getBean 메서드는 greeter() 메서드가 생성한 Greeter 객체를 리턴

        String msg = g.greet("spring");
        System.out.println(msg);
        ctx.close();
    }
}