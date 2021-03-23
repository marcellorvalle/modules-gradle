package com.mrv.modulesgradle.feature.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Message {
    private String text;
    private LocalDateTime creation;

    public static Message build(String text) {
        var message = new Message();
        message.text = text;
        message.creation = LocalDateTime.now();

        return message;
    }
}
