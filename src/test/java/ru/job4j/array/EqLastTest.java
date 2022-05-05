package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {20, 1, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void notEq() {
        int[] left = {2, 5, 1};
        int[] right = {1, 53, 23};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}