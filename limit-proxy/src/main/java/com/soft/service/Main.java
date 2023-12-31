package com.soft.service;

import com.soft.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        MyAlterService myAlterService = context.getBean(MyAlterService.class);
        myAlterService.algo();
        myAlterService.protectedTest();
        myAlterService.publicTest();
    }
}
