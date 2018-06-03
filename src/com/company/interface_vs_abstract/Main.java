package com.company.interface_vs_abstract;

public class Main {
    public static void main(String[] args) {
    }
}
//interface -> interface = extends
//class -> class = extends
//interface -> class = implement
//class -> interface = compilation error!!


//Everything inside interface is PUBLIC!!
interface MyInterface {
    //Fields are constants
    void myInterfaceMethod();
}

interface MyInterface2 extends MyInterface {
    void myInterfaceMethod2();
}

abstract class MyAbstractClass extends Object implements MyInterface2 {
    //Fields are variables
    public MyAbstractClass() {
    }

    abstract void abstractMethod();

    @Override
    public String toString() {
        abstractMethod();
        return "MyAbstractClass{}";
    }
}

class MyClass /*extends Object */ {
    void method() {

    }

    public void myInterfaceMethod() {

    }

    public void myInterfaceMethod2() {

    }

    void abstractMethod() {

    }
}