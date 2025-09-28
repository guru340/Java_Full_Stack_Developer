package org.cfs.BOOTP01;

public class Notification {
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    private  MessageService messageService;

    public Notification(){

    }

    public void  notifyUser(){
        System.out.println(messageService.getMessage());
    }
}
