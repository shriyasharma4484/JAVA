class Order {
    int orderId;
    String orderDate;

    Order() {
        orderId = 0;
        orderDate = "";
    }

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayOrder() {
        System.out.println("Order ID is: " + orderId);
        System.out.println("Order Date is: " + orderDate);
    }
}

class OnlineOrder extends Order {
    String deliveryAddress;

    OnlineOrder() {
        super();
        deliveryAddress = "";
    }

    OnlineOrder(int orderId, String orderDate, String deliveryAddress) {
        super(orderId, orderDate);
        this.deliveryAddress = deliveryAddress;
    }

    void displayOnlineOrder() {
        displayOrder();
        System.out.println("Delivery Address is: " + deliveryAddress);
    }
}

class InternationalOrder extends OnlineOrder {
    double customDuty;
    double totalAmount;

    InternationalOrder() {
        super();
        customDuty = 0;
    }

    InternationalOrder(int orderId, String orderDate,
                       String deliveryAddress, double customDuty, double totalAmount) {
        super(orderId, orderDate, deliveryAddress);
        this.customDuty = customDuty;
        this.totalAmount = totalAmount;
    }

    void calculateTotalWithDuty() {
        totalAmount = totalAmount + customDuty;
    }

    void displayInternationalOrder() {
        displayOnlineOrder();
        System.out.println("Custom Duty is: " + customDuty);
        System.out.println("Total Amount with Duty is: " + totalAmount);
    }
}

public class Assignment_2B {
    public static void main(String[] args) {

        InternationalOrder obj = new InternationalOrder(
                101,
                "13-02-2026",
                "Delhi, India",
                500,
                5000
        );

        obj.calculateTotalWithDuty();
        obj.displayInternationalOrder();
    }
}
