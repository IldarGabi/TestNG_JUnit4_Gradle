package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void UnderBoundary() {
        int actual = cashbackHacker.remain(999);
        int expect = 1;
         assertEquals(actual, expect);
    }

    @Test
    public void EqualsBoundary() {
        int actual = cashbackHacker.remain(1000);
        int expect = 0;
        assertEquals(actual, expect);
    }

    @Test
    public void OverBoundary() {
        int actual = cashbackHacker.remain(1001);
        int expect = 999;
        assertEquals(actual, expect);
    }

    @Test
    public void Zero() {
        int actual = cashbackHacker.remain(0);
        int expect = 1000;
        assertEquals(actual, expect);
    }
}