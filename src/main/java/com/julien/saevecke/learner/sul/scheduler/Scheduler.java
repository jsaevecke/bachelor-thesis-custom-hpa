package com.julien.saevecke.learner.sul.scheduler;


import org.springframework.amqp.rabbit.connection.RabbitAccessor;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Scheduler {
    // Exectutes each 100ms
    @Scheduled(fixedRate = 100)
    public void autoScale(){
        var messageCount = RabbitAdmin.getQueueInfo("").getMessageCount();
    }
}
