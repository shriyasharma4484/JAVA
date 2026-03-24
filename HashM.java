import java.util.HashMap;
public class HashM{
    public static void main(String[] args){
        HashMap<String, Integer > empId = new HashMap<>();
        empId.put("Shriya",101);
        empId.put("Aman",102);
        empId.put("Palak",103);
        System.out.println(empId);
        System.out.println(empId.get("Shriya"));
        System.out.println(empId.containsKey("SHRIYA"));//lowercase and uppercase matters
        System.out.println(empId.containsKey("Shriya"));
        System.out.println(empId.containsValue(102));
        empId.put("Shriya",105);
        System.out.println(empId);//it overrides the previous value of id of Shriya
        empId.replace("Shriya",108);
        empId.replace("Manya",109);//no change as Manya is not present in the map
        System.out.println(empId);
        empId.putIfAbsent("Shriya",110);
        System.out.println(empId);//no changes as Shriya is already present in the map
        empId.putIfAbsent("Anirudh",110);
        System.out.println(empId);//Anirudh will be added in the map
        empId.remove("Aman");
        System.out.println(empId);
    }
}