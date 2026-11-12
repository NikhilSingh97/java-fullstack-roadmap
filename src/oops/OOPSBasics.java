//1. OOPS – Object-Oriented Programming
//OOPS is a programming approach in which we write programs using Classes and Objects.
//
//Java has four main pillars of OOPS:
//1. Encapsulation
//2. Inheritance
//3. Polymorphism
//4. Abstraction

package oops;

// Class
class Student {

    // Properties / Variables
    String name;
    int age;
    String city;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

// Main class
public class OOPSBasics {

    public static void main(String[] args) {

        // Creating first object
        Student student1 = new Student();

        student1.name = "Nikhil";
        student1.age = 32;
        student1.city = "Ranchi";

        // Calling method
        student1.displayDetails();

        System.out.println("----------------");

        // Creating second object
        Student student2 = new Student();

        student2.name = "Rahul";
        student2.age = 25;
        student2.city = "Patna";

        student2.displayDetails();
    }
}
