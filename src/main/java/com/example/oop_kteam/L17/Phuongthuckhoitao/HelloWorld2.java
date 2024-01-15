package com.example.oop_kteam.L17.Phuongthuckhoitao;

// Dùng cho Person2
public class HelloWorld2 {
    public static void main(String[] args) {
        Person2 a = new Person2("Phu", 21, 1.7f);
        a.eat("Rice");

        int age = a.getAge();
        System.out.println("His age: " + age);

        float height = a.getHeight();
        System.out.println("His height: " + height);
    }
}
