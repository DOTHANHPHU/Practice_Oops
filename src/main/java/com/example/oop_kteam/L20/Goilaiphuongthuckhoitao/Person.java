package com.example.oop_kteam.L20.Goilaiphuongthuckhoitao;

// Gọi lại phương thức khởi tạo
// Khi dùng this() thì sẽ triệu hồi phương thức khởi tạo Constructor của lớp hiện tại.
// Thường được sử dụng trong việc có nhiều phương thức khởi tạo và muốn tái sự dụng code nhiều lần:
//
// Ví dụ: ta tạo 3 phương thức khởi tạo cho Person như sau
public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, float height) {
        this(name, age);
        this.height = height;
        this.getInfo();
    }

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
        System.out.println("--------------------------");
    }
}
