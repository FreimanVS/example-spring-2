package com.freimanvs.spring.todelete;

import com.freimanvs.spring.annotationsbased.DIConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class)) {
            Todelete todelete = context.getBean("todelete", Todelete.class);
            todelete.method();
        }
    }
}
