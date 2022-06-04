package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int totalSum(int[] sales) {  //Сумма всех продаж
        int summa = Arrays.stream(sales).sum();
        return summa;
    }

    public int middleSumSales(int[] sales) {   //Средняя сумма продаж в месяц
        int middleSales = totalSum(sales) / sales.length;
        return middleSales;
    }

    public int monthSalesMax(int[] sales) {   //Месяц, в котором был пик продаж
        int saleMax = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[saleMax]) {
                saleMax = month;
            }
            month = month + 1;
        }
        return saleMax + 1;
    }

    public int monthSalesMin(int[] sales) {  //Месяц, в котором был минимум продаж
        int saleMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[saleMin]) {
                saleMin = month;
            }
            month = month + 1;
        }
        return saleMin + 1;

    }

    public int monthSalesLow(int[] sales) {  //Месяцы, в которых продажи были ниже среднего
        int monthLow = 0;
        for (int sale : sales) {
            if (sale < middleSumSales(sales)) {
                monthLow += 1;
            }
        }
        return monthLow;
    }

    public int monthSalesHigh(int[] sales) {  //Месяцы, в которых продажи были выше среднего
        int monthHigh = 0;
        for (int sale : sales) {
            if (sale > middleSumSales(sales)) {
                monthHigh += 1;
            }
        }
        return monthHigh;
    }
}
