package com.unloadhome;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.function.Function;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;

public class MuthubCoreConfig {
    @Getter
    private final String AppName="muthub-core";

    public static void showApplicationProperties(ConfigurableEnvironment environment) {
        StreamSupport.stream(
                environment.getPropertySources().spliterator(), false)
                .filter(propertySource -> (propertySource instanceof EnumerablePropertySource))
                .map(propertySource -> ((EnumerablePropertySource<?>) propertySource).getPropertyNames())
                .flatMap(Arrays::stream).distinct().collect(Collectors.toMap(Function.identity(), environment::getProperty))
                .entrySet().stream().forEach(entry -> {
                    String key = entry.getKey();
                    System.out.println(String.format("properties, [%s = %s] . ", key, entry.getValue()));
                }
        );
    }
}
