package org.example;

import chap02.AppContext;
import chap02.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx =
                    new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        //getBean 메서드는 greeter() 메서드가 생성한 Greeter 객체를 리턴
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println("(g1 == g2)" + (g1 == g2)); //true를 반환함
        //별도 설정을 하지 않을 경우 스프링은 한 개의 빈 객체를 생성 -> 싱글톤 범위를 갖는다
        ctx.close();
    }
}