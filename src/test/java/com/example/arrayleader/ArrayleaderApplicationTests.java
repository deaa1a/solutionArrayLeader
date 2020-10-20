package com.example.arrayleader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class ArrayleaderApplicationTests {

    @Test
    void testOne() {
        /*GIVEN*/
        int[] A = {2,1,3,1,2,2,3};
        int K = 3;
        int M = 5;
        Solution solution = new Solution();
        int []expectedResult = {2,3};
        /*WHEN*/
        int []result = solution.solution(K,M,A);
        /*THEN*/
        assertArrayEquals(expectedResult,result);
    }

    @Test
    void testTwo() {
        /*GIVEN*/
        int[] A = {1,2,2,1,2};
        int K = 4;
        int M = 2;
        Solution solution = new Solution();
        int []expectedResult = {2,3};
        /*WHEN*/
        int []result = solution.solution(K,M,A);
        /*THEN*/
        assertArrayEquals(expectedResult,result);
    }

}
