class emp{
    String name;
    int age;
    float salary;

    emp(){
        name="";
        age=0;
        salary=0.0f;
    }
    emp(String name,int age,float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void display(){
        System.out.println("name is : "+name);
        System.out.println("age is : "+age);
        System.out.println("salary is : "+salary);
    }
}
public class employee{
    public static void main(String[]args){

    
    emp e=new emp("Shriya",19,50000.0f);
    emp e1=new emp("Reya",20,60000.0f);
    e.display();
    e1.display();
}
}

    

