package com.wilson.introtosb;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env" , havingValue = "development")
public class DevDB implements DB {
    @Override
    public void getData() {
        System.out.println("Development DB");
    }
}
