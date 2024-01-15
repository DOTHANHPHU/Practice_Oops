package com.example.oop_kteam.L18.mypack;

// Protected
public class Person {
    protected String name;
    protected int age;
    protected float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    protected void eat(String foodName) {
        System.out.println(name + " is eating "+ foodName);
    }

    protected int getAge() {
        return age;
    }

    protected float getHeight() {
        return height;
    }

    // Protected là phạm vi truy cập có thể từ trong và ngoài package, nhưng phải thông qua tính kế thừa.
    // Protected chỉ có thể áp dụng bên trong class như thuộc tính, phương thức hay lớp con.
    // Không thể áp dụng cho lớp ngoài hay interface.
}
