import java.util.Vector;
public class V_ector{
    public static void main(String[]args){
        Vector<Integer> numbers = new Vector<>();
        numbers.add(100);
        numbers.add(200);
    numbers.add(300);
   System.out.println("Vecto "+numbers);
   numbers.remove(1);
   System.out.println("after removing "+ numbers);
   System.out.println("size :"+numbers.size());
   System.out.println("element at index 0:"+ numbers.get(0));
    }
}