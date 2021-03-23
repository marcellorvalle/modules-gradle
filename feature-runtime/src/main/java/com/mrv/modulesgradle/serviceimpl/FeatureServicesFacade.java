package com.mrv.modulesgradle.serviceimpl;

import com.mrv.modulesgradle.feature.model.Message;
import com.mrv.modulesgradle.feature.service.FeatureServices;
import com.mrv.modulesgradle.serviceimpl.messaging.ShowMessageService;
import org.springframework.stereotype.Service;

@Service
public class FeatureServicesFacade implements FeatureServices {
    private final ShowMessageService showMessageService;

    public FeatureServicesFacade(ShowMessageService showMessageService) {
        this.showMessageService = showMessageService;
    }

    @Override
    public String showMessage(Message message) {
        return showMessageService.execute(message);
    }
}
