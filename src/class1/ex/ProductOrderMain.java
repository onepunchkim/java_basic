package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder orderr1 = new ProductOrder();
        orderr1.productName = "두부";
        orderr1.price = 2000;
        orderr1.quantity = 2;
        orders[0] = orderr1;

        ProductOrder orderr2 = new ProductOrder();
        orderr2.productName = "김치";
        orderr2.price = 5000;
        orderr2.quantity = 1;
        orders[1] = orderr2;

        ProductOrder orderr3 = new ProductOrder();
        orderr3.productName = "콜라";
        orderr3.price = 1500;
        orderr3.quantity = 2;
        orders[2] = orderr3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
