package com.company;

import java.util.function.Predicate;

public class Letters {

    public static void main(String[] args) {
        /*A a = new C();
        a.print();

        a.methodInClass_A();

        a.methodInClass_B();
        a.methodInClass_C();
        */

        C c = new C();
        c.methodInClass_C();
        c.methodInClass_B();
        c.methodInClass_A();

        /**
         * Реализация из С (из того, кому сделали new)
         * Зона видимости из А
         */
      //var    реализация
//        Predicate p = new A();
//        p.methodInClass_A();

//        A a = new C();
//        a.methodInClass_A();
//        a.methodInClass_B();
//        a.methodInClass_C();

//        A a = new B();
//        a.print();
        System.out.println();
        System.out.println();
        System.out.println();

        A b = new C();
        b.print();
    }
}


class A implements Predicate/* extend Object */ {
    public A() {
        super();
        System.out.println("A");
    }

    @Override
    public boolean test(Object o) {
        return false;
    }

    public void print() {
        System.out.println("A.print");
    }

    public void methodInClass_A() {
        System.out.println("A.methodInClass_A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }


    @Override //-> переодределять
    public void print() {
        System.out.println("B.print");
    }

    public void methodInClass_B() {
        System.out.println("B.b");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("C");
    }

    @Override
    public void print() {
        System.out.println("C.print");
    }

    public void methodInClass_C() {
        System.out.println("C.c");
    }
}