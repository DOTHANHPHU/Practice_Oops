package com.example.oop_kteam.L19.Taobientinh;

// Tạo biến tĩnh
public class Student {
    public String name;
    public int age;
    public float height;

    public static String universityName = "Kteam Education";
    public static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    // Ta dùng 2 biến tĩnh là universityNam và total,
    // mỗi khi tao khởi tạo một đối tượng của lớp Student, ta sẽ tăng giá trị total lên một đơn vị.
}
