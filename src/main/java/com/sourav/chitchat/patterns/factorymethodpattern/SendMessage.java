package com.sourav.chitchat.patterns.factorymethodpattern;

/**
 * Created by souravkumarchowhan on 21/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 21/07/2025
 * @File : {@link SendMessage}
 */
public interface SendMessage {
    default void sendMessage(String message) {
        System.out.println("Sending Message: " + message);
    }
}
