package com.example.oop_kteam.L17.Phuongthuc;

// Dùng cho Person1
public class HelloWorld1 {
    public static void main(String[] args) {
        Person1 a = new Person1();
        a.name = "Phu";
        a.age = 21;
        a.height = 1.7f;

        a.eat("Rice");
        int age = a.getAge();
        System.out.println("His age:" + age);
    }
}
