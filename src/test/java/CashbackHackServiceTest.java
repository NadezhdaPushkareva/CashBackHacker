import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainIfAmountIs900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void remainIfAmountIs800() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    void remainIfAmountIs1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
