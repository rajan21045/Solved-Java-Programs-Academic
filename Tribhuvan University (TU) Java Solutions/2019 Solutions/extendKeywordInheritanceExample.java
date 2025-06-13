/*
Question:
Write a Java program to demonstrate the use of the `extends` keyword.
Create a superclass `Animal` with a method `sound()`.
Then, create a subclass `Monkey` that extends `Animal`, overrides the method, and adds its own method.
*/

public class extendKeywordInheritanceExample {

    // Superclass
    static class Animal {
        public void sound() {
            System.out.println("Hello, it is an animal sound.");
        }
    }

    // Subclass
    static class Monkey extends Animal {
        @Override
        public void sound() {
            System.out.println("Monkey is making a sound.");
        }

        public void climb() {
            System.out.println("Monkey is climbing.");
        }
    }

    public static void main(String[] args) {
        Monkey mon = new Monkey();
        mon.sound();   // Calls overridden method
        mon.climb();   // Calls subclass method
    }
}
