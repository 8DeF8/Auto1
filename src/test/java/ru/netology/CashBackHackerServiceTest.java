package ru.netology;


    import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackerServiceTest {

    @org.testng.annotations.Test
    public void testZeroPurchase() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void testNeedToBuyMore() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testZeroPurchaseMore() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testZeroBuy() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }


}