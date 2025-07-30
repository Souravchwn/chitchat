package com.sourav.chitchat.patterns.factorymethodpattern;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link SMSNotification}
 */
public class SMSNotification implements Notification {
    @Override
    public void sentNotification() {
        System.out.println("Sent SMS Notification");
    }
}
