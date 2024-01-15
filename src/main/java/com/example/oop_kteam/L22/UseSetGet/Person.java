package com.example.oop_kteam.L22.UseSetGet;

// Cú pháp:
// Setter
// public void set<tên thuộc tính> (<tham số giá trị mới>) {
//
//      this. <tên thuộc tính> = <tham số giá trị mới>;
//
// }
//
// Getter
// <kiểu dữ liệu thuộc tính> get<tên thuộc tính> () {
//
//      return this. <tên thuộc tính>;
//
// }
// vd: tạo phương thức setter và getter cho thuộc tính age lớp Person
public class Person {

    public String name;
    private int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if (age>=0 && age<=100 ) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
    }
}
