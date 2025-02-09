//WAP that import the user define package and access the member variavle of classes that contained by package.
package src; // Main class package

import myPackage.Person; // Importing the user-defined package

public class IAP {
    public static void main(String[] args) {

        Person person1 = new Person("Alice", 25);

        System.out.println("Before modification:");
        person1.displayInfo();

        person1.name = "Bob";

        person1.setAge(30);

        System.out.println("\nAfter modification:");
        person1.displayInfo();
    }
}