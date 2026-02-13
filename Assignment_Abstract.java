abstract class FoodOrder {
    int orderId;
    String customerName;
    double amount;

    FoodOrder() {
        orderId = 0;
        customerName = "";
        amount = 0;
    }

    FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    void displayOrderDetails() {
        System.out.println("Order ID is: " + orderId);
        System.out.println("Customer Name is: " + customerName);
        System.out.println("Base Amount is: " + amount);
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {
    int tableNumber;
    double serviceCharge = 50;

    DineInOrder(int orderId, String customerName, double amount, int tableNumber) {
        super(orderId, customerName, amount);
        this.tableNumber = tableNumber;
    }

    void calculateBill() {
        double total = amount + serviceCharge;
        displayOrderDetails();
        System.out.println("Table Number is: " + tableNumber);
        System.out.println("Service Charge is: " + serviceCharge);
        System.out.println("Total Bill is: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    double packingCharge;

    TakeAwayOrder(int orderId, String customerName, double amount, double packingCharge) {
        super(orderId, customerName, amount);
        this.packingCharge = packingCharge;
    }

    void calculateBill() {
        double total = amount + packingCharge;
        displayOrderDetails();
        System.out.println("Packing Charge is: " + packingCharge);
        System.out.println("Total Bill is: " + total);
    }
}

class OnlineOrder extends FoodOrder {
    double deliveryCharge;

    OnlineOrder(int orderId, String customerName, double amount, double deliveryCharge) {
        super(orderId, customerName, amount);
        this.deliveryCharge = deliveryCharge;
    }

    void calculateBill() {
        double total = amount + deliveryCharge;
        displayOrderDetails();
        System.out.println("Delivery Charge is: " + deliveryCharge);
        System.out.println("Total Bill is: " + total);
    }
}

public class Assignment_Abstract {
    public static void main(String[] args) {

        DineInOrder d = new DineInOrder(1, "Shriya", 500, 10);
        TakeAwayOrder t = new TakeAwayOrder(2, "Rahul", 400, 30);
        OnlineOrder o = new OnlineOrder(3, "Riya", 600, 40);

        System.out.println("---- Dine In Order ----");
        d.calculateBill();

        System.out.println();

        System.out.println("---- Take Away Order ----");
        t.calculateBill();

        System.out.println();

        System.out.println("---- Online Order ----");
        o.calculateBill();
    }
}
