package com.example.oop_kteam.L16;

// Java Oops
public class OopJava {
    public static void main(String[] args) {

        // Code bình thường
        String name;
        float height;
        int age;
        name = "Thanh Phu";
        height = 1.7f;
        age = 21;
        System.out.println(name);
        System.out.println(height);
        System.out.println(age);

        System.out.println("=====================================================");
        System.out.println("OOP JAVA");

        // Chuyển sang oop
        // tạo đối tượng a thuộc lớp(class) con người.
        Person a = new Person();

        // Cú pháp: <đối tượng>.<thuộc tính> = <giá trị>;
        a.name1 = "Thanh Phu";
        a.height1 = 1.7f;
        a.age1 = 21;
        System.out.println(a.name1);
        System.out.println(a.height1);
        System.out.println(a.age1);

    }
}
