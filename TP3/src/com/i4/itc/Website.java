package com.i4.itc;

public class Website {
    //fields (or instance variable)
    String webName;
    int webAge;

    //Constructor
    Website(String name, int age){
        this.webName = name;
        this.webAge = age;
    }
    public static void main(String [] argr){
        //Create object
        Website obj1 = new Website("Book",2);
        Website obj2 = new Website("Apple", 3);

        //Access object data through reference
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);

    }

}
