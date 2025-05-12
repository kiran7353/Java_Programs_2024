package RecentlyAsked_InterviewProgramms;

public class PgmToCoverAllOOPsConcepts {
    public static void main(String[] args) {
        // Creating an object of the class
        PgmToCoverAllOOPsConcepts obj = new PgmToCoverAllOOPsConcepts();

        // Calling the method to demonstrate encapsulation
        obj.showEncapsulation();

        // Calling the method to demonstrate inheritance
        obj.showInheritance();

        // Calling the method to demonstrate polymorphism
        obj.showPolymorphism();

        // Calling the method to demonstrate abstraction
        obj.showAbstraction();
    }

    private void showAbstraction() {
        // Abstraction: Hiding the complex implementation details and showing only the essential features of the object.
        abstract class Animal {
            abstract void sound();
        }

        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
        }

        class Cat extends Animal {
            void sound() {
                System.out.println("Cat meows");
            }
        }

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows
    }

    private void showPolymorphism() {
        // Polymorphism: The ability of different classes to be treated as instances of the same class through a common interface.
        class Animal {
            void sound() {
                System.out.println("Animal makes sound");
            }
        }

        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
        }

        class Cat extends Animal {
            void sound() {
                System.out.println("Cat meows");
            }
        }

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows
    }

    private void showInheritance() {
        // Inheritance: A mechanism where a new class is derived from an existing class.
        class Parent {
            void display() {
                System.out.println("Parent class method");
            }
        }

        class Child extends Parent {
            void display() {
                System.out.println("Child class method");
            }
        }

        Child child = new Child();
        child.display(); // Calls the overridden method in Child
    }

    private void showEncapsulation() {
        // Encapsulation: Hiding the internal state and requiring all interaction to be performed through an object's methods.
        class EncapsulatedClass {
            private int data;

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }
        }

        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setData(10);
        System.out.println("Encapsulation: " + obj.getData());
    }
}
