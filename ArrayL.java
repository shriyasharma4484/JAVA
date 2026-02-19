import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Guava");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");

        System.out.println("Fruits after removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size());

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
    }
}
