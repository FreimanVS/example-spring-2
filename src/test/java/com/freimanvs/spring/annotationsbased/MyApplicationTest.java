//package com.freimanvs.spring.annotationsbased;
//
//import com.freimanvs.spring.services.interfaces.MessageService;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import static org.junit.Assert.*;
//
//@Configuration
//@ComponentScan(value="com.freimanvs.spring")
//public class MyApplicationTest {
//
//    private AnnotationConfigApplicationContext context = null;
//
//    @Bean("getMessageService")
//    public MessageService getMessageService() {
//        return new MessageService(){
//
//            public boolean sendMessage(String msg, String rec) {
//                System.out.println("Mock Service");
//                return true;
//            }
//
//        };
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        context.close();
//    }
//
//    @Test
//    public void test() {
//        MyApplication app = context.getBean(MyApplication.class);
//        Assert.assertTrue(app.processMessage("Hi Pankaj", "pankaj@abc.com"));
//    }
//
//}