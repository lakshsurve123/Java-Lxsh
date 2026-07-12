
 
//Program 2
/*class Employee {

    private double salary;

    public void setSalary(double salary) {
        

        this.salary = salary;

    }

    public double getSalary() {

        return salary;

    }

}

public class hero {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setSalary(50000);

        System.out.println(e.getSalary());

    }
}*/

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
/* 
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