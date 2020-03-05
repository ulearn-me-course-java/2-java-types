package com.example.task06;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(int x, int y, int output) {
        Assertions.assertThat(Task06.solution(x, y)).as("Input: %s, %s", x, y).isEqualTo(output);
    }

    @Test
    public void test() throws Exception {
        check(1, 1, 1);
        check(51, 49, 3);
        check(412, 844, 4);
        check(-111, -222, 3);
        check(-111, 100, 2);
        check(777, -777, 1);

    }

}
