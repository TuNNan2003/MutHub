package com.unloadhome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MuthubCoreConfig.class)
public class MuthubCoreConfigTest {
    @Test
    public void testGetNameShouldReturnName() throws Exception {
        MuthubCoreConfig appConfig = new MuthubCoreConfig();
        String result = appConfig.getAppName();
        assertEquals("muthub-core", result);
    }
}
