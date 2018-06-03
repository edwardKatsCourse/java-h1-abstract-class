package com.company;

public class Parents /* extends Object */{

    /**
     * 1. Inheritance
     * 2. Abstract classes
     * 3. Static members
     *
     * this.    vs this()
     * super.   vs super()
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.javaH1Method();

        //List list = new ArrayList()
        //ArrayList list = new ArrayList()

        //Company company = new Layer()
        //Company company = new Representative()
        //Company company = new CEO()
        //Company company = new SubCEO()


        //Company company = new Company()

        /**
         * GrandParent = Object + GrandParent
         *
         * Parent = Object + GrandParent + Parent
         *
         * Child = Object + GrandParent + Parent + Child
         */

        Parent parent = new Child();
        parent.javaH1Method();




        GrandParent grandParent = new Child();
        grandParent.javaH1Method();

        GrandParent someParent = new Parent();
        GrandParent someChild = new Child();


    }
}
class GrandParent /* extends Object */ {
    public void javaH1Method() {}

    public GrandParent() {
    }
}

class Parent extends GrandParent {

    public Parent() {
        this("hello");
    }

    public Parent(String parentField) {
//        this();
    }

    public void parentMethod() {
    }
}

class Child extends Parent {
    private String name;

    public Child(String name) {
        this.name = name;
        this.parentMethod();
    }

    public void childMethod() {}

    public Child(int age) {
        super("methodInClass_A field for the parent");
    }

    public Child() {
//        this("David");
        //this("David" ,15); //String, int
    }
}


