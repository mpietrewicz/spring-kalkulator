package pl.kurs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* pl.kurs.Bank.*(..))\")")
    public void check() {
        System.out.println("Działa!");
    }

}
