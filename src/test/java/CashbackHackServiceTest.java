
public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        org.testng.Assert.assertEquals(actual, expected);

    }
}