package com.mrv.modulesgradle.web;

import com.mrv.modulesgradle.feature.model.Message;
import com.mrv.modulesgradle.feature.service.FeatureServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final FeatureServices featureServices;

    public TestController(FeatureServices featureServices) {
        this.featureServices = featureServices;
    }

    @GetMapping("/")
    public String ok() {
        var message = Message.build("Hello world!");

        return featureServices.showMessage(message);
    }
}
