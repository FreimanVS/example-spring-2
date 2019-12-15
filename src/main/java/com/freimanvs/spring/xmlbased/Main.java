package com.freimanvs.spring.xmlbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            MyXMLApplication app = context.getBean(MyXMLApplication.class);
            app.processMessage("Hi Pankaj", "pankaj@abc.com");
        }
    }
}
