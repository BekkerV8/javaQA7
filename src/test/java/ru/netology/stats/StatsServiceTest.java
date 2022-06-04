package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    private static final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testTotalSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.totalSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMiddleSumSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.middleSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthSalesMax() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthSalesMax(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthSalesMin() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthSalesMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthSalesLow() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthSalesLow(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthSalesHigh() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthSalesHigh(sales);

        Assertions.assertEquals(expected, actual);
    }

}
