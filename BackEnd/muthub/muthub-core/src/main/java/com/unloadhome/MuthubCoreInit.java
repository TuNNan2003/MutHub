package com.unloadhome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class MuthubCoreInit implements CommandLineRunner{
    @Autowired
    private ConfigurableEnvironment environment;
    @Override
    public void run(String... args) throws Exception {
        MuthubCoreConfig.showApplicationProperties(environment);
    }
}
