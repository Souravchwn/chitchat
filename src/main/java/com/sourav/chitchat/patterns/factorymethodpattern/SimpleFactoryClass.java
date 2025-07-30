package com.sourav.chitchat.patterns.factorymethodpattern;

import org.springframework.stereotype.Component;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link SimpleFactoryClass}
 */
@Component
public class SimpleFactoryClass{
    public final NotificationFactoryProvider notificationFactoryProvider;

    public SimpleFactoryClass(NotificationFactoryProvider notificationFactoryProvider) {
        this.notificationFactoryProvider = notificationFactoryProvider;
    }
    public Notification createNotification(EmailNotification notification) {
        return notificationFactoryProvider.createNotification(notification);
    }
}
