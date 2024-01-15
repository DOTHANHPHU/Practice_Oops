package com.example.oop_kteam.L20.Travedoituong_Instance;

// Trả về đối tượng (instance) của lớp hiện tại

// Ta sẽ trả về instance của lớp hiện bằng từ khóa this như sau:
public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // trả về instance của lớp hiện bằng từ khóa this
    public Person getInstance() { // getInstance từ class Person nên phải trả về this là trả về chính class đó
        return this;
    }
}
