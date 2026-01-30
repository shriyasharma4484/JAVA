final class FinalClass {
    void show() {
        System.out.println("This is a method in the final class");
    }
}

// class Subclass extends FinalClass { 
//     // ERROR: cannot inherit from final class
// }

public class f_v2 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.show();
    }
}
