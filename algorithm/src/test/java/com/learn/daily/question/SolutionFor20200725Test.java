package com.learn.daily.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFor20200725Test {

    private SolutionFor20200725 sf;

    @BeforeEach
    void setUp() {
        sf = new SolutionFor20200725();
    }

    @Test
    void splitArray() {
        assertEquals(101, sf.splitArray(new int[]{99,1,1,98,2}, 2));
    }
}