package sda.java5.springclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sda.java5.springclass.service.MessageSender;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
        MessageSender sender = ctx.getBean(MessageSender.class);
        sender.sendMessage();
    }
}
