interface Discount {
    double calculateD(double amount);
}

class FestivalD implements Discount {
    double discount;

    public double calculateD(double amount) {
        discount = amount * 0.15;
        return amount - discount;
    }
}

class SeasonD implements Discount {
    double discount;

    public double calculateD(double amount) {
        discount = amount * 0.20;
        return amount - discount;
    }
}

class MemberD implements Discount {
    double discount;

    public double calculateD(double amount) {
        discount = amount * 0.45;
        return amount - discount;
    }
}

public class Interface2 {
    public static void main(String[] args) {

        Discount f = new FestivalD();
        Discount s = new SeasonD();
        Discount m = new MemberD();

        double amount = 1000;

        System.out.println("Festival Discount Final Amount: " + f.calculateD(amount));
        System.out.println("Seasonal Discount Final Amount: " + s.calculateD(amount));
        System.out.println("Member Discount Final Amount: " + m.calculateD(amount));
    }
}
