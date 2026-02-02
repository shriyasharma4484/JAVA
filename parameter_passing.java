class Student{
    int marks;

    Student(int marks){
        this.marks = marks;
    }
}

public class parameter_passing {

    static void updateM1(int m){
        m = m + 10;
        System.out.println("inside method updated marks: " + m);
    }

    static void updateM2(Student s){
        s.marks = s.marks + 10;
        System.out.println("inside method updated marks by object: " + s.marks);
    }

    public static void main(String[] args){

        Student s1 = new Student(50);
        int m = 80;

        System.out.println("before method call marks m: " + m);

        updateM1(m);

        System.out.println("after method call marks m: " + m);

        updateM2(s1);

        System.out.println("after method call marks by object: " + s1.marks);
    }
}
