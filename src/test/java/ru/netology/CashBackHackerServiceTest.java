package ru.netology;


import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackerServiceTest {

    @org.junit.Test
    public void testZeroPurchase() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testNeedToBuyMore() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testZeroPurchaseMore() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testZeroBuy() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }


}