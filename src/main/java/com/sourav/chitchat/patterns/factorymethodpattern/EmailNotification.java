package com.sourav.chitchat.patterns.factorymethodpattern;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link EmailNotification}
 */
public class EmailNotification implements Notification {
    @Override
    public void sentNotification() {
        System.out.println("Sent Email Notification");
    }
}
