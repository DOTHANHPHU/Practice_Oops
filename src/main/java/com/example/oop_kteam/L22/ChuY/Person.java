package com.example.oop_kteam.L22.ChuY;

// Như ở bài giải thích về hướng đối tượng, thì lớp cũng chính là kiểu dữ liệu do ta tự định nghĩa ra.
// Vì nó là kiểu dữ liệu tham chiếu, có những lúc lớp ta viết sẽ nằm trong tham số phương thức Getter và Setter.

// viết phương thức clone() trong lớp Person như sau:
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

    public Person clone() {
        Person other = new Person(this.name, this.age, this.height);
        return other;
    }

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
    }
}

// Bản chất trong phương thức clone(), ta chỉ tạo một đối tượng mới (v khi khởi tạo, Java sẽ cung cấp 1 bộ nhớ khác) và trả nó về

