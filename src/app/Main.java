public class Main {
    public static void main(String[] args) {
        // Дані про товари
        String product1 = "smartphone";
        int quantity1 = 10;
        double price1 = 1215.34;
        String product2 = "laptop";
        int quantity2 = 7;
        double price2 = 1498.12;
        double totalSales1 = quantity1 * price1;
        double averageSales1 = totalSales1 / 5;
        double totalSales2 = quantity2 * price2;
        double averageSales2 = totalSales2 / 7;
        System.out.printf("Product No 1: %s%n", product1);
        System.out.printf("total sales for 5 days is EUR %.2f%n", totalSales1);
        System.out.printf("sales by day is EUR %.2f%n", averageSales1);
        System.out.printf("Product No 2: %s%n", product2);
        System.out.printf("total sales for 7 days is EUR %.2f%n", totalSales2);
        System.out.printf("sales by day is EUR %.2f%n", averageSales2);
    }
}