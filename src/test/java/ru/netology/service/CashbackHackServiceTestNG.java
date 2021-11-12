package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldTestRemainFrom0() {
        CashbackHackService service = new CashbackHackService();
        int payment = 0;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom1() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1;

        int actual = service.remain(payment);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1000;

        int actual = service.remain(payment);
        int expected = 0;
        assertEquals(actual, expected);

    }

}