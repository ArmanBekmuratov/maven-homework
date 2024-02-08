package com.ab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonRunnerTest {

    @Test
    public void testSum(){
        CommonRunner commonRunner = new CommonRunner();
        int sum = commonRunner.sum(3, 3);
        assertEquals(sum, 6);
    }
}