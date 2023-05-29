
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remain1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remain0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remain1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        org.junit.Assert.assertEquals(expected, actual);
    }
}