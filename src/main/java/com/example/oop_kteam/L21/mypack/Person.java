package com.example.oop_kteam.L21.mypack;

// LỚP CHA
// Ta thấy 2 lớp Person và Student có chung thuộc tính và phương thức.
// Khi dùng kế thừa Ta sẽ để nguyên code ở lớp Person lại:
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
