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





class If2 {

    public static void main(String[] args) {

        int number = 15;

        if(number > 0)
            System.out.println("Positive Number");

    }
}
/* 
class IfElse1 {

    public static void main(String[] args) {

        int number = 25;

        if(number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
Program 2
class IfElse2 {

    public static void main(String[] args) {

        int marks = 40;

        if(marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }
}
10. Else-If Ladder
Program 1
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
Program 2
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