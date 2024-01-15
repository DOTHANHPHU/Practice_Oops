package com.example.oop_kteam.L20.Anhxadoituong;

// Ánh xạ đối tượng khi cần sử dụng
public class HelloWorld {
    public static void main(String[] args) {

        // khởi tạo đối tượng và in thông tin ra:
        Person a = new Person("Chau", 21, 1.7f);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.height);
    }
}
