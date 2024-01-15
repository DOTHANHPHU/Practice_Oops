package com.example.oop_kteam.L22.UseSetGet;

// Vì ta đã chỉnh age sang private nên giờ chỉ có thể truy cập thông qua 2 phương thức này:
public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person("Chau", 21, 1.7f);
        System.out.println(a.getAge());

        a.setAge(22);
        System.out.println(a.getAge());

        a.setAge(-5);
        System.out.println(a.getAge());
    }
}
