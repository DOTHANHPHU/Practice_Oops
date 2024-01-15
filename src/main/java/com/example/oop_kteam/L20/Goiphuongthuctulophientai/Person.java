package com.example.oop_kteam.L20.Goiphuongthuctulophientai;

// Gọi phương thức từ lớp hiện tại
// Ngoài gọi được thuộc tính, thì this có thể gọi đến phương thức từ lớp hiện tại.
//Ví dụ: viết phương thức trả thông tin Person và gọi mỗi lần khởi tạo đối tượng.
public class Person {

    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.getInfo();
    }

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
        System.out.println("----------------------------");
    }
}
