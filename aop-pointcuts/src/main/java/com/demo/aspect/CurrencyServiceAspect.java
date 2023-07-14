package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CurrencyServiceAspect {

    //@Before("this(com.demo.service.CurrencyService)")
    public void beforeCurrencyAdvice(JoinPoint joinPoint){
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
}
