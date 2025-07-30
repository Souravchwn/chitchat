package com.sourav.chitchat.patterns.factorymethodpattern;

import org.springframework.stereotype.Component;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link NotificationFactoryProvider}
 */
@Component
public class NotificationFactoryProvider extends NotificationFactory {
    @Override
    public Notification createNotification(Notification notification) {
        return notification;
    }
}
