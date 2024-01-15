package com.example.oop_kteam.L17.Phuongthuckhoitao;

// Phương thức khởi tạo
public class Person2 {
    public String name;
    public int age;
    public float height;

    // this lúc này tượng trưng cho class Person2 => this.name là của Person2
    // còn = name ở sau là của phương thức Person2 tức đoạn code dòng 11
    public Person2(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(String foodName) {
        System.out.println(name + " is eating "+ foodName);
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }
}
