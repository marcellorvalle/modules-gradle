package com.mrv.modulesgradle.serviceimpl.messaging;

import com.mrv.modulesgradle.feature.model.Message;
import org.springframework.stereotype.Service;

@Service
public class ShowMessageService {
    public String execute(Message message) {
        return String.format("You received a message at [%s]: %s", message.getCreation(), message.getText());
    }
}
