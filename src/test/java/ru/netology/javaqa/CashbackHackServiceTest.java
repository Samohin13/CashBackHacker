package ru.netology.javaqa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);


    }

    @Test
    public void BuyTenMore() {
        int amount = 2100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void CashbackNegativeAmount() {
        int amount = -1000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackZeroAmount() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldSayBuySomethingElseFor1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test

    public void BuyAnother500() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test

    public void BuyAnother1() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }
}

