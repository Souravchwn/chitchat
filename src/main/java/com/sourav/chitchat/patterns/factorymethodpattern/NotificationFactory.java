package com.sourav.chitchat.patterns.factorymethodpattern;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link NotificationFactory}
 */
public abstract class NotificationFactory {
    public abstract Notification createNotification(Notification notification);
}
