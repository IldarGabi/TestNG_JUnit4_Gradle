package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHackService cashbackHacker = new CashbackHackService();

    @Test
    public void underBoundary() {
        int actual = cashbackHacker.remain(999);
        int expect = 1;
        assertEquals(actual, expect);
    }

    @Test
    public void equalsBoundary() {
        int actual = cashbackHacker.remain(1000);
        int expect = 0;
        assertEquals(actual, expect);
    }

    @Test
    public void overBoundary() {
        int actual = cashbackHacker.remain(1001);
        int expect = 999;
        assertEquals(actual, expect);
    }

    @Test
    public void zero() {
        int actual = cashbackHacker.remain(0);
        int expect = 1000;
        assertEquals(actual, expect);
    }
}