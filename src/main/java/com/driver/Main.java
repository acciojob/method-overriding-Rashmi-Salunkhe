package com.driver;

// Task 1: Create a class A with a method named meth returning a string
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Task 3 & 5: Create an object of class B and call method meth
public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B objB = new B();
        
        // Task 3: Call method meth of class A with object of class B
        System.out.println(objB.meth()); // This will call the overridden method
        
        // If you specifically want to call the superclass method:
        System.out.println(((A) objB).meth()); // Explicitly calls meth from class A (before overriding in B)
    }
}
