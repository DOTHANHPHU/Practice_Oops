package com.example.oop_kteam.L23.Overriding;

// Chưa chống Overriding
public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
    }
}

// -------------------------------------------------------
// Cách chống Overriding
// Nếu không muốn lớp con có thể Overriding lại phương thức nào đó, ta sẽ sử dụng từ khóa final
//public class Person {
//    public String name;
//    public int age;
//    public float height;
//
//    public Person(String name, int age, float height) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//    }
//
//    public final void getInfo() {
//        System.out.println("Name:"+this.name);
//        System.out.println("Age:"+this.age);
//        System.out.println("Height:"+this.height);
//    }
//}