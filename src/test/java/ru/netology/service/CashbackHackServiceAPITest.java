package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceAPITest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn999IfAmountIs1() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmountIs999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
