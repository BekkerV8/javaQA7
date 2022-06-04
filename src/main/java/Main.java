import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж составила: " + service.totalSum(sales));
        System.out.println("Средняя сумма продаж в месяц составила: " + service.middleSumSales(sales));
        System.out.println(service.monthSalesMax(sales) + " месяц, в котором был пик продаж");
        System.out.println(service.monthSalesMin(sales) + " месяц, в котором был минимум продаж");
        System.out.println(service.monthSalesLow(sales) + " месяцев, в которых продажи были ниже среднего");
        System.out.println(service.monthSalesHigh(sales) + " месяцев, в которых продажи были выше среднего");

    }

}
