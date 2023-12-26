package com.unloadhome;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;

public class MuthubCoreConfig {
    @Getter
    private final String AppName="muthub-core";
    private static final Logger logger=LoggerFactory.getLogger(MuthubCoreConfig.class);

    public static void showApplicationProperties(ConfigurableEnvironment environment) {
        StreamSupport.stream(
                environment.getPropertySources().spliterator(), false)
                .filter(propertySource -> (propertySource instanceof EnumerablePropertySource))
                .map(propertySource -> ((EnumerablePropertySource<?>) propertySource).getPropertyNames())
                .flatMap(Arrays::stream).distinct().collect(Collectors.toMap(Function.identity(), environment::getProperty))
                .entrySet().stream().forEach(entry -> {
                    String key = entry.getKey();
                    logger.info(String.format("properties, [%s = %s] . ", key, entry.getValue()));
                }
        );
    }
}
