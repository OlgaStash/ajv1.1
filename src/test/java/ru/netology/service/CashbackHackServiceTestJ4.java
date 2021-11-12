package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJ4 {

    @Test
    public void shouldTestRemainFrom0() {
        CashbackHackService service = new CashbackHackService();
        int payment = 0;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainFrom1() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1;

        int actual = service.remain(payment);
        int expected = 999;
        assertEquals(expected, actual);
    }

//    @Test
//    public void shouldTestRemainFrom1000() {
//        CashbackHackService service = new CashbackHackService();
//        int payment = 1000;
//
//        int actual = service.remain(payment);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }
}