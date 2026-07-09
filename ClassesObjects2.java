/* 
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
*/

/* 

class Array1 {

    public static void main(String args[]) {

        int arr[] = {10,20,30,40,50};

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }

    }
}*/

//Program 2: Sum of Array
/* 
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
    */
/* 
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
*/


//Program 2
/*
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
    */

//22. Jagged Arrays
//Program 1
/* 
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
    */
/* 
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
*/
 
/* 
class EnhancedFor1 {

    public static void main(String args[]) {

        int arr[] = {10,20,30,40};

        for(int num : arr){

            System.out.println(num);

        }

    }
}*/ 
//Program 2
/* 
class EnhancedFor2 {

    public static void main(String args[]) {

        String names[]={"Laksh","Rahul","Amit"};

        for(String s:names){

            System.out.println(s);

        }

    }
}*/

//24. Strings
//Program 1
/* 
class String1 {

    public static void main(String args[]) {

        String name = "Laksh";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());

    }
}
    */

//Program 2
/* 
class String2 {

    public static void main(String args[]) {

        String str = "Java Programming";

        System.out.println(str.substring(5));

        System.out.println(str.contains("Java"));

    }
}
    */

 
//25. StringBuffer
//Program 1
/* 
class StringBuffer1 {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");

        System.out.println(sb);

    }
}
    *//* 
class StringBuffer2 {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.insert(5," Java");

        System.out.println(sb);

    }
}*/

//26. StringBuilder
//Program 1
/* 
class StringBuilder1 {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Core");

        sb.append(" Java");

        System.out.println(sb);

    }
}*/
 /* 
//Program 2
class StringBuilder2 {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Programming");

        sb.reverse();

        System.out.println(sb);

    }
}
*/

class Student  {

    int rollNo;
    String name;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
/*
public class ClassesObjects1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Laksh";

        s1.display();

    }
}
*/

class Car {

    String brand;

    void start() {
        System.out.println(brand + " is Starting...");
    }
}

public class ClassesObjects2 {

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "BMW";

        c.start();

    }
}
/* 
28. Constructors
Program 1: Default Constructor
class Student {

    Student() {
        System.out.println("Default Constructor Called");
    }
}

public class Constructor1 {

    public static void main(String[] args) {

        Student s = new Student();

    }
}
Program 2: Parameterized Constructor
class Student {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println(id + " " + name);

    }
}

public class Constructor2 {

    public static void main(String[] args) {

        Student s = new Student(101,"Laksh");

        s.display();

    }
}
29. this Keyword
Program 1
class Student {

    int id;

    Student(int id) {

        this.id = id;

    }

    void show() {

        System.out.println(id);

    }
}

public class This1 {

    public static void main(String[] args) {

        Student s = new Student(10);

        s.show();

    }
}
Program 2
class Student {

    void display() {

        System.out.println(this);

    }
}

public class This2 {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s);

        s.display();

    }
}
30. super Keyword
Program 1: Access Parent Variable
class Animal {

    String color = "White";

}

class Dog extends Animal {

    String color = "Black";

    void printColor() {

        System.out.println(super.color);
        System.out.println(color);

    }
}

public class Super1 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.printColor();

    }
}
Program 2: Call Parent Constructor
class Animal {

    Animal() {

        System.out.println("Animal Constructor");

    }

}

class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Dog Constructor");

    }

}

public class Super2 {

    public static void main(String[] args) {

        new Dog();

    }
}
31. Static Variable
Program 1
class Student {

    int roll;
    static String college = "Bharati Vidyapeeth";

}

public class StaticVariable1 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll = 1;
        s2.roll = 2;

        System.out.println(s1.roll + " " + Student.college);
        System.out.println(s2.roll + " " + Student.college);

    }
}
Program 2
class Counter {

    static int count = 0;

    Counter() {

        count++;

    }

}

public class StaticVariable2 {

    public static void main(String[] args) {

        new Counter();
        new Counter();
        new Counter();

        System.out.println(Counter.count);

    }
}
32. Static Method
Program 1
class Demo {

    static void message() {

        System.out.println("Welcome");

    }

}

public class StaticMethod1 {

    public static void main(String[] args) {

        Demo.message();

    }
}
Program 2
class MathDemo {

    static int square(int n) {

        return n * n;

    }

}

public class StaticMethod2 {

    public static void main(String[] args) {

        System.out.println(MathDemo.square(5));

    }
}
33. Static Block
Program 1
class Demo {

    static {

        System.out.println("Static Block Executed");

    }

    public static void main(String[] args) {

        System.out.println("Main Method");

    }
}
Program 2
class Test {

    static {

        System.out.println("First Static Block");

    }

    static {

        System.out.println("Second Static Block");

    }

    public static void main(String[] args) {

        System.out.println("Program Started");

    }
}
34. Encapsulation
Program 1
class Student {

    private int roll;

    public void setRoll(int roll) {

        this.roll = roll;

    }

    public int getRoll() {

        return roll;

    }

}

public class Encapsulation1 {

    public static void main(String[] args) {

        Student s = new Student();

        s.setRoll(101);

        System.out.println(s.getRoll());

    }
}
Program 2
class Employee {

    private double salary;

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public double getSalary() {

        return salary;

    }

}

public class Encapsulation2 {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setSalary(50000);

        System.out.println(e.getSalary());

    }
}
35. Inheritance
Program 1: Single Inheritance
class Animal {

    void eat() {

        System.out.println("Eating");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Barking");

    }

}

public class Inheritance1 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();

    }
}
Program 2: Multilevel Inheritance
class Animal {

    void eat() {

        System.out.println("Eating");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Barking");

    }

}

class Puppy extends Dog {

    void play() {

        System.out.println("Playing");

    }

}

public class Inheritance2 {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();

    }
}
36. Method Overriding
Program 1
class Animal {

    void sound() {

        System.out.println("Animal Sound");

    }

}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog Barks");

    }

}

public class Overriding1 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }
}
Program 2
class Bank {

    int rate() {

        return 5;

    }

}

class SBI extends Bank {

    @Override
    int rate() {

        return 7;

    }

}

public class Overriding2 {

    public static void main(String[] args) {

        SBI s = new SBI();

        System.out.println(s.rate());

    }
}
37. Packages
Program 1
package mypack;

public class Demo {

    public void show() {

        System.out.println("Package Example");

    }

}
Program 2 (Use the package)
import mypack.Demo;

public class PackageTest {

    public static void main(String[] args) {

        Demo d = new Demo();

        d.show();

    }
}
38. Access Modifiers
Program 1: Public
class Demo {

    public int number = 100;

}

public class Access1 {

    public static void main(String[] args) {

        Demo d = new Demo();

        System.out.println(d.number);

    }
}
Program 2: Private
class Demo {

    private int number = 100;

    public int getNumber() {

        return number;

    }

}

public class Access2 {

    public static void main(String[] args) {

        Demo d = new Demo();

        System.out.println(d.getNumber());

    }
}
*/