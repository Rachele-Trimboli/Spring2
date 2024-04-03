package com.epicode.U5D1.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Ordine o = (Ordine) ctx.getBean("ordine");

        o.printOrdine();

        ctx.close();
    }
}
