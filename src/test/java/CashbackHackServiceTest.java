import org.testng.annotations.Test;
import ru.netology.javaqa.CashbackHackService;

import static org.testng.Assert.*;

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
    public void buyAnother1000 (){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected =0;

        assertEquals(actual,expected);
    }


}
