package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when6To34() {
        int start = 6;
        int finish = 34;
        int result = Counter.sumByEven(6, 34);
        int expected = 300;
        Assert.assertEquals(expected, result);
    }
}