package com.wilson.introtosb;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue = "production")
public class ProdDB implements DB{
    @Override
    public void getData() {
        System.out.println("Production DB");
    }
}
