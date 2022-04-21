package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1Max() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Max() {
        int left = 1;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAequaB() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }
}