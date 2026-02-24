class InvalidMarksException extends Exception {

    public InvalidMarksException(String m){
        super(m);
    }
}

class Student{

    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void assignGrade() throws InvalidMarksException {

        if(marks < 0 || marks > 100){
            throw new InvalidMarksException("Marks should be between 0 and 100");
        }

        if(marks >= 90){
            System.out.println("Grade is A");
        }
        else if(marks >= 80){
            System.out.println("Grade is B");
        }
        else if(marks >= 50){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Fail!!");
        }
    }
}

public class Sn7{

    public static void main(String[] args){

        Student s = new Student("Shriya", 200);

        try{
            s.assignGrade();
        }
        catch(InvalidMarksException e){
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}