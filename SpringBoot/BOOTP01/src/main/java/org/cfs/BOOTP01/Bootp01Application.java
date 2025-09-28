package org.cfs.BOOTP01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootp01Application implements CommandLineRunner {
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
    @Autowired
    private Notification notification;

    public Bootp01Application(Notification notification) {
        this.notification = notification;
    }

    public static void main(String[] args) {

        SpringApplication.run(Bootp01Application.class, args);
	}
    public void run(String...args){
        notification.notifyUser();
    }

}
