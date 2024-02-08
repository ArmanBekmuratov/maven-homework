package com.ab.integration;

import com.ab.CommonRunner;
import org.junit.jupiter.api.Test;

public class CommonRunnerIT {
    @Test
    public void checkSum() {
        CommonRunner commonRunner = new CommonRunner();
        commonRunner.sum(3, 3);
    }
}
