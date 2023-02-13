import java.util.*;

public class Person {
    static String name = null;
    static String address = null;
    static int age = 0;

    // private static final String name = null;
    // private static final String age = null;
    // private static final String address = null;

    public static void read() {
        try (Scanner st = new Scanner(System.in)) {
            System.out.println("Enter the Name of the person: ");
            // this.name =
            name = st.next();
            System.out.println("Enter the Age of the Person: ");
            // this.age =
            age = st.nextInt();
            System.out.println("Enter the Adress of the Person: ");
            // this address =
            address = st.next();
        }

    }
    class Employee extends Person{
        

    }

    public static void display() {

        System.out.println("Name is " + name);
        System.out.println("Age of the person is: " + age);
        System.out.println("The address of the person is :" + address);
    }
    
    

    public static void main(String args[]) {
        read();
        display();
    }
}
