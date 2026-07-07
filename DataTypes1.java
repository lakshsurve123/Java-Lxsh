/*public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

/*class Age {
    public static void main(String args[]) {
        int age = 20;
        System.out.println(age);
    }
}
*/

/*public class Variables1 {
    public static void main(String[] args) {

        int age = 20;
        String name = "Laksh";
        double cgpa = 8.9;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

    }
}
*/

/*public class Variables2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
*/
/* 
public class DataTypes1 {

    public static void main(String[] args) {

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;

        float f = 10.5f;
        double d = 20.55;

        char ch = 'A';
        boolean status = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(status);

    }
}
*/


/* 
class DataTypes2 {

    public static void main(String[] args) {

        String name = "Laksh";
        int roll = 25;
        float marks = 91.5f;

        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);

    }
}
*/
/* 
class Literal1 {

    public static void main(String[] args) {

        int num = 100;
        double pi = 3.14;
        char grade = 'A';
        String city = "Mumbai";

        System.out.println(num);
        System.out.println(pi);
        System.out.println(grade);
        System.out.println(city);

    }
}
*/

/* 
class Literal2 {

    public static void main(String[] args) {

        int binary = 0b1010;
        int hex = 0xA;
        int octal = 012;

        System.out.println(binary);
        System.out.println(hex);
        System.out.println(octal);

    }
} 
*//* 
class TypeConversion1 {

    public static void main(String[] args) {

        int a = 50;

        double b = a;

        System.out.println(a);
        System.out.println(b);

    }
} 
*//* 
class TypeConversion2 {

    public static void main(String[] args) {

        double d = 15.87;

        int i = (int)d;

        System.out.println(d);
        System.out.println(i);

    }
} */
/* 
class Assignment1 {

    public static void main(String[] args) {

        int a = 10;

        a += 5;

        System.out.println(a);

    }
}
*/
/* 
class Baby  {

    public static void main(String[] args) {

        int a = 20;

        a *= 3;

        System.out.println(a);

    }
}
*/

/* 
class Relational1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);

    }
} 
*/


/* 
class Relational2 {

    public static void main(String[] args) {

        int x = 50;
        int y = 50;

        System.out.println(x == y);
        System.out.println(x != y);

    }
}*/
/* 
class Logical1 {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age > 18 && age < 30);

    }

}
    */



/* 
class Logical2 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a || b);
        System.out.println(!a);

    }
}
*/

/* 
class If1 {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 18)
            System.out.println("Eligible to Vote");

    }
}
    */




/* 
class If2 {

    public static void main(String[] args) {

        int number = 15;

        if(number > 0)
            System.out.println("Positive Number");

    }
}

*/

 /* 
class IfElse1 {

    public static void main(String[] args) {

        int number = 25;

        if(number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}*/
/* Program 2 

class IfElse2 {

    public static void main(String[] args) {

        int marks = 40;

        if(marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }
}

*/

/* 
class ElseIf1 {

    public static void main(String[] args) {

        int marks = 82;

        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 75)
            System.out.println("Grade B");
        else if(marks >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

    }
}
    */
/* 
class ElseIf2 {

    public static void main(String[] args) {

        int a = 20;
        int b = 40;
        int c = 30;

        if(a > b && a > c)
            System.out.println("A is Largest");
        else if(b > c)
            System.out.println("B is Largest");
        else
            System.out.println("C is Largest");

    }
}
*/
/* 
18. Methods
Program 1: Method Without Return Value
*/
/* 
class Methods1 {

    void greet() {
        System.out.println("Welcome to Java");
    }

    public static void main(String args[]) {

        Methods1 obj = new Methods1();

        obj.greet();

    }
}*/

//Program 2: Method With Return Value
/* 
class Methods2 {

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {

        Methods2 obj = new Methods2();

        int result = obj.add(20, 30);

        System.out.println("Sum = " + result);

    }
}
*/    
//19. Method Overloading
//Program 1
 
class Overloading1 {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {

        Overloading1 obj = new Overloading1();

        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));

    }
}
/* 
Program 2
class Overloading2 {

    void display() {
        System.out.println("No Parameter");
    }

    void display(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String args[]) {

        Overloading2 obj = new Overloading2();

        obj.display();
        obj.display("Laksh");

    }
}
20. Arrays
Program 1: Print Array
class Array1 {

    public static void main(String args[]) {

        int arr[] = {10,20,30,40,50};

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }

    }
}
Program 2: Sum of Array
class Array2 {

    public static void main(String args[]) {

        int arr[] = {5,10,15,20};

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            sum += arr[i];

        }

        System.out.println("Sum = " + sum);

    }
}
21. 2D Arrays
Program 1
class TwoDArray1 {

    public static void main(String args[]) {

        int arr[][] = {
                {1,2},
                {3,4}
        };

        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }

    }
}
Program 2
class TwoDArray2 {

    public static void main(String args[]) {

        int arr[][] = {
                {10,20,30},
                {40,50,60}
        };

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");

            }

            System.out.println();

        }

    }
}
22. Jagged Arrays
Program 1
class JaggedArray1 {

    public static void main(String args[]) {

        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];

        arr[0][0]=10;
        arr[1][2]=50;
        arr[2][1]=30;

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");

            }

            System.out.println();

        }

    }
}
Program 2
class JaggedArray2 {

    public static void main(String args[]) {

        int arr[][] = {
                {1,2},
                {3,4,5},
                {6}
        };

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");

            }

            System.out.println();

        }

    }
}
23. Enhanced For Loop
Program 1
class EnhancedFor1 {

    public static void main(String args[]) {

        int arr[] = {10,20,30,40};

        for(int num : arr){

            System.out.println(num);

        }

    }
}
Program 2
class EnhancedFor2 {

    public static void main(String args[]) {

        String names[]={"Laksh","Rahul","Amit"};

        for(String s:names){

            System.out.println(s);

        }

    }
}
24. Strings
Program 1
class String1 {

    public static void main(String args[]) {

        String name = "Laksh";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());

    }
}
Program 2
class String2 {

    public static void main(String args[]) {

        String str = "Java Programming";

        System.out.println(str.substring(5));

        System.out.println(str.contains("Java"));

    }
}
25. StringBuffer
Program 1
class StringBuffer1 {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");

        System.out.println(sb);

    }
}
Program 2
class StringBuffer2 {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.insert(5," Java");

        System.out.println(sb);

    }
}
26. StringBuilder
Program 1
class StringBuilder1 {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Core");

        sb.append(" Java");

        System.out.println(sb);

    }
}
Program 2
class StringBuilder2 {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Programming");

        sb.reverse();

        System.out.println(sb);

    }
}
    */