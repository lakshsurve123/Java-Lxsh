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
/* 
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