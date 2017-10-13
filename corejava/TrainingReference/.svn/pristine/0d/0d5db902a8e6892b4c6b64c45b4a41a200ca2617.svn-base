package com.nivtek.training.spring.jms;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.JmsTemplate;

public class JmsQueueSender {

    private JmsTemplate jmsTemplate;
    private Queue queue;

    public void setConnectionFactory(ConnectionFactory cf) {
        this.jmsTemplate = new JmsTemplate(cf);
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void simpleSend() {
        this.jmsTemplate.send(this.queue, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
              return session.createTextMessage("hello queue world");
            }
        });
    }
    
      public static void main(String[] args) {
          System.out.println("-- Starting Spring JMS Template Example --");
          ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jms-template.xml");
          JmsQueueSender jmsQueueSender = (JmsQueueSender)ctx.getBean("jmsQueueSender");
          jmsQueueSender.simpleSend();
          System.out.println("Message sent successfully!");
    }
}