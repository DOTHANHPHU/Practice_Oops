package com.example.oop_kteam.L18;

import com.example.oop_kteam.L18.mypack.Person;

// Để truy cập được Person, ta sẽ cho class HelloWorld kế thừa class Person. dùng extends
// Rồi sẽ tạo đối tượng HelloWorld trong main:
public class HelloWorld extends Person{

    protected HelloWorld(String name, int age, float height) {
        //phương thức khởi tạo HelloWorld sẽ gọi phương thức Person
        super(name, age, height);
    }

    public static void main(String[] args) {
        // tạo đối tượng HelloWorld trong main:
        HelloWorld a = new HelloWorld("Phu", 21, 1.7f);
        a.eat("Rice");

        int age = a.getAge();
        float height = a.getHeight();
        System.out.println("His age: " + age);
        System.out.println("His height: " + height);

    }
}
