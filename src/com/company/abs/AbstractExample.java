package com.company.abs;

public class AbstractExample {

    public static void main(String[] args) {
        A a = new C();
        a.print();
    }
}

/**
 * 1. Cannot create new A() (new to an abstract class)
 * 2. Abstract classes may contain abstract methods
 * 3. Abstract methods can be only in abstract classes!!
 * 4. Abstract methods cannot have body
 */
abstract class A {
    public A() {
        System.out.println("A");
    }

    abstract void print();
    abstract String getName();

    void printMyName() {
        System.out.println(getName());
    }
}

abstract class B extends A {
    public B() {
        super();
        System.out.println("B");
    }

    @Override
    String getName() {
        return "My name is Lenovo";
    }

    @Override
    void print() {
        System.out.println("I am B class. " + getName());
    }
}
class C extends B {
}