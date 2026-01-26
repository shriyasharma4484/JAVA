//public class Sam{
//     public static void main(String[] args){
//         String a="10";
//         System.out.println(a);
//         int b=Integer.parseInt(a);
//         System.out.println(b);
//         char c='a';
//         int d =(int)c+10;
//         char e=(char)d;
//         System.out.println(d);
//         float k =6.5f;
//         System.out.println(k);

//20/01/26

// class Final_Var{
//     public static void main(String args[]){
//         final int a=20;
//         a=22;
//         System.out.println(a);
//     }
// }

// class Display_var{
//     public static void main(String args[]){ //string is a class in java, no need of operator overloading for the addition, we can simply add
//         String fName="SIT ";
//         String IName="College";
//         String fullName=fName+IName;       //here we used the + operator for two ways:addtion and concatenation
//         System.out.println(fullName);

//         int x=5; 
//         int y=6;System.out.println(x+y);
//         int a=66,b=45,c=6; //we wrote more than one variable in one line and also declare them
//         System.out.println(a+b+c);

//     }
// }


// class Student{
//     public static void main(String[] args){
//         String studentName="Shriya Sharma";
//         int studentId=258;
//         int studentAge=23;
//         float studentFee=72.45f;
//         char studentGrade='A';



//         System.out.println("Student name:"+studentName);
//         System.out.println("Student id:"+studentId);
//         System.out.println("Student age:"+studentAge);
//         System.out.println("Student fee:"+studentFee);
//         System.out.println("Student grade:"+studentGrade);
//         }
// }

// class Area{
//     public static void main(String[]args){
//         int len=4;
//         int width=6;
//         int area;
//         area=len*width;
//         System.out.println("length:"+len);
//         System.out.println("width:"+width);
//         System.out.println("area:"+area);

//     }
// }
      //NARWOING CASTING:
// class Casting{
//     public static void main(String[]args){
//         double x=7.8d;
//         int y=(int)x;
//         System.out.println(y);
//     }
// }


//WIDENING CASTING
// class Tcast{
//     public static void main(String[]args){ //we may loose the data in narowing casting but not in widening casitng
//         int var=3;
//         float myvar=var;
//         System.out.println(myvar);
//         System.out.println(var);
//     }
// }

// class inc{
//     public static void main(String[]args){
//         int a=5;
//         int b=5;
//         int pre=++a;
//         int post=b++;
//         System.out.println("pre vlaue:"+pre);
//         System.out.println("after preinc"+a);
//         System.out.println("before post:"+post);
//         System.out.println("post inc:"+b);
//     }
// }


// class Comp{
//     public static void main(String[] args){
//         int x=5;
//         int y=3;
//         System.out.println(x==y);
//     }
// }


// class Test{
//     public static void main(String[]args){
//         int a=60;
//         int b=13;
//         int c= 0;
//         c=a&b;   //1&1=1 otherwisw 0
//         System.out.println("a & b:"+c);
//         c=a|b;   //1|1=1,1|0=0,0|1=0,0|0=0;
//         System.out.println("a|b:"+c);

//     }
// }

//23/01/26:

// public class Sam{
//     public static void main(String[]args){
//         int a,b;
//         a=10;
//         b=(a==1)?20:30;
//         System.out.println("value of b is:"+b);
//         b=(a==10)?20:30;
//         System.out.println("b is:"+b);
//     }
// }

// public class Sam{
//     public static void main(String[]args){
//         String name="SIT";
//         boolean result= name instanceof String;
//         System.out.println(result);
//     }
// }

// import java.util.Scanner;
// public class Sam{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first number:");
//         int num1=sc.nextInt();
//         System.out.println("enter the second number :");
//         int num2=sc.nextInt();
//         int sum=num1+num2;
//         System.out.println("sum of numbers is :"+sum);



//     }
// }

// import java.util.Scanner;
// public class Sam{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the length of the rectangle:");
//         int l=sc.nextInt();
//         System.out.println("enter width");
//         int b=sc.nextInt();
//         int area=l*b;
//         System.out.println("Area is :"+area);
    
//     }
// }

//for loop:
// class Sam{
//     public static void main(String[]args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             System.out.println("Java is fun!!");
//         }

//     }
// }

//while loop:
// class Sam{
//     public static void main(String[]args){
//         int i=0;
//         while(i<=5){

//             System.out.println("Java is fun!!");
//         }

//     }
// }

//do while loop
// class Sam{
//     public static void main(String[]args){
//         int i=0;
//         do{
//             System.out.println("Java is fun!!");
//             i++;
//         }while(i<=5);

//     }
// }

//BREAK 
// import java.util.Scanner;
// class Sam{
//     public static void main(String[]args){
//          Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//          System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         sc.nextLine();
    
//         System.out.println("Enter the operator:");

//         String op=sc.nextLine();

//         double result;

//         switch(op){
//             case "+":
//             result=num1+num2;
//             System.out.println(result);
//             break;

//             case "-":
//             result=num1-num2;
//             System.out.println(result);
//             break;
            
//             case "*":
//                 result=num1*num2;
//             System.out.println(result);
//             break;

//             case "/":
//                 if(num2!=0){
//                     result=num1/num2;
//                     System.out.println(result);
//                 }
//                 else{
//                     System.out.println("error!!");
//                 }
//                 break;
//             default:
//                 System.out.println("invalid operator!!");
//                 }
//                 sc.close();
//             }
//         }

//paramitrased constrcutor:

// class Stu{
//     String name;
//     int age;
//     Stu(String n , int a){
//         name=n;
//         age=a;
//     }
//     void display(){
//         System.out.println("name:"+name+"age:"+age);
//         }
//     }
//     public class Sam{
//         public static void main(String[]args){
//             Stu obj=new Stu("Allice",20);
//             obj.display();
//         }
//     }



//staitc variable in java :

// class Counter{
//     static int count=0;

//     Counter(){
//         count++;
//         System.out.println("object created, current counter:"+count);
//     }
// }
// public class Sam{
//     public static void main(String[]args){
//         Counter obj1= new Counter();
//             Counter obj2= new Counter();
//                 Counter obj3= new Counter();
//                 System.out.println("final count:"+Counter.count);

//     }
// }


// class Sam{
//     int id;//instance variable
//     String name;//instance variable
//     public static void main(String[]args){ 
//         Sam s1=new Sam();
//         s1.id=101;
//         s1.name="Alice";
//         System.out.println(s1.id+" "+s1.name);

//     }}

//STATIC METHOD:

// class Calculator{
//     static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[]args){
//         System.out.println("sum is:"+add(2,3));
//     }
//     }


// //MEMEORY
// class Sam{
//     int x ;//stored in heap
//     static int y;//stored in method area
//     public static void main(String[]args){
//         int z=10;//stored in stack
//     }

// }


//for primitive: copy of vlaue is passed
//for non primitve :copy of refernce is passed
//PASS BY VALUE
class Sam{
    void modify(int x){
        x=x+10;
    }
    public static void main(String[]args){
        int a=5;
        Sam obj=new Sam();
        obj.modify(a);
        System.out.println(a); //output is 5
    }
  }




















        




