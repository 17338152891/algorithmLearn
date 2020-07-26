package com.learn.daily.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFor20200726Test {

    private SolutionFor20200726 sf;

    @BeforeEach
    void setUp() {
        sf = new SolutionFor20200726();
    }

    @Test
    void longestIncreasingPath1() {
        int[][] matrix = {
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };
        assertEquals(4, sf.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath2() {
        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        assertEquals(4, sf.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath3() {
        int[][] matrix = {
                {2, 1, 1}
        };
        assertEquals(2, sf.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath4() {
        int[][] matrix = {
                {2},
                {1}
        };
        assertEquals(2, sf.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath5() {
        int[][] matrix = {
        };
        assertEquals(0, sf.longestIncreasingPath(matrix));
    }
}
